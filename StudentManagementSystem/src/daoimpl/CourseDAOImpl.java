package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import dao.CourseDAO;
import dto.Course;
import dto.Student;

public class CourseDAOImpl implements CourseDAO {

	@Override
	public void addCourse(Course course) {

		try {
			Connection con = ConnectionFactory.getConnection();
			String iq = "INSERT INTO course VALUES(?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(iq);
			
			pstmt.setInt(1, course.getCourseId());
			pstmt.setString(2, course.getCourseName());
			pstmt.setString(3, course.getDuration());
			pstmt.setDouble(4, course.getFees());
			
			pstmt.execute();
			System.out.println("\nInserted Successfully!!!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List getAllCourses() {

		List<Course> list=new ArrayList();
		
		try {
			Connection con = ConnectionFactory.getConnection();
			String gq="SELECT * FROM course";
			
			Statement stmt = con.createStatement();
			
			ResultSet res = stmt.executeQuery(gq);
			
			while(res.next()) {
				Course c=new Course(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
				list.add(c);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	
	@Override
	public Course getCourseById(int id) {

		Course c=null;
		
		try {
			Connection con = ConnectionFactory.getConnection();
			String iq="SELECT * FROM course WHERE course_id=?";
			
			PreparedStatement pstmt = con.prepareStatement(iq);
			
			pstmt.setInt(1, id);
			
			ResultSet res = pstmt.executeQuery();
			
			if(res.next()) {
				c=new Course(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public void updateCourse(Course course) {
		try {
			Connection con = ConnectionFactory.getConnection();
			String uq = "UPDATE course SET course_name=?, duration=?, fees=? WHERE course_id=?";

			PreparedStatement pstmt = con.prepareStatement(uq);
			
			pstmt.setString(1, course.getCourseName());
			pstmt.setString(2, course.getDuration());
			pstmt.setDouble(3,course.getFees());
			pstmt.setInt(4, course.getCourseId());
			
			pstmt.execute();
			
			System.out.println("\nUpdated Successfullyy");
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	
	@Override
	public void deleteCourse(int id) {

		try {
			Connection con = ConnectionFactory.getConnection();
			String dq = "DELETE FROM course WHERE course_id=?";

			PreparedStatement pstmt = con.prepareStatement(dq);
			pstmt.setInt(1, id);

			pstmt.execute();
			System.out.println("\nDeleted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List searchByName(String name) {
		List<Course> list=new ArrayList();
		
		try {
			Connection con = ConnectionFactory.getConnection();
			String nq="SELECT * FROM course WHERE course_name=?";
			
			PreparedStatement pstmt = con.prepareStatement(nq);
			pstmt.setString(1, name);
			
			ResultSet res = pstmt.executeQuery();
			
			if(res.next()) {
				Course c=new Course(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
				list.add(c);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	

	@Override
	public List searchByDuration(String duration) {
		List<Course> list=new ArrayList();

		try {
			Connection con = ConnectionFactory.getConnection();
			String sdq = "SELECT * FROM course WHERE duration=?";

			PreparedStatement pstmt = con.prepareStatement(sdq);
			pstmt.setString(1, duration);

			ResultSet res = pstmt.executeQuery();
			
			while(res.next()) {
				Course c=new Course(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
				list.add(c);
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}

	
	@Override
	public List searchByFeeRange(double min, double max) {
		List<Course> list=new ArrayList();
		
		try {
			Connection con = ConnectionFactory.getConnection();
			String fq="SELECT * FROM course WHERE fees BETWEEN ? AND ?";
			
			PreparedStatement pstmt = con.prepareStatement(fq);
			pstmt.setDouble(1, min);
			pstmt.setDouble(2, max);
			
			ResultSet res = pstmt.executeQuery();

			while(res.next()) {
				Course c=new Course(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
				list.add(c);
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	
	
	@Override
	public int countCourses() {

		try {
			Connection con = ConnectionFactory.getConnection();
			String s="SELECT COUNT(course_name) FROM course";
			
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(s);
			
			while(res.next()) {
				  return res.getInt(1);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	

}
