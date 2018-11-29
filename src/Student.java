
public class Student extends Person {
	private String StudentID;
	private String Major;
	private int Grade;
	
	public Student(String id, String name,String major,int grade){
		setName(name);
		StudentID=id;
		Major=major;
		Grade=grade;
		
	}
	
	public void printStudent(){
		System.out.print(StudentID+", "+Major+", "+Grade+", ");
		
		printName();
		
	}
}
