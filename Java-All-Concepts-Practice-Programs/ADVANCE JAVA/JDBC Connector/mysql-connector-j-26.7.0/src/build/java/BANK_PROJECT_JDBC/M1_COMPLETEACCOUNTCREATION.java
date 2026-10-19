package BANK_PROJECT_JDBC;

import java.sql.*;
import java.util.Scanner;

public class M1_COMPLETEACCOUNTCREATION {

	static Scanner sc=new Scanner(System.in);
	
	//----------CONNECTION------------
	
	public static void connection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");		
	}
	
	//----------TABLE CREATION------------

	public static void createtable() throws Exception{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank_project_jdbc?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		String cq="CREATE TABLE account(acc_no INT PRIMARY KEY, name VARCHAR(20), password VARCHAR(20), balance INT)";
		Statement stmt = con.createStatement();
		stmt.execute(cq);
		
		System.out.println("Table Createddd");
	}
	
	//----------INSERT DATA------------

	public static void inserttable() throws Exception{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank_project_jdbc?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
        
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
	
	
	//----------LOGIN AND COMPLETE CODE------------

	public static void login() throws Exception{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank_project_jdbc?openTelemetry=DISABLED&user=root&password=Adhil@04102005");
		System.out.println("\n<-- WELCOME TO QSP BANK -->\n");
		
		System.out.print("ENTER YOUR ACCOUNT_NO : ");
		int no=sc.nextInt();
		
		System.out.print("ENTER YOUR PASSWORD : ");
		String pwd=sc.next();
		
		String sq="SELECT * FROM account WHERE acc_no=? AND password=?";
		PreparedStatement pstmt = con.prepareStatement(sq);
		
		pstmt.setInt(1, no);
		pstmt.setString(2, pwd);
		
	    ResultSet res = pstmt.executeQuery();
	    
	    if(res.next()) {
	    	
	    	//----------WELCOME AND RECEIVER SECTION------------
 
			System.out.println("\nWELCOME ---> "+res.getString(2)+"\nYOUR ACCOUNT BALANCE IS ---> "+res.getInt(4));
			
			System.out.print("\nENTER RECEIVER ACCOUNT NO : ");
			int r_no=sc.nextInt();
			
			String r_sq="SELECT * FROM account WHERE acc_no=?";
			PreparedStatement r_pstmt = con.prepareStatement(r_sq);
			
			r_pstmt.setInt(1, r_no);
			
		    ResultSet r_res = r_pstmt.executeQuery();
		    
		    boolean resss=r_res.next();
		    
		    if(resss && res.getInt(1)!=r_no) {
		    	
		    	//----------AMOUNT TRANSFER SECTION------------
		    	
		    	System.out.print("ENTER TRANSFER AMOUNT : ");
				int Tno=sc.nextInt();
				
				if(Tno<=res.getInt(4) && Tno>0) {
					
					//----------AMOUNT ACCEPTING SECTION ------------

					System.out.println("\n<-- INCOMING CREDIT REQUEST --> "+"\n\n Hi "+r_res.getString(2));
					
					System.out.println("\nPLEASE PRESS 'Y' TO RECEIVE ");
					System.out.println("PLEASE PRESS 'N' TO REJECT ");
					
					System.out.print("\nPLEASE ENTER YOUR RESPONSE HERE : ");
					String s=sc.next();
					
					if(s.equalsIgnoreCase("Y")) {
						
						//----------UPDATE SENDER BALANCE (-)------------

						String Send_q="UPDATE account SET balance = balance - ? WHERE acc_no=?";
						PreparedStatement Send_pstmt=con.prepareStatement(Send_q);
						
						Send_pstmt.setInt(1, Tno);
						Send_pstmt.setInt(2, no);
						
						Send_pstmt.execute();
						
						//----------UPDATE RECEIVER BALANCE (+)------------

						String Receive_q="UPDATE account SET balance = balance + ? WHERE acc_no=?";
                        PreparedStatement Receive_pstmt=con.prepareStatement(Receive_q);
						
                        Receive_pstmt.setInt(1, Tno);
                        Receive_pstmt.setInt(2, r_no);
						
                        Receive_pstmt.execute();
                        
                        System.out.println("\n<--- AMOUNT TRANSFERRED SUCCESSFULLY --->");
                        
						//----------PRINT SENDER NAME AND BALANCE------------

                        String Display_send="SELECT name, balance FROM account WHERE acc_no=?";
                        PreparedStatement D_stmt=con.prepareStatement(Display_send);
                        
                        D_stmt.setInt(1, no);
                                                
                        ResultSet D_res = D_stmt.executeQuery();
                        
                        if(D_res.next()) {
                        	System.out.println("\n"+D_res.getString("name")+"'s CURRENT BALANCE IS --> "+D_res.getInt("balance"));
                        }
                        
						//----------PRINT RECEIVER NAME AND BALANCE------------

                        String Display_Receive="SELECT name, balance FROM account WHERE acc_no=?";
                        PreparedStatement R_stmt=con.prepareStatement(Display_Receive);
                        
                        R_stmt.setInt(1, r_no);
                                                
                        ResultSet R_res = R_stmt.executeQuery();
                        
                        if(R_res.next()) {
                        	System.out.println("\n"+R_res.getString("name")+"'s CURRENT BALANCE IS --> "+R_res.getInt("balance"));
                        }


					}
					else {
						
						//----------TRANSFER AMOUNT REJECTION SECTION------------

						System.out.println("\nHEY "+res.getString(2)+" ---> "+r_res.getString(2)+" IS NOT ACCEPTING YOUR MONEYYYY");
					}

				}
				else {
					if(Tno>res.getInt(4)){
						System.out.println("\n!!! AMOUNT INSUFFICIENT !!!");
					}
					else if(Tno<=0) {
						System.out.println("\n!!! PLEASE ENTER VALID TRANSFER AMOUNT !!!");
					}
				}
			}
		    
			else {
				System.out.println("\n!!! ACCOUNT NOT FOUND !!!"+"\n\n"+"[PLEASE CROSS CHECK YOUR RECEIVER ACCOUNT NUMBER AND PASSWORD]");
			}
		}
		else {
			System.out.println("\n!!! ACCOUNT NOT FOUND !!!"+"\n\n"+"[PLEASE CROSS CHECK YOUR ACCOUNT NUMBER AND PASSWORD]");
		}
	    
	    
	}
	
	public static void main(String[] args) throws Exception {

		M1_COMPLETEACCOUNTCREATION call=new M1_COMPLETEACCOUNTCREATION();
		
		call.connection();
		
		//call.createtable();
		//call.inserttable();
		
		call.login();
		
		
	}

}
