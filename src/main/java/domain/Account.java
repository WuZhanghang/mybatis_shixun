package domain;


import lombok.Data;

@Data
public class Account {

    private Integer id;
    private Integer uid;
    private Double money;
    private User user;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
