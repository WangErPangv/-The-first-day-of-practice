package wby.laowang.loginxmt.view;

import wby.laowang.loginxmt.model.LoginBean;


public interface IMainView {

    void ShowLogin(LoginBean loginBean);

    void ShowlError(LoginBean loginBean);

    String mobile();

    String pass();
}
