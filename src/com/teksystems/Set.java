package com.teksystems;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	public static void main(String arg[]){
		
		HashSet<String> s=new HashSet<String>();
		s.add("ramu");
		s.add("ravi");
		s.add("naga");
		s.add("ramu");
		System.out.println(s.size());
		Iterator<String> it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
			
		}
		
 	}


