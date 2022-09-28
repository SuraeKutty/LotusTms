package com.lotustms.pageObjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class rough {
String[] a;
public void method1() {
	TreeSet<String> a = new TreeSet<String>();
	a.add("surendar");
	a.add("surendarSuba");
	a.add("Suba");
	a.add(" ");
	a.add("surendar");
	Iterator its = a.iterator();
	while(its.hasNext()) {
		System.out.println(its.next());
	}
//	int b = a.size();
//	System.out.println(b);
//	for(int i=0; i < b ; i++) {
//		System.out.println(a.);
//	}
}

//public void method2() { 
//String word = "Flipkart";
//String reverse ="";
//char rev;
//int size = word.length();
//System.out.println(size);
//for(int m= size; m<0;m--) {
//	 rev=word.charAt(m);
//	String reverse = rev+reverse;
//	System.out.println(reverse1);
//}
//}
	public static void main(String[] args) {
		String word = "Welcome";
		if(word.contains("a") ||word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
			System.out.println("This contains aeiou");
		}
		
		else {
			System.out.println("This not contains aeiou");
		}
	}
//	rough a = new rough();
//	a.method2();
//		  String str= "Geeks", nstr="";
//	        char ch;
//	        
//	      System.out.print("Original word: ");
//	      System.out.println("Geeks"); //Example word
//	        
//	      for (int i=0; i<str.length(); i++)
//	      {
//	        ch= str.charAt(i); //extracts each character
//	        nstr= ch+nstr; //adds each character in front of the existing string
//	      }
//	      System.out.println("Reversed word: "+ nstr);\
	
		
//	    }

}
