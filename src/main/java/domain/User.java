package domain;


import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class User {
    private Integer id;
    private String school;
    private String email;
    private String username;
    private Date birthday;
    private String address;
    private String sex;
    private List<Account> accounts;
    private String dog;
    

    public void say(){
        System.out.println("aloha");
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", school='" + school + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
