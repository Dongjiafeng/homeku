package service.exception;

public class LoginException extends Exception {
    @Override
    public String getMessage() {
        return "你什么都错了";
    }
}
