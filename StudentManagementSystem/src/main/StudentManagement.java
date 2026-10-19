package main;

import java.util.List;
import java.util.Scanner;

import daoimpl.CourseDAOImpl;
import daoimpl.StudentDAOImpl;
import dto.Course;
import dto.Student;

public class StudentManagement {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("ENTER 1 TO SEE THE STUDENT RELATED DATA'S");
		System.out.println("ENTER 2 TO SEE THE COURSE RELATED DATA'S");
		
		System.out.print("\nENTER HERE: ");
		int take=sc.nextInt();
		
		StudentDAOImpl sd=new StudentDAOImpl();
		
		switch(take) {
		
		case 1:
		{
			System.out.println("ENTER 1 TO INSERT DATA ");
			System.out.println("ENTER 2 TO GETTING ALL DATA ");
			System.out.println("ENTER 3 TO GETTING DATA BY ID");
			System.out.println("ENTER 4 TO UPDATE DATA BY ID");
			System.out.println("ENTER 5 TO DELETE DATA BY ID");
			System.out.println("ENTER 6 TO GETTING DATA BY NAME");
			System.out.println("ENTER 7 TO GETTING DATA BETWEEN MIN AND MAX");
			System.out.println("ENTER 8 TO GETTING COUNT BY ID");

			System.out.print("\nENTER HERE: ");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:{
				// ---------------FOR INSERTING DATA---------------
				
				System.out.print("Enter ID: ");
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
				break;
			}
			
			case 2:{
				// ---------------FOR GETTING ALL DETAILS-----------------
				 
				List<Student> l=sd.getAllStudents();
				
				for(Student s:l) {
					System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getEmail()+" "+s.getPhone()+" "+s.getAge() );
				}  
				break;
			}
			
			case 3:{
				//--------------FOR GETTING DETAILS BY ID-----------------
				
				System.out.print("Enter ID to find the Details : ");
				int id=sc.nextInt();
				
				Student s_resbyID = sd.getStudentById(id);
				
				System.out.println("\n<--- DETAILS ARE --->\n");
				System.out.println(s_resbyID.getStudentId()+" "+s_resbyID.getName()+" "+s_resbyID.getEmail()+" "+s_resbyID.getPhone()+" "+s_resbyID.getAge() );
				break;
				
			}
			
			case 4:{
				
				
				//--------------FOR UPDATE THE DATA BY SELECTING THE ID-------------------
				
				
				System.out.print("Enter ID FOR UPDATE THE DATA: ");
				int id=sc.nextInt();
				
				System.out.print("Enter NEW NAME: ");
				String name=sc.next();
				
				System.out.print("Enter NEW EMAIL: ");
				String email=sc.next();
				
				System.out.print("Enter NEW PHONE: ");
				String phone=sc.next();
				
				System.out.print("Enter NEW AGE: ");
				int age=sc.nextInt();
				
				Student s=new Student(id,name,email,phone,age);
				
				sd.updateStudent(s);
				break;
				
			}
			
			case 5:{
				//-------------FOR DELETING THE DATA NY SELECTING THE ID------------------
				
				
				System.out.print("Enter ID FOR DELETE THE DATA: ");
				int id=sc.nextInt();
				
				sd.deleteStudent(id);
				break;
				
			}
			
			case 6:{
				//--------------FOR GETTING DETAILS BY NAME-----------------

				
				System.out.print("Enter NAME to find the Details : ");
				String name=sc.next();
				
				List<Student> l_res=sd.searchByName(name);
				
				for(Student s : l_res) {
					System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getEmail()+" "+s.getPhone()+" "+s.getAge() );
				}
				break;
				
			}
			
			case 7:{
				//------------FOR GETTING DETAILS BETWEEN MIN AND MAX AGE------------------
				
				
				System.out.print("Enter the MIN AGE: ");
				int min=sc.nextInt();
				
				System.out.print("Enter the MAX AGE: ");
				int max=sc.nextInt();
				
				List<Student> res=sd.searchByAgeRange(min, max);
				
				for(Student s:res) {
					System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getEmail()+" "+s.getPhone()+" "+s.getAge() );
				}
				break;
				
			}
			case 8:{
				//-----------FOR GETTING THE COUNT OF THE DETAILS--------------------
				
				
				int res=sd.countStudents();
				System.out.println("WE HAVE "+res+" SET OF DETAILS");
				break;
			}
			
			default:{
				System.out.println("ENTER VALID NUMBER FIELDS");
			}
			
			break;
			}
			break;
		}
		
		
		
		//-------------------------------COURSE-------------------------------------

		
		
		case 2:{
			System.out.println("\nENTER 1 TO INSERT COURSE DATA ");
			System.out.println("ENTER 2 TO GETTING ALL COURSE DATA ");
			System.out.println("ENTER 3 TO GETTING COURSE DATA BY ID");
			System.out.println("ENTER 4 TO UPDATE COURSE DATA BY ID");
			System.out.println("ENTER 5 TO DELETE COURSE DATA BY ID");
			System.out.println("ENTER 6 TO GETTING COURSE DATA BY NAME");
			System.out.println("ENTER 7 TO GETTING COURSE DATA BY DURATION");
			System.out.println("ENTER 8 TO GETTING COURSE DATA BETWEEN MIN FEES AND MAX FEES");
			System.out.println("ENTER 9 TO GETTING COURSE COUNT BY ID");

			CourseDAOImpl cd=new CourseDAOImpl();
			
			System.out.print("\nENTER HERE: ");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:{
				//-----------------FOR INSERTING DATA---------------------
				
				
				System.out.print("Enter COURSE ID: ");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter COURSE NAME: ");
				String name=sc.nextLine();
				
				System.out.print("Enter COURSE DURATION: ");
				String duration=sc.nextLine();
				
				System.out.print("Enter COURSE FEES: ");
				double fees=sc.nextDouble();
				
				Course c=new Course(id,name,duration,fees);
				
				cd.addCourse(c);
				break;
				
			}
			
			case 2:{
				// ---------------FOR GETTING ALL DETAILS-----------------

				List<Course> res = cd.getAllCourses();
				
				for(Course c:res) {
					System.out.println(c.getCourseId()+" "+c.getCourseName()+" "+c.getDuration()+" "+c.getFees());
				}
				break;
				
			}
			
			case 3:{
				//--------------FOR GETTING DETAILS BY ID-----------------
				
				
				System.out.print("Enter ID to find the Details : ");
				int id=sc.nextInt();
				
				Course c_res=cd.getCourseById(id);
				System.out.println(c_res.getCourseId()+" "+c_res.getCourseName()+" "+c_res.getDuration()+" "+c_res.getFees());
				break;
			}
			
			case 4:{
				//--------------FOR UPDATE THE DATA BY SELECTING THE ID-------------------

				
				System.out.print("Enter ID FOR UPDATE THE DATA'S: ");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter NEW COURSE NAME: ");
				String name=sc.nextLine();
				
				System.out.print("Enter NEW COURSE DURATION: ");
				String duration=sc.nextLine();
				
				System.out.print("Enter NEW COURSE FEES: ");
				double fees=sc.nextDouble();
				
				Course c=new Course(id,name,duration,fees);
				
				cd.updateCourse(c);
				break;
			}
			
			case 5:{
				//-------------FOR DELETING THE DATA NY SELECTING THE ID------------------
				
				
				System.out.print("Enter COURSE ID FOR DELETE THE DATA: ");
				int id=sc.nextInt();
				
				cd.deleteCourse(id);
				break;
			}
			
			case 6:{
				//--------------FOR GETTING DETAILS BY NAME-----------------

				
				System.out.print("Enter COURSE NAME to find the Details : ");
				String name=sc.next();
				
				List<Course> res=cd.searchByName(name);
				
				for(Course c:res) {
					System.out.println(c.getCourseId()+" "+c.getCourseName()+" "+c.getDuration()+" "+c.getFees());

				}
				break;
				 
			}
			
			case 7:{
				//--------------FOR GETTING DETAILS BY DURATION-----------------

				
				System.out.print("Enter DURATION to find the Details : ");
				String name=sc.nextLine();
				
				List<Course> res=cd.searchByDuration(name);
				
				for(Course c:res) {
					System.out.println("\n"+c.getCourseId()+" "+c.getCourseName()+" "+c.getDuration()+" "+c.getFees());
				}
				 
				break;
			}
			
			case 8:{
				//------------FOR GETTING DETAILS BETWEEN MIN AND MAX AGE------------------

				
				System.out.print("Enter the MIN FEES: ");
				int min=sc.nextInt();
				
				System.out.print("Enter the MAX FEES: ");
				int max=sc.nextInt();
				
				List<Course> res=cd.searchByFeeRange(min, max);
				
				for(Course c:res) {
					System.out.println("\n"+c.getCourseId()+" "+c.getCourseName()+" "+c.getDuration()+" "+c.getFees());
				}
				
				break;
			}
			
			case 9:{
				//-----------FOR GETTING THE COUNT OF THE DETAILS--------------------

				int res =cd.countCourses();
				System.out.println("WE HAVE "+res+" SET OF DETAILS");
				break;
			}
			
			default:{
				System.out.println("ENTER VALID NUMBER");
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
