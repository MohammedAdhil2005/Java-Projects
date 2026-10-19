package ACCOUNT_PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class P6_UPDATEDATA {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qsp_project_jdbc?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		
		String uq="UPDATE account SET name=?  WHERE acc_no=? ";
        PreparedStatement pstmt = con.prepareStatement(uq);
		
		System.out.print("Enter the Account number to UPDATE: ");
		int no=sc.nextInt();
		
		pstmt.setString(1, "MohammedAdhil");
		pstmt.setInt(2, no);
		
		pstmt.execute();
		System.out.println("Data UPDATED");
	}

}
