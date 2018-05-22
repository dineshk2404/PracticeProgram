package com.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.WeakHashMap;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class TestAnnonymousImpl {

	public static void main(String[] args) throws InterruptedException {
	
		Emp e1= new Emp(10,"emp1",14000);
		Emp e2= new Emp(102,"emp2",10520);
		Emp e3= new Emp(410,"emp3",431000);
		Emp e4= new Emp(03,"emp4",41000);
		List<Emp> listOfemps = new ArrayList<>();
		listOfemps.add(e1);listOfemps.add(e2);listOfemps.add(e3);listOfemps.add(e4);
		
		Collections.sort(listOfemps);
		
		System.out.println(listOfemps);
		List<Integer> nums = new ArrayList<>();
		nums.add(12);nums.add(3);nums.add(121);nums.add(11);
		Collections.sort(nums);
		System.out.println(nums);
		
		
		

		Emp1 m1= new Emp1(10,"emp1",14000);
		Emp1 m2= new Emp1(102,"emp2",10520);
		Emp1 m3= new Emp1(410,"emp3",431000);
		Emp1 m4= new Emp1(03,"emp4",41000);
		List<Emp1> mList = new ArrayList<>();
		mList.add(m1);mList.add(m2);mList.add(m3);mList.add(m4);
		Collections.sort(mList,new SalarySort()); //slow
		System.out.println("Salary based sorting-- "+listOfemps);
		
		
		Comparator<Emp1> sortBySalary = new Comparator<Emp1>(){
			@Override
			public int compare(Emp1 o1, Emp1 o2) {
				return o1.getEmpSalary()-o2.getEmpSalary();
			}
		};
		
		
		Comparator<Emp1> sortByName = new Comparator<Emp1>(){
			@Override
			public int compare(Emp1 o1, Emp1 o2) {
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
		};
		
		
		Collections.sort(mList,sortBySalary);//this is with annonymous impl
		System.out.println("sort by salary --Anny" +mList);
		Collections.sort(mList,sortByName); 
		System.out.println("sort by Name --Anny" +mList);
		
		
		
		HashMap<Emp1, String> hmap = new HashMap<>();
		hmap.put(m1, "A1");
	
		WeakHashMap<Emp1, String> wmap = new WeakHashMap<>();
		wmap.put(m1, "A1");
		
		m1=null;
		
		System.out.println(hmap.size()); //1
		
		for(int i=0;i<1000;i++){
			System.gc();
			Emp e = new Emp();
			e=null;
			Thread.sleep(1000);
			System.out.println(wmap.size()); //After GC -- weakhashmap removes weak key entries  -- 0
		}
		
		
		
		
		/**
		 * 
		 * hashamap
		 * 		-- If equals/hashcode overriden
		 * 					-- Domain object
		 * 		-- if not 
		 * 				-- Object class
		 * 		-- Map contract not violeted
		 * 		--16
		 * 		-- slow as compare identityHashmap
		 * 		--1.2
		 * IdentityHashmap
		 * 		-- if you overriden or not doesnt matter -- always == System.identityhashcode always
		 * 			which has impl given inside class itself
		 * 			-- Map contract  violeted  --bcoz you never have content equality
		 * 	so duplicate keys based on contents will never be removed
		 * 			-- 21
		 * 			-- fast as compare Hashmap
		 * 			--1.4
		 * 
		 */
		
		
	
		
		
	}
	
	
	
}


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
class Emp implements Comparable<Emp>{
	private int empId;
	private String empName;
	private int empSalary;

	
	
	@Override
	public int compareTo(Emp alelaOb) {
		//return this.empId-alelaOb.empId;
		return -(this.empName.compareTo(alelaOb.empName));
	}



	@Override
	public String toString() {
		return "\nEmp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
class Emp1{ 
	private int empId;
	private String empName;
	private int empSalary;



	@Override
	public String toString() {
		return "\nEmp1 [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}



class SalarySort implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		return o1.getEmpSalary()-o2.getEmpSalary();
	}
	
}

