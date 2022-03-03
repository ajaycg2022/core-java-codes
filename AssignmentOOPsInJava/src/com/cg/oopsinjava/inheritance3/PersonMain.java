package com.cg.oopsinjava.inheritance3;

public class PersonMain {

	public static void main(String[] args) {
		Person pr = new Person();

		pr.readPersonDetails();
		pr.printPersonDetails();

		Student st = new Student();
		st.readStudentDetails();
		st.printStudentDetails();
		
		Staff s=new Staff() ;
		s.readStaffDetails();
		s.printStaffDetails();
			
		}
	}


