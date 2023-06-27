package com.spicemoiney.in.spring.prectice.set;

public class StudentClassImpl implements StudentClassIntf{


	@Override
	public void studentDetails() {
		// TODO Auto-generated method stub
		System.out.println(" Student Details get by Setter Based DI ");
		
	}

	@Override
	public void teacherDetails() {
		// TODO Auto-generated method stub
		
		System.out.println(" teacherDetails get by Setter Based DI ");
	}


}
