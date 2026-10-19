package ACCOUNT_PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class P5_DELETEDATA {

	public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qsp_project_jdbc?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		
		String dq="DELETE FROM account WHERE acc_no=?";
        PreparedStatement pstmt = con.prepareStatement(dq);
		
		System.out.print("Enter the Account number to DELETE: ");
		int no=sc.nextInt();
		
		pstmt.setInt(1, no);
		
		pstmt.execute();
	    System.out.println("Account Deleted Successfully");
	    
	}

}
