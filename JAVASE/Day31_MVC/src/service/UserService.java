package service;

import Dao.UserDao;
import domain.User;
import service.exception.InvalidUsernameException;
import service.exception.LoginException;
import service.exception.PasswordNotMatchedException;

public class UserService {
   private   UserDao userDao = new UserDao();
    public User Login(User user) throws LoginException {
        User formDb = userDao.queryByUserName(user.getUsername());
        if (formDb == null){
            throw new InvalidUsernameException();
        }
        //如果查出的用户名与输入的用户名不相同
        if (!formDb.getPassword().equals(user.getPassword())){
            //抛出密码不匹配
            throw  new PasswordNotMatchedException();
        }
        return  formDb;

    }
}
