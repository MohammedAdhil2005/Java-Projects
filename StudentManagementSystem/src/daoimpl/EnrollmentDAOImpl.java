package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import connection.ConnectionFactory;
import dao.EnrollmentDAO;
import dto.Enrollment;

public class EnrollmentDAOImpl implements EnrollmentDAO{

	@Override
	public void addEnrollment(Enrollment e) {

		try {
			Connection con = ConnectionFactory.getConnection();

			String aq = "INSERT INTO enrollment VALUES (?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(aq);
			
			pstmt.setInt(1, e.getEnrollmentId());
			pstmt.setInt(2, e.getStudentId());
			pstmt.setInt(3, e.getCourseId());
			pstmt.setString(4, e.getInterest());
			
			pstmt.execute();
			
			System.out.println("\n\n-----------------------------------");
			System.out.println("THANK YOU FOR YOUR ENROLLMENT!!!");
			System.out.println("-----------------------------------\n");

		} 
		catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public Enrollment getEnrollmentByStudentId(int studentId) {

		Enrollment en=null;
		
		try {
			Connection con = ConnectionFactory.getConnection();
			String sq = "SELECT  * FROM enrollment WHERE student_id=?";

			PreparedStatement pstmt = con.prepareStatement(sq);
			pstmt.setInt(1, studentId);
			
			ResultSet res = pstmt.executeQuery();
			
			while(res.next()) {
				en = new Enrollment(res.getInt("enrollment_id"),res.getInt("student_id"),res.getInt("course_id"),res.getString("interest") );
			}
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return en;
	}

	@Override
	public int getNextEnrollmentId() {
	    int eid = 0;

	    try {
	        Connection con = ConnectionFactory.getConnection();

	        String sq = "SELECT MAX(enrollment_id) FROM enrollment";

	        Statement stmt = con.createStatement();
	        ResultSet res = stmt.executeQuery(sq);

	        if(res.next()) {
	            eid = res.getInt(1) + 1;
	        }
	    }
	    catch(Exception e) {
	        e.printStackTrace();
	    }

	    return eid;
	}
	
	
}
