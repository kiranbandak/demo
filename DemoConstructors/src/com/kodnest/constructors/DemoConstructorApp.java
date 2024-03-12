package com.kodnest.constructors;

class Student{
	 String name; // Kiran
	 int id; // 300
	 String place; // Kalaburagi
	 char gender; // Male
	 int marks; // 100
	 long contact_number; //2525
	 
	public Student(String name, int id, String place, char gender, int marks, long contact_number){
	  name = name;
	  id = id;
	  place = place;
	  gender = gender;
	  marks = marks;
	  contact_number = contact_number;
 }
	 
}	 
public class DemoConstructorApp {
 public static void main(String[] args) {
	Student s = new Student("Kiran", 300,"Kalaburagi",'M',100,2525);
	Student s1 = new Student("Kiran", 200,"Bengaluru",'M',90,2525);
 
	
	System.out.println(s.name+" "+s.id+" "+s.place+" "+s.gender+" "+s.marks+" "+s.contact_number);
	System.out.println(s1.name+" "+s1.id+" "+s1.place+" "+s1.gender+" "+s1.marks+" "+s1.contact_number);

	
	
	
	
	
	
 }
}
