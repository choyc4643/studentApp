package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Main{
	public static void main(String args[]) {
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student (101,"Kim",23);
		al.add(s1);
		Student s2 = new Student (102,"park",23);
		al.add(s2);
		Student s3 = new Student (103,"choi",23);
		al.add(s3);

		
		Collections.sort(al);
		
		System.out.println("Student List (ordered by name)");
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al);
		
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		
		
		
	}

}
