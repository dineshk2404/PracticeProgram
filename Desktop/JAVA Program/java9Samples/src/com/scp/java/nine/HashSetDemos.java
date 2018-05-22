package com.scp.java.nine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class HashSetDemos {

	
	/**
	 * Duplicates are not allowed
	 * Seq order not preserved
	 * Null  -- Single is allowed
	 * 
	 */
	public static void main(String[] args) {
		Product123 p1 = new Product123(10,1000,"Product123one");//2
		Product123 p2 = new Product123(10,1000,"Product123one");//4
		Product123 p3= new Product123(11,2000,"1Product123one");//1
		Product123 p4 = new Product123(13,4000,"Product123tone2");//3
		Product123 p5=p1;
		
		HashSet<Product123> setOfProduct123s = new HashSet<>();
		setOfProduct123s.add(p1);
		setOfProduct123s.add(p2);
		setOfProduct123s.add(p3);
		setOfProduct123s.add(p4);
		setOfProduct123s.add(p5);
		//System.out.println(setOfProduct123s.size()); //4
		//Collections.sort(setOfProduct123s);
		
		
		ArrayList<Product123> listOfProduct123s = new ArrayList<>();
		listOfProduct123s.addAll(setOfProduct123s);
		//System.out.println(listOfProduct123s.size());
		//System.out.println(listOfProduct123s);
		
		System.out.println("UnSorted -- "+listOfProduct123s);
		
		Collections.sort(listOfProduct123s,new Product123SortByName());
	
		System.out.println("SortedByNAME -- "+listOfProduct123s);
		
		Collections.sort(listOfProduct123s,new PriceSort());
		
		System.out.println("SortedpRICE -- "+listOfProduct123s);
		
		HashSet<Integer> setOfNum = new HashSet<>();
		setOfNum.add(10);
		setOfNum.add(30);
		setOfNum.add(02);
		setOfNum.add(120);
		ArrayList<Integer> listOfnum = new ArrayList<>();
		listOfnum.addAll(setOfNum);
		Collections.sort(listOfnum);
		
		//System.out.println(setOfNum.size()); //4
		//Collections.sort(setOfNum);
	}
	
	
}

class Product123 {// implements Comparable<Product123>{
	private int Product123Id;
	private int Product123Price;
	private String Product123Name;
	public int getProduct123Id() {
		return Product123Id;
	}
	public void setProduct123Id(int Product123Id) {
		this.Product123Id = Product123Id;
	}
	public int getProduct123Price() {
		return Product123Price;
	}
	public void setProduct123Price(int Product123Price) {
		this.Product123Price = Product123Price;
	}
	public String getProduct123Name() {
		return Product123Name;
	}
	public void setProduct123Name(String Product123Name) {
		this.Product123Name = Product123Name;
	}
	@Override
	public String toString() {
		return "\n Product123 [Product123Id=" + Product123Id + ", Product123Price=" + Product123Price + ", Product123Name=" + Product123Name
				+ "]";
	}
	public Product123(int Product123Id, int Product123Price, String Product123Name) {
		super();
		this.Product123Id = Product123Id;
		this.Product123Price = Product123Price;
		this.Product123Name = Product123Name;
	}
	public Product123() {
		super();
		// TODO Auto-generated constructor stub
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Product123Id;
		result = prime * result + ((Product123Name == null) ? 0 : Product123Name.hashCode());
		result = prime * result + Product123Price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product123 other = (Product123) obj;
		if (Product123Id != other.Product123Id)
			return false;
		if (Product123Name == null) {
			if (other.Product123Name != null)
				return false;
		} else if (!Product123Name.equals(other.Product123Name))
			return false;
		if (Product123Price != other.Product123Price)
			return false;
		return true;
	}*/
	
	/**
	 * 48 -- 0 -- 
	 * 57 -- 9 
	 * 
	 * A  -- 65
	 * 91 -- Z
	 * 
	 * a -- 97
	 * z- 122
	 * 
	 * 
	 */
	
	public Integer getINt(){
		return 10;
	}
	
/*	@Override
	public int compareTo(Product123 o) {
		return this.getProduct123Name().compareTo(o.getProduct123Name());
	}*/
	
	
}


class PriceSort implements Comparator<Product123>{

	@Override
	public int compare(Product123 o1, Product123 o2) {
		return o1.getProduct123Price() - o2.getProduct123Price();
	}
	
}

class Product123SortByName implements Comparator<Product123>{

	@Override
	public int compare(Product123 o1, Product123 o2) {
		return o1.getProduct123Name().compareTo(o2.getProduct123Name());
	}
	
}




















