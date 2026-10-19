package dao;

import java.util.List;
import dto.Enrollment;

public interface EnrollmentDAO {

	void addEnrollment(Enrollment e);
	Enrollment getEnrollmentByStudentId(int studentId);
	int getNextEnrollmentId();
}
