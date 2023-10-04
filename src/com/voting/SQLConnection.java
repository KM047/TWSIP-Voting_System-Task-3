package com.voting;

import java.sql.*;


public class SQLConnection {
 
    Connection con;

    Statement stamt;

    public SQLConnection(){

        

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/voting_system", "root", "root");
            
            stamt = con.createStatement();

            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
    
}
