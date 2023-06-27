package com.spicemoiney.in.spring.prectice;

/**
 * Constructor-based DI !
 *
 */
public class MyApplication {
	public static void main(String[] args) {
		
		StudentServiceImpl serviceImpl =new StudentServiceImpl();
		TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl();
		
		StudentService service = new StudentService(serviceImpl, teacherServiceImpl);
		
		Long systemTime = System.currentTimeMillis();
		
		String firstName = " Nitish";
		String lastName = " Gupta";
		int id=1;
		int rollNumber=101587;
		String address=" SM HIGHTS ";
		
		String teacherName = "Ankush Sir";
		String qulification = "High Btech";
		int teachId = 1015001;
		
		
	
		service.doSomthing(  systemTime,firstName,
		 lastName,
		 id,
		 rollNumber,
		 address);
		
		System.out.println("------------------------");
		
		service.addteachDetails(teacherName,qulification,teachId
				
				);
		

	}

	
}
