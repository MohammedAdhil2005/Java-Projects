package PROJECT_JDBC;

import java.sql.*;
import java.util.Scanner;


class emp{
	
	private int eid;
	private String ename;
	private int eage;
	private long ephoneno;
	
	emp(int eid,String ename,int eage,long ephoneno){
		this.eid=eid;
		this.ename=ename;
		this.eage=eage;
		this.ephoneno=ephoneno;
	}
	
	
	public int getid() {
		return eid;
	}
	public void setid(int id) {
		this.eid=id;
	}
	
	
	public String getname() {
		return ename;
	}
	public void setname(String name) {
		this.ename=name;
	}
	
	
	public int getage() {
		return eage;
	}
	public void setage(int age) {
		this.eage=age;
	}
	
	
	public long getphoneno() {
		return ephoneno;
	}
	public void setphoneno(long phoneno) {
		this.ephoneno=phoneno;
	}
	
}


public class P1_EmployeeDB {
	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_project?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		
		/*Create Table 
		String cq="CREATE TABLE EMP (EMP_ID INT PRIMARY KEY, EMP_NAME VARCHAR(40), EMP_AGE INT, EMP_PHONENO VARCHAR(20))";
		Statement stmt=con.createStatement();
		stmt.execute(cq);*/
		
		String iq="INSERT INTO EMP VALUES(?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(iq);
		
		System.out.print("Enter the number of employees to add: ");
		int times=sc.nextInt();
		
		con.setAutoCommit(true);
		for(int i=1;i<=times;i++) {
			
			System.out.print("Enter the Employee ID --> ");
			int id=sc.nextInt();
			
			System.out.print("Enter the Employee NAME --> ");
			String ename=sc.next();
			
			System.out.print("Enter the Employee AGE --> ");
			int eage=sc.nextInt();
			
			System.out.print("Enter the Employee PHONE NUMBER --> ");
			long phoneno=sc.nextLong();
			
			emp e=new emp(id,ename,eage,phoneno);
			
		    pstmt.setInt(1,e.getid());
		    pstmt.setString(2,e.getname());
		    pstmt.setInt(3,e.getage());
		    pstmt.setLong(4,e.getphoneno());
		
		    pstmt.executeUpdate();
		}
		con.commit();
				
		String sq="SELECT * FROM EMP";
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(sq);
		
		System.out.println("\nThe table datas are ---> \n");
		while(res.next()) {
			System.out.println(res.getInt(1)+" : "+res.getString(2)+" : "+res.getInt(3)+" : "+res.getLong(4));
		}
		
		sc.close();
		pstmt.close();
		stmt.close();
		
	}

}
