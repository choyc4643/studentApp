package com.example.lab2;

public class Student implements Comparable<Student> {
	int no;
	String name;
	int age;
	
	public Student(int i, String s, int j) {
		no = i;
		name = s;
		age = j;
	}
	
	@Override
	
	public int compareTo(Student o) {
		return Integer.valueOf(age).compareTo(o.age);
		//return Integer.compare(age,o.age); wrapper class 사
	}
	public String toString() {
		return "Student [no=" + no + ", name = " + name + ", age = "+ age + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	
}
