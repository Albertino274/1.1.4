package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/bd";
    static final String USER = "root";
    static final String PASSWORD = "root1";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Драйвер базы данных не найден", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}