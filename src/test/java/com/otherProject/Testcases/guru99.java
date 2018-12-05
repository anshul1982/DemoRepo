package com.otherProject.Testcases;


import java.util.HashSet;
import java.util.Iterator;


/**
 * @author aagrawal
 *
 */
public  class guru99 {

	public static void main(String[] args) {
				
		//int a[][]= new int[4][5];
		//LinkedList object = new LinkedList();
		//ArrayList<String> object = new ArrayList<String>();
		//LinkedList<String> object = new LinkedList<String>();
		//Vector<String> object = new Vector<String>(0);
		HashSet<String> object = new HashSet<String>(); 
	
		object.add("abc");
		object.add("dbc");
		//object.add(1, "pqr");
		//object.add(1, "xyz");
		
		System.out.println(object);
		Iterator<String> itr = object.iterator();
		
		while (itr.hasNext()){
			
		object.add("abc");
		System.out.println(itr.next());
		}
		
		
		
}
}

