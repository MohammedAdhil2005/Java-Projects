package daoimpl;

import dao.StudentDAO;
import dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionFactory;

public class StudentDAOImpl implements StudentDAO {

	static Scanner sc=new Scanner(System.in);
	
	@Override
	public void addStudent(Student student) {
		try {
			Connection con=ConnectionFactory.getConnection();
			String iq="INSERT INTO student (student_id, name, email, phone, age) VALUES(?,?,?,?,?)";
			PreparedStatement iqpstmt = con.prepareStatement(iq);
			
			iqpstmt.setInt(1,student.getStudentId() );
			iqpstmt.setString(2, student.getName());
			iqpstmt.setString(3, student.getEmail());
			iqpstmt.setString(4, student.getPhone());
			iqpstmt.setInt(5, student.getAge());
			
			iqpstmt.execute();
			
			//System.out.println("Inserted Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List getAllStudents() {
		
		List<Student> list = new ArrayList<>();
		
		try {
			Connection con=ConnectionFactory.getConnection();
			String sq="SELECT * FROM STUDENT";
			
			Statement sstmt = con.createStatement();
			ResultSet res = sstmt.executeQuery(sq);
			
			while(res.next()) {
				
				Student s=new Student(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getInt(5));
				list.add(s);	
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Student getStudentById(int id) {

		Student s=null;
		
		try {
		Connection con=ConnectionFactory.getConnection();
		String sidq="SELECT * FROM student WHERE student_id=?";
		
		PreparedStatement pstmt = con.prepareStatement(sidq);
		
		pstmt.setInt(1, id);

		ResultSet res = pstmt.executeQuery();
		
		if(res.next()) {
			s=new Student(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getInt(5));
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}

	@Override
	public void updateStudent(Student student) {
		
		try {
			Connection con=ConnectionFactory.getConnection();
			
			String us="UPDATE student SET name=?, email=?, phone=?, age=? WHERE student_id=?";
			
			PreparedStatement pstmt = con.prepareStatement(us);
			
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getEmail());
			pstmt.setString(3, student.getPhone());
			pstmt.setInt(4, student.getAge());
			pstmt.setInt(5, student.getStudentId());
			
			pstmt.execute();
			
			System.out.println("Record was updated !!");
						
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent(int id) {
		try {
			Connection con=ConnectionFactory.getConnection();

			String dq="DELETE FROM student WHERE student_id=?";
			
			PreparedStatement pstmt = con.prepareStatement(dq);
			
			pstmt.setInt(1, id);
			
			pstmt.execute();
			
			System.out.println("Deleted Successfully!!!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public List searchByName(String name) {
		
		List<Student> l1=new ArrayList();
		
		try {
			Connection con = ConnectionFactory.getConnection();
			String sq = "SELECT * FROM student WHERE name=?";

			PreparedStatement pstmt = con.prepareStatement(sq);

			pstmt.setString(1, name);
			ResultSet res = pstmt.executeQuery();
			
			while(res.next()) {
				Student s=new Student(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getInt(5));
				l1.add(s);
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return l1;
	}

	@Override
	public List searchByAgeRange(int minAge, int maxAge) {
		
		List<Student> list=new ArrayList();
		
		try {
			Connection con = ConnectionFactory.getConnection();
			String aq = "SELECT * FROM student WHERE age BETWEEN ? AND ? ";

			PreparedStatement pstmt = con.prepareStatement(aq);

			pstmt.setInt(1, minAge);
			pstmt.setInt(2, maxAge);

			ResultSet res = pstmt.executeQuery();
			
			while(res.next()) {
				Student s=new Student(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getInt(5));
				list.add(s);
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	
	@Override
	public int countStudents() {

		try {
			Connection con = ConnectionFactory.getConnection();
			String cq="SELECT COUNT(name) FROM student";
			
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(cq);
			
			while(res.next()) {
				  return res.getInt(1);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	

}
