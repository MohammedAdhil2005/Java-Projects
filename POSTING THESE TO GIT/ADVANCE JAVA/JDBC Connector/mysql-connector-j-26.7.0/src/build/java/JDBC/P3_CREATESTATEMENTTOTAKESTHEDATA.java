package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class P3_CREATESTATEMENTTOTAKESTHEDATA {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded!!1");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_base?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		System.out.println("Connection Established!!!");
		
		Statement stmt=con.createStatement();
		String q="Select * from t1";
		
		ResultSet res=stmt.executeQuery(q);
		
		while(res.next()) {
			System.out.println(res.getString(1)+":"+res.getString(2)+":"+res.getString(3));
		}
		
	}

}
