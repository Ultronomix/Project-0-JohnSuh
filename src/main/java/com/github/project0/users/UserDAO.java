package com.github.project0.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.Statement;

import com.github.project0.common.datasource.ConnectionFactory;

public class UserDAO {
    public List<User> getAllUsers() {
        String sql = "SELECT cu.id, cu.username, cu.given_name, cu.email, cu.password" +
                     "FROM cicada_users cu";

        List<User> allUsers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getString("id"));
                user.setUsername(rs.getString("username"));
                user.setGivenName(rs.getString("given_name"));
                user.setEmail(rs.getString("email"));
                user.setPassword("********");
                allUsers.add(user);
            }
            
        } catch(SQLException e) {
            System.err.println("Bad things are happening.");
            e.printStackTrace();
        }

        return allUsers;
                    
    }

    public String save(User user) {

        String sql = "INSERT INTO cicada_users (username, given_name, email, password) " +
                     "VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"id"});
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getGivenName());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());

            pstmt.executeUpdate();

            conn.commit();

            ResultSet rs = pstmt.getGeneratedKeys();
            rs.next();
            user.setId(rs.getString("id"));

        } catch(SQLException e) {
            System.err.println("Bad things are happening.");
            e.printStackTrace();
        }

        return user.getId();
    }
}
