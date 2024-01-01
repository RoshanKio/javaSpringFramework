package com.takeo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void logic(boolean b) {
		b = false;
	}
		
	public static void concat(List<String> l, String str) {
		for(String s : l) {
			str=str+s+"\n";
		}
	}
	
	static public void main(String []tts) {
		List<String> l = new ArrayList<String>();
		
		l.add("Ram");
		l.add("Krishna");
		l.add("Vishnu");
		l.add("Narayan");
		
		String str = "Names:\n=====\n";
		
		concat(l, str);
		
		System.out.println(str);
		
		boolean flag = true;
		logic(flag);
		System.out.println("flag : "+flag);
		
		
		
				
	}
}