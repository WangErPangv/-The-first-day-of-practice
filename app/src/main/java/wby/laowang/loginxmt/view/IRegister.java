package wby.laowang.loginxmt.view;


import wby.laowang.loginxmt.model.RegisterBean;

public interface IRegister {

    void ShowqRegister(RegisterBean registerBean);

    void ShowrError(RegisterBean registerBean);

    String mobile();

    String pass();
}
