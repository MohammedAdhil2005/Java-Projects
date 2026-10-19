
package JDBC;

import java.sql.*;
import java.util.Properties;
import com.mysql.cj.jdbc.MysqlDataSource;

public class P2_ESTABLISH {

	 public static void main(String[] args) throws Exception
	    {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Connection Succeedd between prg and DB\n");
		    
		    
		    //Regular-------------
		    String url = "jdbc:mysql://localhost:3306/first_base?openTelemetry=DISABLED";
		    String un = "root";
	        String pwd = "Adhil@04102005";
	        
            Connection con = DriverManager.getConnection(url, un, pwd);
            System.out.println("1. Connection established");
            
           
            
            //URL Direct-------------
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_base?openTelemetry=DISABLED","root","Adhil@04102005");
            System.out.println("2. Connectedddd");
            
           
            
            //Properties-----------
            Properties p=new Properties();
		    String urll = "jdbc:mysql://localhost:3306/first_base?openTelemetry=DISABLED";
		    
		    p.setProperty("user", "root");
		    p.setProperty("Password", "Adhil@04102005");
		    
		    Connection con2=DriverManager.getConnection(urll,p);
		    System.out.println("3. Connnectedddd");
		    
		    
		    
		    
		    //MySql dataSource-----------
		    MysqlDataSource ms=new MysqlDataSource();
		    
		    ms.setURL("jdbc:mysql://localhost:3306/first_base?openTelemetry=DISABLED");
		    ms.setUser("root");
		    ms.setPassword("Adhil@04102005");
		    
		    Connection con3=ms.getConnection();
		    System.out.println("4. Connnectedddd");

	    }
	}
