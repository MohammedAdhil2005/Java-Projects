package connection;

import java.sql.*;

public class ConnectionFactory {

		private static final String url="jdbc:mysql://localhost/customer_db?openTelemetry=DISABLED";
		
															  //student_db
		
		private static final String user="root";		
		private static final String password="Adhil@04102005";
		
		 public static Connection getConnection() {
			 Connection con=null;
			 try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
			 	 con= DriverManager.getConnection(url,user,password);
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 return con;
	}
}

