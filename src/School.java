
public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher yjt=new Teacher("曾意儒", "助理教授");
		
		Course oop =new Course(1,"物件導向程式設計",yjt,"資管系");
		
		Student s1=new Student("B001","小白","資管系",3);
		Student s2=new Student("B231","小明","電機系",2);
		
		oop.addStudent(s1);
		oop.addStudent(s2);
		
		oop.printStudentList();
	}

}
