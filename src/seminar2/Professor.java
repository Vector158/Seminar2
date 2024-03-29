package seminar2;

public class Professor {
	//1. we need variables
	
	private long professor_ID;
	private String name;
	private String surname;
	private Degree profDegree;
	
	
	public static long counter = 0;
	
	
	
	
	
	//2. we need getters and setters
	public long getProfessor_ID() {
		return professor_ID;
	}
	public void setProfessor_ID(long professor_ID) {
		this.professor_ID = counter;
		counter++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && name.matches("[A-Z]{1}[a-z]{1-20}")) {
			this.name = name;
		}else {
			this.name = "Undefined";
		}
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-Z]{1}[a-z]{1-20}")){
			this.surname = surname;
		}else {
			this.surname = "Undefined";
		}
	}
	public Degree getProfDegree() {
		return profDegree;
	}
	public void setProfDegree(Degree profDegree) {
		if(profDegree != null) {
			this.profDegree = profDegree;
		}else {
			this.profDegree = Degree.other;
		}

	}
	//3. constructors
	//4.toString function
	
	
}
