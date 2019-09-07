package domain;


import lombok.Data;

import java.util.Date;

@Data
public class User2 {
    private Integer uid;
    private String userName;
    private Date u_birthday;
    private String u_sex;
    private String u_address;

    @Override
    public String toString() {
        return "User2{" +
                "uid=" + uid +
                ", userName='" + userName + '\'' +
                ", u_birthday=" + u_birthday +
                ", u_sex='" + u_sex + '\'' +
                ", u_address='" + u_address + '\'' +
                '}';
    }
}
