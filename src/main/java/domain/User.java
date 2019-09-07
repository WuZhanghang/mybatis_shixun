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
    private java.awt.List abc;
}
