package Task1;

public class Student {
	
	private int id;
	private String name;
	private String grade;
	
	public Student(int id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}
