package dto;

public class Enrollment {

	private int enrollmentId;
	private int studentId;
	private int courseId;
	private String interest;
	
	public Enrollment(int enrollmentId, int studentId, int courseId, String interest) {
		this.enrollmentId = enrollmentId;
		this.setStudentId(studentId);
		this.setCourseId(courseId);
		this.setInterest(interest);
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}
	
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getInterest() {
		return interest;
	}
	
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	
}
