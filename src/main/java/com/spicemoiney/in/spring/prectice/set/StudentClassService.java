package com.spicemoiney.in.spring.prectice.set;

public class StudentClassService {

	private StudentClassIntf impl ; 
	
	public void setImpl(StudentClassIntf impl) {
		this.impl= impl;
	}
	
	public void fetchSomthing(Long systemTime, String firstName, String lastName, int id, int rollNumber,
			String address) {
		// TODO Auto-generated method stub
		
		
		impl.studentDetails();
		
		System.out.println("CurrentTime : " + systemTime);
		
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("id :" + id);
		System.out.println("rollNumber : " + rollNumber);
		System.out.println("address: " + address);

	}

	public void addTeachersDetails(String teachName, String deptmnt, int deptmntId, int teachNumber,
			String teachAdress) {
		impl.teacherDetails();
		System.out.println("teachName : " + teachName);
		System.out.println("deptmnt : " + deptmnt);
		System.out.println("deptmntId :" + deptmntId);
		System.out.println("teachNumber : " + teachNumber);
		System.out.println("teachAdress: " + teachAdress);
		
		
	}
}
