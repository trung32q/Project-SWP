/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author tieup
 */
public class AccountDAO extends DBContext { // Follow Java naming conventions for class names


  
    // Use more specific List interface rather than ArrayList in the declaration
    private List<User> list = new ArrayList<>();

     PreparedStatement ps = null;
   ResultSet rs = null;

//    public  List<User> getAllStudent() {
//        List<User> List = new ArrayList<>();
//        String query = "select * from Account";
//        
//        try {
//           
//            ps = connection.prepareStatement(query);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                List.add(new User(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4)));
//            }
//        } catch (Exception e) {
//
//        }
//        return List;
//    }

    public boolean checkAccount(String email, String password) {
        try {
            String sql = "select * from Account\n" +
                   "where email=? And Password=?";
         ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                User cA = new User( rs.getString("password"),rs.getString("email"));
                return true;
            }
        } catch (SQLException e) {
            // Consider logging the exception instead of just printing it
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
         AccountDAO dao =new AccountDAO();
        boolean hi =dao.checkAccount("trungvdhe172137@fpt.edu.vn","trunglun3q");
        System.out.println(hi);
    }
}
