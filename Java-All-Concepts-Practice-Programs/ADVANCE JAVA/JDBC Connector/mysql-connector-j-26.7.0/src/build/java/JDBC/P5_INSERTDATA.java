package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class P5_INSERTDATA {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_base?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		System.out.println("Connection Establishedd");
		
		Statement stmt=con.createStatement();
		
		String Sq="Select * from t1";
		ResultSet res=stmt.executeQuery(Sq);
		
		ResultSetMetaData meta=res.getMetaData();
	
		System.out.println("Column names are --> "+meta.getColumnName(1)+":"+meta.getColumnName(2)+":"+meta.getColumnName(3));
		
		
		/* Insertion Section 

		String q="Insert into t1 values(8,'Adhil',21)";
		int result=stmt.executeUpdate(q);
		
		System.out.println(result+" row inserted ");	*/
		
		
		
		/*Batch Insertion
		
		String q1="Insert into t1 values(5,'Gokul',20)";
		String q2="Insert into t1 values(6,'Pandya',20)";
		String q3="Insert into t1 values(7,'Anbu',21)";
		
		stmt.addBatch(q1);
		stmt.addBatch(q2);
		stmt.addBatch(q3);
		
		stmt.executeBatch();*/

		
		
		System.out.println("\n<-- After Insertion --> \n");
		while(res.next()) {
		System.out.println(res.getInt(1)+":"+res.getString(2)+":"+res.getInt(3));
		}
		

	}

}
