
public class Teacher extends Person {
	private String NotesID;
	private String Level;
	
	public Teacher(String name,String level){
		setName(name);
		Level=level;
	}
	
	public void printTeacher(){
		printName();
		System.out.println(Level);
	}
}
