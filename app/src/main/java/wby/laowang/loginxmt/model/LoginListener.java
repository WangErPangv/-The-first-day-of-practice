package wby.laowang.loginxmt.model;

public interface LoginListener {

    void LoginSuccess(String json);

    void LoginError(String error);
}
