
public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher yjt=new Teacher("���N��", "�U�z�б�");
		
		Course oop =new Course(1,"����ɦV�{���]�p",yjt,"��ިt");
		
		Student s1=new Student("B001","�p��","��ިt",3);
		Student s2=new Student("B231","�p��","�q���t",2);
		
		oop.addStudent(s1);
		oop.addStudent(s2);
		
		oop.printStudentList();
	}

}
