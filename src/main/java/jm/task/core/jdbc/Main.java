package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userService = new UserServiceImpl();

        // 1. Создаем таблицу Users.
        userService.createUsersTable();

        // 2. Добавляем 4 User(ов) в таблицу с данными.
        userService.saveUser("Andrey", "Bogdanov", (byte) 35);
        userService.saveUser("Ivan", "Ivanov", (byte) 16);
        userService.saveUser("Vadim", "Sokolov", (byte) 25);
        userService.saveUser("Denis", "Barnaev", (byte) 30);

        // 3. Получение всех User из базы.
        List<User> list = userService.getAllUsers();
        list.forEach(System.out::println);

        // 4. Очистка таблицы от User(ов).
        userService.cleanUsersTable();

        // 5. Удаление таблицы.
        userService.dropUsersTable();
    }
}
