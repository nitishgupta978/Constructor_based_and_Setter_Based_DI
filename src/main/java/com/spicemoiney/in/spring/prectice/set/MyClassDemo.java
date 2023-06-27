package com.spicemoiney.in.spring.prectice.set;

/**
 * Setter-based DI !
 *
 */

public class MyClassDemo {

	public static void main(String[] args) {
		StudentClassService classService = new StudentClassService();
		
		StudentClassImpl studentClassImpl = new StudentClassImpl();
		
		

		classService.setImpl(studentClassImpl);

		Long systemTime = System.currentTimeMillis();

		String firstName = " Nitish";
		String lastName = " Gupta";
		int id = 1;
		int rollNumber = 101587;
		String address = " SM HIGHTS ";

		classService.fetchSomthing(systemTime, firstName, lastName, id, rollNumber, address);

		String teachName = " Ankush Sir";
		String deptmnt = " CMS";
		int deptmntId = 1;
		int teachNumber = 101500;
		String teachAdress = " SM HIGHTS ";
		
		classService.addTeachersDetails(teachName,deptmnt,deptmntId,teachNumber,teachAdress);
		
	}
}
