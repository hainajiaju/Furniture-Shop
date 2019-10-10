package cn.haina.exception;

public class UserLoginFailedException extends Exception{
    public UserLoginFailedException(String msg){
        super(msg);
    }
}
