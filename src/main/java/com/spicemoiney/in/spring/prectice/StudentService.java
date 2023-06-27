package com.spicemoiney.in.spring.prectice;

public class StudentService {

	private StudentServiceImpl serviceImpl;

	private TeacherServiceImpl  teacherServiceImpl ;
	
	public StudentService(StudentServiceImpl serviceImpl, TeacherServiceImpl teacherServiceImpl) {

		this.serviceImpl = serviceImpl;
		this.teacherServiceImpl = teacherServiceImpl;
	}

	public void doSomthing(Long systemTime, String firstName, String lastName, int id, int rollNumber, String address) {
		
		serviceImpl.fecthDetalis();
		System.out.println("CurrentTime : " + systemTime);
		
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("id :" + id);
		System.out.println("rollNumber : " + rollNumber);
		System.out.println("address: " + address);

	}
	public void addteachDetails(String teacherName, String qulification, int teachId) {
		// TODO Auto-generated method stub
		teacherServiceImpl.teachDetails();
		
		System.out.println("teacherName : " + teacherName);
		System.out.println("qulification : " + qulification);
		System.out.println("teachId :" + teachId);
		
	}
}
