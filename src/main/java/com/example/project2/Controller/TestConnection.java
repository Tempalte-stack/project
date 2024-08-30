package com.example.project2.Controller;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {


        public static String url="jdbc:sqlserver://localhost:1433;databaseName=Project10;encrypt=true;trustServerCertificate=true";
        public static String user ="sa";
        public static String pass="12345";
        static {
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            }catch(ClassNotFoundException ex){
                System.out.println("Khong tim thay driver");
                ex.printStackTrace();
            }
        }
        public static Connection getConnection(){
            Connection con = null;
            try{
                con= DriverManager.getConnection(url, user, pass);
            }catch(SQLException ex){
                System.out.println("Ket noi khong thanh cong .");
                ex.printStackTrace();
            }
            return con;
        }
        public static void  main (String[]args){
            Connection con = getConnection();
            if(con!= null){
                System.out.println("sql !");

            }else{
                System.out.println ("Lỗi !");}

        }
    }
