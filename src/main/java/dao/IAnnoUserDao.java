package dao;

import domain.User;
import domain.User2;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IAnnoUserDao {


    @Select(value={"select *from user"})
    @Results(id="abc",value={
            @Result(column = "id",property = "uid",id=true),
            @Result(column = "username",property = "username"),
            @Result(column = "sex",property = "u_sex"),
            @Result(column = "address",property = "u_address"),
            @Result(column = "birthday",property = "u_birthday")
    })
    public List<User2> findAll();


    @Insert(value = "insert into user(username,sex,adderss,birthday)values(#{username},#{sex},#{address},#{birthday})")
    @Options(keyColumn = "id",keyProperty = "id",useGeneratedKeys = true)
    public int saveUser(User user);




    @Select("select * from user")
    @Results(id="acs",value = {
            @Result(column = "id",property = "id",id=true),
            @Result(column = "username",property = "username"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "address",property = "address"),
            @Result(column = "birthday",property = "birthday"),
            @Result(property = "accounts",many = @Many(select = "dao.AccountDao.findByUid",fetchType = FetchType.LAZY),column = "id")


    })
    public List<User> findUsersWithAccountsAnno();

}
