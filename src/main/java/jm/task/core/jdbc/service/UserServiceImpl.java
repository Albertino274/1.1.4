package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    // Создание таблицы
    @Override
    public void createUsersTable() throws SQLException, ClassNotFoundException {
        userDao.createUsersTable();
    }

    // Удаление таблицы
    @Override
    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    // Добавляет user
    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("User с " + name + " добавлен в базу данных.");
    }

    // Удаляет по id
    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    // Вывод таблицы
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    // Очистка таблицы
    @Override
    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
