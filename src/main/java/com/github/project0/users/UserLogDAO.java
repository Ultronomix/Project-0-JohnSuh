package com.github.project0.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.Statement;

import com.github.project0.common.datasource.ConnectionFactory;

public class UserLogDAO {

    public List<UserLog> getAllUsersLog() {
        String sql = "SELECT ls.log_date, ls.county, ls.species, ls.username" +
                     "FROM logs ls" +
                     "LEFT JOIN cicada_users cu ON ls.username=cu.username";

        List<UserLog> allUserLog = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                UserLog userLog = new UserLog();
                userLog.setLogDate(rs.getString("log_date"));
                userLog.setCounty(rs.getString("county"));
                userLog.setSpecies(rs.getString("species"));
                userLog.setUsername(rs.getString("username"));
                allUserLog.add(userLog);
            }
            
        } catch(SQLException e) {
            System.err.println("Bad things are happening.");
            e.printStackTrace();
        }

        return allUserLog;
                    
    }

    public String save(UserLog userLog) {

        String sql = "INSERT INTO logs (log_date, county, species, username)" +
                     "VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"log_date"});
            pstmt.setString(1, userLog.getLogDate());
            pstmt.setString(2, userLog.getCounty());
            pstmt.setString(3, userLog.getSpecies());
            pstmt.setString(4, userLog.getUsername());

            pstmt.executeUpdate();

        } catch(SQLException e) {
            System.err.println("Bad things are happening.");
            e.printStackTrace();
        }

        return "You have successfully made a new log";

    }
    
}
