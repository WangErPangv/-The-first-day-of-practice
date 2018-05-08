package wby.laowang.loginxmt.model;

import java.util.Map;

public interface IModel {

    void getLogin(String murl, Map<String,String> map,LoginListener loginListener);

    void getRegister(String rurl, Map<String,String> map,RegisterListener registerListener);
}
