package service;

import homework.Dao.UserDao;
import homework.users.User;
import service.Exception.InvalidUsernameException;
import service.Exception.LoginException;
import service.Exception.PasswordNotMatchedException;

public class UserService {
    private UserDao  userDao = new UserDao();
    public User login(User user) throws LoginException {
        User  userku = userDao.queryAll(user.getUsername());
        if (userku==null){
            throw new InvalidUsernameException();
        }
        if(!user.getPassword().equals(userku.getPassword())){
            throw  new PasswordNotMatchedException();
        }


        return userku;
    }


}
