package com.takeo;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String... tts) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);//[A, 10, A, null]
		l.remove(2);
		System.out.println(l);//[A, 10, null]
		l.add(2, "M");
		System.out.println(l);//[A, 10, M, null]
		
		
	}

}
