package dao;

//Student Object, storing 4 main variables of a student (name, ID, date created, grade)
public class Student {
	public String name;
	public String id;
	public String date;
	public int grade=0;
	
	public Student(String name, String id, String date, int grade) {
		super();
		this.name = name;
		this.id = id;
		this.date = date;
		this.grade = grade;
	}


	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	

	public Student(String name, String id,String date) {
		this.name = name;
		this.id = id;
		this.date=date;
	}
	
}
