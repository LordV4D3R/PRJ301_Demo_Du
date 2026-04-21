/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.DBUtils;

/**
 *
 * @author Vader
 */
public class AccountDAO { // Data Access Object -> Data Access Layer

    // đọc file, sử dụng sao em đọc được ? 
    // cách vận hành của đọc file
    // Scanner của java -> Scanner scanner = new Scanner
    // hàm kiểm tra đăng nhập
    // Account id là 1 có 2 bài id là 3 và 4
    public String checkLogin(String username, String password) throws SQLException {
        AccountDTO account = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        String resultString = "Error";

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT address, age FROM Account WHERE username = ? AND password = ?");
                ptm.setString(1, username);
                ptm.setString(2, password);

                rs = ptm.executeQuery(); // list -> 
                // khi khong ket qua -> khong hien gi -> co phai = 0 không ?
                if (rs.next()) { // co ket qua la true
                    resultString = "Login success";
                    String address = rs.getString("address");
                    int age = rs.getInt("age");
                    account = new AccountDTO(username, password, address, age);
                } else {
                    resultString = "Login fail";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return resultString;
    }

    public AccountDTO createAccount(AccountDTO accout) {
        AccountDTO accountDTO = null;

        return accountDTO;
    }
}
