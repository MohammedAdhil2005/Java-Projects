package dto;

public class Student {

	private int studentId; 
	private String name; 
	private String email; 
	private String phone; 
	private int age;
	
	public Student(int studentId, String name, String email, String phone, int age) {
		this.studentId=studentId;
		this.setName(name);
		this.setEmail(email);
		this.setPhone(phone);
		this.setAge(age);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
}
