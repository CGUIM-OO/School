import java.util.ArrayList;

public class Course {
	private int CourseID;
	private String CourseName;
	private Teacher CourseTeacher;
	private ArrayList<Student> StudentList;
	private String Department;
	
	public Course(int id, String cName,Teacher t,String dept){
		CourseID=id;
		CourseName=cName;
		CourseTeacher=t;
		Department=dept;
		StudentList=new ArrayList<Student>();
	}
	
	public void printStudentList(){
		CourseTeacher.printTeacher();
		System.out.println(CourseName+" ­×½Ò¦W³æ:");
		for(Student s:StudentList){
			s.printStudent();
		}
	}
	public void addStudent(Student s){
		StudentList.add(s);
	}
}
