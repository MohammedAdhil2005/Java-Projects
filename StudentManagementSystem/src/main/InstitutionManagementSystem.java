package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import connection.ConnectionFactory;
import daoimpl.CourseDAOImpl;
import daoimpl.EnrollmentDAOImpl;
import daoimpl.StudentDAOImpl;
import dto.Course;
import dto.Enrollment;
import dto.Student;

public class InstitutionManagementSystem {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {

		System.out.println("\n===== INSTITUTION MANAGEMENT SYSTEM =====\n");
		
		System.out.println("ARE YOU A NEW STUDENT ?");
		
		System.out.println("\n1. YES");
		System.out.println("2. NO");
		
		System.out.print("\nENTER YOUR CHOICE HERE: ");
		
		int take=sc.nextInt();	
		
		StudentDAOImpl sd=new StudentDAOImpl();
		EnrollmentDAOImpl ed = new EnrollmentDAOImpl();
		CourseDAOImpl cd=new CourseDAOImpl();
		
		switch(take) {
		
		case 1:
		{
			System.out.println("\n===== NEW STUDENT REGISTRATION =====");
			
			// ---------------FOR INSERTING DATA---------------
			
			System.out.print("\nEnter STUDENT ID: ");
			int id=sc.nextInt();
			
			System.out.print("Enter NAME: ");
			String name=sc.next();
			
			System.out.print("Enter EMAIL: ");
			String email=sc.next();
			
			System.out.print("Enter PHONE: ");
			String phone=sc.next();
			
			System.out.print("Enter AGE: ");
			int age=sc.nextInt();
			
			Student s=new Student(id,name,email,phone,age);
			
			sd.addStudent(s);   

			System.out.println("\nWHAT IS YOUR INTEREST? ");
			
			System.out.println("\n1. Java");
			System.out.println("2. Python");
			System.out.println("3. Web Development");
			System.out.println("4. Data Science");
			System.out.println("5. SQL");
			
			System.out.print("\nENTER YOUR INTEREST HERE: ");
			int i_choice=sc.nextInt();
			
			Connection con=ConnectionFactory.getConnection();

			switch(i_choice) {
			
			case 1:{
				
				System.out.println("\n===== RECOMMENDED COURSE =====");
				
				System.out.println("\n Course name: Java Full Stack"+"\n Duration: 6 Months"+"\n Fees: 35000.0");
				
				String sq="UPDATE student SET interest=? WHERE student_id=?";
				
				PreparedStatement pstmt = con.prepareStatement(sq);
				
				pstmt.setString(1, "Java Full Stack");
				pstmt.setInt(2, id);
				
				pstmt.execute();
				
				System.out.println("\nDo you want to enroll?");
				System.out.println("1. YES");
				System.out.println("2. NO");
				
				System.out.print("\nENTER YOUR CHOICE: ");
				int enrollChoice = sc.nextInt();
				
				if(enrollChoice == 1) {
				
					int eid = ed.getNextEnrollmentId();
					System.out.print("\nYOUR ENROLLMENT ID IS: "+eid);
					
					Enrollment e=new Enrollment(eid,id,i_choice,"Java");
					ed.addEnrollment(e);
					
				}
				
				else if(enrollChoice == 2) {
					System.out.println("\nYOU HAVE NOT ENROLLED FOR THIS COURSE!!");
				}
				
				else {
					System.out.println("\\nENTER VALID NUMBER");
				}
				
				break;
				
			}
			
			case 2:{
				
				System.out.println("\n===== RECOMMENDED COURSE =====");
				
				System.out.println("\n Course name: Python Full Stack"+"\n Duration: 6 Months"+"\n Fees: 30000.0");
				
				String sq="UPDATE student SET interest=? WHERE student_id=?";
				
				PreparedStatement pstmt = con.prepareStatement(sq);
				
				pstmt.setString(1, "Python Full Stack");
				pstmt.setInt(2, id);
				
				pstmt.execute();
				
				System.out.println("\nDo you want to enroll?");
				System.out.println("1. YES");
				System.out.println("2. NO");
				
				System.out.print("\nENTER YOUR CHOICE: ");
				int enrollChoice = sc.nextInt();
				
				if(enrollChoice == 1) {
					
					int eid = ed.getNextEnrollmentId();
					System.out.print("\nYOUR ENROLLMENT ID IS: "+eid);
					
					Enrollment e=new Enrollment(eid,id,i_choice,"Python");
					ed.addEnrollment(e);
					
				}
				
				else if(enrollChoice == 2) {
					System.out.println("\nYOU HAVE NOT ENROLLED FOR THIS COURSE!!");
				}
				
				else {
					System.out.println("\\nENTER VALID NUMBER");
				}
				
				break;
			}
			
			case 3:{
				
				System.out.println("\n===== RECOMMENDED COURSE =====");
				
				System.out.println("\n Course name: Web Development (HTML, CSS AND JS WITH REACT)"+"\n Duration: 3 Months"+"\n Fees: 15000.0");
				
				String sq="UPDATE student SET interest=? WHERE student_id=?";
				
				PreparedStatement pstmt = con.prepareStatement(sq);
				
				pstmt.setString(1, "Web Development");
				pstmt.setInt(2, id);
				
				pstmt.execute();
				
				System.out.println("\nDo you want to enroll?");
				System.out.println("1. YES");
				System.out.println("2. NO");
				
				System.out.print("\nENTER YOUR CHOICE: ");
				int enrollChoice = sc.nextInt();
				
				if(enrollChoice == 1) {
					
					int eid = ed.getNextEnrollmentId();
					System.out.print("\nYOUR ENROLLMENT ID IS: "+eid);
					
					Enrollment e=new Enrollment(eid,id,i_choice,"Web Technology");
					ed.addEnrollment(e);
					
				}
				
				else if(enrollChoice == 2) {
					System.out.println("\nYOU HAVE NOT ENROLLED FOR THIS COURSE!!");
				}
				
				else {
					System.out.println("\\nENTER VALID NUMBER");
				}
				
				break;
			}
			
			case 4:{
				
				System.out.println("\n===== RECOMMENDED COURSE =====");
				
				System.out.println("\n Course name: Data Science"+"\n Duration: 3 Months"+"\n Fees: 18000.0");
				
				String sq="UPDATE student SET interest=? WHERE student_id=?";
				
				PreparedStatement pstmt = con.prepareStatement(sq);
				
				pstmt.setString(1, "Data Science");
				pstmt.setInt(2, id);
				
				pstmt.execute();
				
				System.out.println("\nDo you want to enroll?");
				System.out.println("1. YES");
				System.out.println("2. NO");
				
				System.out.print("\nENTER YOUR CHOICE: ");
				int enrollChoice = sc.nextInt();
				
				if(enrollChoice == 1) {
					
					int eid = ed.getNextEnrollmentId();
					System.out.print("\nYOUR ENROLLMENT ID IS: "+eid);
					
					Enrollment e=new Enrollment(eid,id,i_choice,"Data Science");
					ed.addEnrollment(e);
					
				}
				
				else if(enrollChoice == 2) {
					System.out.println("\nYOU HAVE NOT ENROLLED FOR THIS COURSE!!");
				}
				
				else {
					System.out.println("\\nENTER VALID NUMBER");
				}
				
				break;
				
			}
			
			case 5:{
				System.out.println("\n===== RECOMMENDED COURSE =====");
				
				System.out.println("\n Course name: SQL"+"\n Duration: 1 Months"+"\n Fees: 25000.0");
				
				String sq="UPDATE student SET interest=? WHERE student_id=?";
				
				PreparedStatement pstmt = con.prepareStatement(sq);
				
				pstmt.setString(1, "SQL");
				pstmt.setInt(2, id);
				
				pstmt.execute();
				
				System.out.println("\nDo you want to enroll?");
				System.out.println("1. YES");
				System.out.println("2. NO");
				
				System.out.print("\nENTER YOUR CHOICE: ");
				int enrollChoice = sc.nextInt();
				
				if(enrollChoice == 1) {
					
					int eid = ed.getNextEnrollmentId();
					System.out.print("\nYOUR ENROLLMENT ID IS: "+eid);
					
					Enrollment e=new Enrollment(eid,id,i_choice,"SQL");
					ed.addEnrollment(e);
					
				}
				
				else if(enrollChoice == 2) {
					System.out.println("\nYOU HAVE NOT ENROLLED FOR THIS COURSE!!");
				}
				
				else {
					System.out.println("\\nENTER VALID NUMBER");
				}
				
				break;
			}
			
			}
			break;
		}
		
		case 2:
		{
			System.out.print("\nENTER STUDENT ID TO GET THE COMPLETE DETAILS: ");
			int id=sc.nextInt();
			
			//----------------FOR GETTING STUDENT DETAILS---------------------
			
			Student s = sd.getStudentById(id);
			
			if(s==null) {
			    System.out.println("\nSTUDENT IS NOT FOUND!!");
			    System.out.println("\n!!!!!!!!!CHECK YOUR ID!!!!!!!!!");
			}
			
			else {
				System.out.println("\n===== STUDENT DETAILS =====\n");

		        System.out.println("Student ID : " + s.getStudentId());
		        System.out.println("Name       : " + s.getName());
		        System.out.println("Email      : " + s.getEmail());
		        System.out.println("Phone      : " + s.getPhone());
		        System.out.println("Age        : " + s.getAge());
		        
		        
				//----------------FOR GETTING EMPLOYEE DETAILS---------------------
		        
		        Enrollment e = ed.getEnrollmentByStudentId(id);

		        if(e==null) {

		            System.out.println("\nCOURSE STATUS : NOT ENROLLED\n");
		           		            
		            String sq="SELECT interest FROM student WHERE student_id=?";
		            Connection con=ConnectionFactory.getConnection();
		            
		            PreparedStatement pstmt = con.prepareStatement(sq);
		            pstmt.setInt(1, id);
		            
		            ResultSet res = pstmt.executeQuery();
		            
		            String interest="";
		            
		            if(res.next()) {
		            	interest=res.getString("interest");
		            }

		            System.out.println("YOUR SELECTED COURSE IS : "+interest);

		            System.out.println("\nDO YOU WANT TO ENROLL IN A COURSE");
		            System.out.println("1. YES");
		            System.out.println("2. NO");
		            
		            System.out.print("\nENTER YOUR CHOICE: ");
		            int choice = sc.nextInt();

		            if(choice==1) {

		                System.out.println("\nYOU HAVE SELECTED THE COURSE");

		                int eid = ed.getNextEnrollmentId();
						System.out.println("\nYOUR ENROLLMENT ID IS    : "+eid);

		                int courseId = 0;
		                
		                
		                if(interest.equalsIgnoreCase("Java Full Stack")) {
		                    courseId = 1;
		                }
		                else if(interest.equalsIgnoreCase("Python Full Stack")) {
		                    courseId = 2;
		                }
		                else if(interest.equalsIgnoreCase("Web Development")) {
		                    courseId = 3;
		                }
		                else if(interest.equalsIgnoreCase("Data Science")) {
		                    courseId = 4;
		                }
		                else if(interest.equalsIgnoreCase("SQL")) {
		                    courseId = 5;
		                }

		                Course c = cd.getCourseById(courseId);
			             
		                 System.out.println("\nYOUR Course ID IS        : " + c.getCourseId());
		                 System.out.println("YOUR Course NAME IS      : " + c.getCourseName());
		                 System.out.println("YOUR Course DURATION IS  : " + c.getDuration());
		                 System.out.println("YOUR Course FEES IS      : " + c.getFees());

		                 Enrollment en = new Enrollment(eid, id, c.getCourseId(), res.getString("interest"));

		                ed.addEnrollment(en);
		            }
		            
		            else if(choice == 2) {
		                System.out.println("\nDO YOU WANT TO SELECT ANOTHER COURSE?");
		                System.out.println("1. YES");
		                System.out.println("2. NO");
		                
			            System.out.print("\nENTER YOUR CHOICE: ");
		                int a_choice=sc.nextInt();
		                
		                if(a_choice==1) {
		                	System.out.println("\nWHAT IS YOUR NEW CHOICE? ");
		        			
		        			System.out.println("\n1. Java");
		        			System.out.println("2. Python");
		        			System.out.println("3. Web Development");
		        			System.out.println("4. Data Science");
		        			System.out.println("5. SQL");
		        			
		        			System.out.print("\nENTER YOUR INTEREST HERE: ");
		        			int n_choice=sc.nextInt();
		        			
		        			Course c = cd.getCourseById(n_choice);

		        		    System.out.println("\n===== COURSE DETAILS =====\n");
		        		    System.out.println("Course ID       : " + c.getCourseId());
		        		    System.out.println("Course Name     : " + c.getCourseName());
		        		    System.out.println("Course Duration : " + c.getDuration());
		        		    System.out.println("Course Fees     : " + c.getFees());
		        		    
		        		    System.out.println("\nDO YOU WANT TO ENROLL IN A COURSE");
				            System.out.println("1. YES");
				            System.out.println("2. NO");
				            
				            System.out.print("\nENTER YOUR CHOICE: ");
				            int e_choice = sc.nextInt();
				            
				            if(e_choice==1) {
				            	int eid = ed.getNextEnrollmentId();
								System.out.print("\nYOUR ENROLLMENT ID IS: "+eid);
								
								Enrollment e1=new Enrollment(eid,id,c.getCourseId(),interest);
								ed.addEnrollment(e1);
				            }
				            
				            else if(e_choice==2){
				            	System.out.println("\n----------------------------------------------------------");
			                    System.out.println("\nYOU HAVE NOT ENROLLED IN THE COURSE!!!!");
			                	System.out.println("\nONCE AGAIN YOU CAN CHECK THE ALL OF THE COURSE DETAILS "+"\n"+"IF YOUR ARE INTERESTED SELECT THE COURSE OR "+"\n"+"ELSE YOU CAN SPEAK WITH OUR "+"\n"+"HR SIR HE WILL CLEAR YOUR DOUBTS");
			                	System.out.println("\nCONTACT NO: 123 123 22 11");
			                	System.out.println("----------------------------------------------------------\n");
			                }
		                }
		                else if(a_choice==2){
			            	System.out.println("\n----------------------------------------------------------");
		                    System.out.println("\nYOU HAVE NOT ENROLLED IN THE COURSE.");
		                	System.out.println("\nONCE AGAIN YOU CAN CHECK THE ALL OF THE COURSE DETAILS "+"\n"+"IF YOUR ARE INTERESTED SELECT THE COURSE OR "+"\n"+"ELSE YOU CAN SPEAK WITH OUR "+"\n"+"HR SIR HE WILL CLEAR YOUR DOUBTS");
		                	System.out.println("\nCONTACT NO: 123 123 22 11");
		                	System.out.println("----------------------------------------------------------\n");

		                }
		            }
		            
		            else {
		                System.out.println("ENTER VALID NUMBER");
		            }

		        }
		        
		        
		        else {
		        	 System.out.println("\n===== ENROLLMENT DETAILS =====\n");

		             System.out.println("Enrollment ID : " + e.getEnrollmentId());
		             System.out.println("Interest      : " + e.getInterest());
		             System.out.println("Status        : ENROLLED");

		             
					//----------------FOR GETTING COURSE DETAILS---------------------
		            
		             Course c = cd.getCourseById(e.getCourseId());

		             if(c != null) {

		                 System.out.println("\n===== COURSE DETAILS =====\n");

		                 System.out.println("Course ID   : " + c.getCourseId());
		                 System.out.println("Course Name : " + c.getCourseName());
		                 System.out.println("Duration    : " + c.getDuration());
		                 System.out.println("Fees        : " + c.getFees());
		             }
		        }
		        
			}
			
			break;
			
		}
		
		default:{
			System.out.println("ENTER VALID NUMBER");
		}
		
		}
		
	}
}


