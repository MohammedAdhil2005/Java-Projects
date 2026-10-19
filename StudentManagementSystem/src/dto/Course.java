package dto;

public class Course {

	private int courseId; 
	private String courseName; 
	private String duration; 
	private double fees;
	
	public Course(int courseId, String courseName, String duration, double fees) {
		this.setCourseId(courseId);
		this.setCourseName(courseName);
		this.setDuration(duration);
		this.setFees(fees);
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
