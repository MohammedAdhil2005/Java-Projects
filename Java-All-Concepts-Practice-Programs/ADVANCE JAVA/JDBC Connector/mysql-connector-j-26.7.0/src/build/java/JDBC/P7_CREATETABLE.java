package JDBC;

import java.sql.*;
import java.util.Scanner;

public class P7_CREATETABLE {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_base?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		System.out.println("Connection Establishhhhed");
		
		/* CREATE TABLE QUERY
		String cq="Create table t2( id INT PRIMARY KEY,name VARCHAR(100), age INT, Phoneno VARCHAR(20) )";
		Statement stmt=con.createStatement();
		
		stmt.execute(cq);
		System.out.println("Query Executeddddd");
		*/
		
		String iq="insert into t2(?,?,?,?)";
		
		PreparedStatement pstmt=con.prepareStatement(iq);
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter how many datas you need to add: ");
		int times=sc.nextInt();
		
		for(int i=1;i<=times;i++)
		{
		int id=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, age);
		
		pstmt.addBatch();
		}
		
		pstmt.executeBatch();
		System.out.println("Data inserted successfully!");
		
	}

}
