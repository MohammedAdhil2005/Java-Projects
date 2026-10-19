package JDBC;
import java.sql.*;
import java.util.Scanner;

public class P6_QUERYUSERINPUT {

	public static void main(String[] args) //throws Exception 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner sc=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded!");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_base?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
			System.out.println("Connection Establishhhhed");
			
			String q="insert into t1(id,name,age) values (?,?,?)";
			pstmt=con.prepareStatement(q);
			
			sc=new Scanner(System.in);
	
			System.out.print("Enter how many datas you need to add: ");
			int times=sc.nextInt();
			
			for(int i=1;i<=times;i++)
			{
			int id=sc.nextInt();
			String name=sc.next();
			int age=sc.nextInt();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			
			pstmt.addBatch();
			}
			
			pstmt.executeBatch();
			System.out.println("Data inserted successfully!");
			
			
			//Print the Table 
			String q1="Select * from t1";
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery(q1);
			
			System.out.println("\nThe Table datas are ---> ");
			while(res.next()) {
				System.out.println(res.getInt(1)+":"+res.getString(2)+":"+res.getInt(3));
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				pstmt.close();
				sc.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
