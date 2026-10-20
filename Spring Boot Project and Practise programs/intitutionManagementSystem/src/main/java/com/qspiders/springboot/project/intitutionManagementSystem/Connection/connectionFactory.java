package com.qspiders.springboot.project.intitutionManagementSystem.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionFactory {
    private static String url = "jdbc:mysql://localhost:3306/emp_manage_springboot";
    private static String user="root";
    private static String password="Adhil@04102005";
    
    public static Connection ConnectionFactory() throws Exception{
        return DriverManager.getConnection(url,user,password);
    }

}
