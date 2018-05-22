package com.scp.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class TestCursors {
	public static void main(String[] args) {

		Emp e1 = new Emp(10,"Yogymax", 10000);
		Emp e2 = new Emp(11,"Yogy", 40000);
		Emp e3 = new Emp(13,"Yogymax2", 20000);
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);

		/*MyCollectionCursorImpl.iterateUsingIterator(emps);
		List<Emp> lEmps = new LinkedList<Emp>();
		lEmps.add(e1);
		lEmps.add(e2);
		lEmps.add(e3);
		MyCollectionCursorImpl.iterateUsingIterator(lEmps);
		
		Set<Emp> setOfemps = new HashSet<Emp>();
		setOfemps.add(e1);
		setOfemps.add(e2);
		setOfemps.add(e3);
		MyCollectionCursorImpl.iterateUsingIterator(setOfemps);
		
		HashMap<Emp, String> empMap = new HashMap<Emp, String>();
		empMap.put(e1,"Abc");
		empMap.put(e2,"fabc");
		empMap.put(e3,"aabc");
		
		MyCollectionCursorImpl.iterateUsingIterator(setOfemps);
		
		
		
		MyCollectionCursorImpl.iterateUsingListIterator(emps);;
		MyCollectionCursorImpl.iterateUsingListIterator(lEmps);
	//	MyCollectionCursorImpl.iterateUsingListIterator(setOfemps);
		
		*/
		
		
		
		
		HashMap<Emp, String> hmap = new HashMap<Emp, String>();
		hmap.put(e1,"employee1");
		hmap.put(e2,"employee12212");
		hmap.put(e3,"employee1");
		
		/*System.out.println("---using KeySet---");
		MyCollectionCursorImpl.iterateUsingIterator(hmap.keySet());*/
		
		/*System.out.println("---using EntrySet---");
		Set<Entry<Emp, String>> setOfEntries = hmap.entrySet();
		Iterator<Entry<Emp, String>> entryTypeItr=setOfEntries.iterator();
		while(entryTypeItr.hasNext()){
			Entry<Emp,String> entry = entryTypeItr.next();
			Emp e =entry.getKey();
			System.out.print("Value-- "+entry.getValue());
			System.out.print(" Id -- "+e.getEmpId());
			System.out.print(" Name -- "+e.getEmpName());
			System.out.println(" Salary -- "+e.getEmpSalary());
			System.out.println("--------------------------------------");
		}*/
		
		/*System.out.println("Using values....");
		Collection<String> collection = hmap.values();
		Iterator<String> itr = collection.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		
		
		
		Hashtable<Emp, String> htable = new Hashtable<Emp, String>();
		htable.put(e1,"employee1");
		htable.put(e2,"employee12212");
		htable.put(e3,"employee1");
	
		
		
		
		MyCollectionCursorImpl.usingEnumaration(emps);
		
		
		
		
		
	}
}

/**
 * 
 * Download Lombokjar (executable)  -- https://projectlombok.org/download
 * launch it 
 * Specify eclipse.exe location
 * finish it
 * 
 * Create Project
 * Add lombok.jar inside classpath of the project
 * 
 * @author Yogymax
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
class Emp{
	private int empId;
	private String empName;
	private int empSalary;
}


