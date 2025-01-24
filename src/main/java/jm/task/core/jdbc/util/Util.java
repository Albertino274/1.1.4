package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bd";
    private static final String USER = "root";
    private static final String PASSWORD = "root1";

    static {
        try {
            Class.forName(DRIVER); // Загрузка драйвера при инициализации класса
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Драйвер базы данных не найден", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}