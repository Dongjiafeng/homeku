package service.exception;

public class InvalidUsernameException extends LoginException{
    @Override
    public String getMessage() {
        return "用户名为空";
    }
}
