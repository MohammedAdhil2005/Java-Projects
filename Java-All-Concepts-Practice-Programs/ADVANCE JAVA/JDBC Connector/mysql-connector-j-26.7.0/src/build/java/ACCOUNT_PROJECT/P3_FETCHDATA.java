package ACCOUNT_PROJECT;

import java.sql.*;

public class P3_FETCHDATA {

	public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/qsp_project_jdbc?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		
		String sq="SELECT * FROM account";
		Statement stmt=con.createStatement();
		
		ResultSet res = stmt.executeQuery(sq);
		
		while(res.next()) {
			System.out.println(res.getInt(1)+" : "+res.getString(2)+" : "+res.getString(3)+" : "+res.getInt(4));
		}
		
		
	}

}

