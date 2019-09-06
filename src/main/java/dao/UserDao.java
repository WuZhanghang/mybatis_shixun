package dao;

import domain.User;

import java.util.List;

public interface UserDao {

    public User findById(Integer id);
    public List<User> findUsersWithAccounts2();

}
