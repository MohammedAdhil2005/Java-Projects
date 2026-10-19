package ACCOUNT_PROJECT;

import java.sql.*;

public class P1_TABLECREATION {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qsp_project_jdbc?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		
		String cq="CREATE TABLE account(acc_no INT PRIMARY KEY, name VARCHAR(20), password VARCHAR(20), balance INT)";
	
		Statement stmt = con.createStatement();
		stmt.execute(cq);
		System.out.println("Table Createddd");

	}

}
