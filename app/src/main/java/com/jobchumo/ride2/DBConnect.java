package com.jobchumo.ride2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    Connection con = null;

    public static Connection DBConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/ride_share";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            return con;
        }catch(Exception ex){

            return null;
        }
    }
}
