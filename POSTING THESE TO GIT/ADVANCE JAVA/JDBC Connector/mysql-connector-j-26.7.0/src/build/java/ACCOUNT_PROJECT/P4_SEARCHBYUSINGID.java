package ACCOUNT_PROJECT;

import java.sql.*;
import java.util.Scanner;

public class P4_SEARCHBYUSINGID {

	public static void main(String[] args) throws Exception{
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qsp_project_jdbc?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		
		String sq="SELECT * FROM account WHERE acc_no=?";
		PreparedStatement pstmt = con.prepareStatement(sq);
		
		System.out.print("Enter the Account number to FIND: ");
		int no=sc.nextInt();
		
		pstmt.setInt(1, no);
		
		pstmt.execute();
		
	    ResultSet res = pstmt.executeQuery();
		
		if(res.next()) {
			System.out.println("\nYOUR DATA IS ---> "+res.getInt(1)+" : "+res.getString(2)+" : "+res.getString(3)+" : "+res.getInt(4));
		}
		else {
			System.out.println("NOT foundddd");
		}
	}

}
