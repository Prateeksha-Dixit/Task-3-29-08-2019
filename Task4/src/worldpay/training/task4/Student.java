package worldpay.training.task4;

public class Student {
	
	
	
	public void countDepartmentwiseStudent(String[] rollnos)
	{
		int cs=0,it=0,mech=0,civil=0;
		for(String rollno:rollnos)
		{
			if(rollno.startsWith("12"))
				cs++;
			if(rollno.startsWith("34"))
				it++;
			if(rollno.startsWith("45"))
				mech++;
			if(rollno.startsWith("56"))
				civil++;
			
		}
		
		System.out.println("CS students : "+cs);
		System.out.println("IT students : "+it);
		System.out.println("Mech students : "+mech);
		System.out.println("Civil students : "+civil);
	}
	
	public static void main(String[] args) {
		
		Student student=new Student();
		String rollnos[]={"12343434","3415434","5633232","34562525"};
		student.countDepartmentwiseStudent(rollnos);
		
	}

}
