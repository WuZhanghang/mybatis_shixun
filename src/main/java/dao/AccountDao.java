package dao;

import domain.Account;

import java.util.List;

public interface AccountDao {

    public List<Account> findAll();
    List<Account> findByUid(Integer uid);

}
