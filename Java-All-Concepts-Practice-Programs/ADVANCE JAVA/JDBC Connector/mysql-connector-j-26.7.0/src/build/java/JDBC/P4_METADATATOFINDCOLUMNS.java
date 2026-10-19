package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class P4_METADATATOFINDCOLUMNS  {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded!!");
		
		String url="jdbc:mysql://localhost:3306/first_base?openTelemetry=DISABLED&user=root&password=Adhil@04102005";
		Connection con=DriverManager.getConnection(url);
		System.out.println("Connection Established!!");
		
		Statement stmt=con.createStatement();
		String q="Select * from t1";
		
		ResultSet res=stmt.executeQuery(q);
		
		ResultSetMetaData meta=res.getMetaData();
		
		System.out.println("\nColumn count is ---> "+meta.getColumnCount());
		
		System.out.println("Column name are --> "+meta.getColumnName(1)+", "+meta.getColumnName(2)+", "+meta.getColumnName(3)+", ");
		
		System.out.println("Column Types are --> "+meta.getColumnTypeName(1)+", "+meta.getColumnTypeName(2)+", "+meta.getColumnTypeName(3));
		
		System.out.println("\nTable datas are  ---> ");
		
		System.out.println(meta.getColumnName(1)+":"+meta.getColumnName(2)+":"+meta.getColumnName(3));
		System.out.println("-----------");

		while(res.next()){
			System.out.println(res.getInt(1)+":"+res.getString(2)+":"+res.getInt(3));
		}

	}

}
