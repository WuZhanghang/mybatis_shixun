import dao.AccountDao;
import dao.UserDao;
import domain.Account;
import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import java.io.InputStream;
import java.util.List;


public class testUser {

    private InputStream inputStream;
    private SqlSession session;



    private AccountDao accountDao;
    private UserDao userDao;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
        userDao = session.getMapper(UserDao.class);
        accountDao=session.getMapper(AccountDao.class);
    }


    @After
    public void destory() throws IOException {
          session.close();
          inputStream.close();
    }




            @Test
    public void findAll(){
        List<Account> accounts=accountDao.findAll();
    }

    @Test
    public void findAllUser(){
        List<User> usersWithAccounts2 = userDao.findUsersWithAccounts2();
        //        System.out.println(usersWithAccounts2.get(0).getAccounts());
    }

}
