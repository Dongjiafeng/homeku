package Dao;

import domain.User;

public class UserDao {
    public User queryByUserName(String username){
        User u = new User();
        if (username.equals("123")){
            u.setUsername("123");
            u.setPassword("666");
            return u;
        }else {
            return null;
        }
    }
}
