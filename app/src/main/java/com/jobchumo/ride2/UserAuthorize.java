package com.jobchumo.ride2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserAuthorize {

    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;


    public boolean Logins(String user, String pass) {
        boolean found = false;
        con = DBConnect.DBConnection();
        String qry = "SELECT * FROM users WHERE username = ? AND password = ?";
        try {
            stm = con.prepareStatement(qry);
            stm.setString(1, user);
            stm.setString(2, pass);
            rs = stm.executeQuery();

            if(rs.next()) {
                found = true;
                return found;
            } else {
                found = false;
                return found;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return found;
    }


    public boolean registerUser(String firstname, String lastname, String phone, String username, String password) {
        boolean registered = false;
        con = DBConnect.DBConnection();
        String qry = "INSERT INTO users (first_name, last_name, phone, username, password) VALUES (?, ?, ?, ?, ?. ?)";
        try {
            stm = con.prepareStatement(qry);
            stm.setString(1, firstname);
            stm.setString(2, lastname);
            stm.setString(3, phone);
            stm.setString(4, username);
            stm.setString(5, password);
            stm.executeUpdate();

            registered = true;
            return registered;

        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return registered;
    }

}
