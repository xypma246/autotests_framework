package org.powerbank;

import org.powerbank.utils.dbManagementUtils.ConnectionManager;
import org.powerbank.utils.dbManagementUtils.DbNamesConstants;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String dbName = DbNamesConstants.PB_ACCOUNT;
        try (Connection conn = ConnectionManager.getConnection(dbName)) {

            if (conn.isValid(2)) {
                System.out.println("Connection is valid (isValid)");
            } else {
                System.out.println("Connection is NOT valid (isValid)");
            }


        } catch (SQLException e) {
            System.err.println("Не удалось получить или проверить соединение:");
            e.printStackTrace();
        }
    }
}
