package ACCOUNT_PROJECT;

import java.sql.*;
import java.util.Scanner;

public class P2_INSERTDATA {

	public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qsp_project_jdbc?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		
		String iq="INSERT INTO account values(?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(iq);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of acoounts to add: ");
		int times=sc.nextInt();
		
		con.setAutoCommit(false);
		for(int i=1;i<=times;i++) {
			
			System.out.print("Enter the Account no --> ");
			int no=sc.nextInt();
			
			System.out.print("Enter the Accounter NAME --> ");
			String name=sc.next();
			
			System.out.print("Enter the Account password --> ");
			String pwd=sc.next();
			
			System.out.print("Enter the Account Balance --> ");
			int bal=sc.nextInt();
						
		    pstmt.setInt(1,no);
		    pstmt.setString(2,name);
		    pstmt.setString(3,pwd);
		    pstmt.setLong(4,bal);
		
		    pstmt.executeUpdate();
		}
		con.commit();
		System.out.println("Inserted Successfullyy");
		
		
	}

}
