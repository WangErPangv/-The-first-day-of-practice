package wby.laowang.loginxmt.presenter;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import wby.laowang.loginxmt.model.IModel;
import wby.laowang.loginxmt.model.LoginBean;
import wby.laowang.loginxmt.model.LoginListener;
import wby.laowang.loginxmt.model.RegisterBean;
import wby.laowang.loginxmt.model.RegisterListener;
import wby.laowang.loginxmt.util.ApiUtil;
import wby.laowang.loginxmt.view.IMainView;
import wby.laowang.loginxmt.view.IRegister;

public class PresenterFusion implements IPresenter {
    @Override
    public void ShowLogintoView(IModel iModel, final IMainView iMainView) {

        Map<String, String> lmap = new HashMap<>();
        lmap.put("mobile",iMainView.mobile());
        lmap.put("password",iMainView.pass());

        iModel.getLogin(ApiUtil.login_url, lmap, new LoginListener() {
            @Override
            public void LoginSuccess(String json) {

                LoginBean loginBean = new Gson().fromJson(json, LoginBean.class);
                iMainView.ShowLogin(loginBean);
            }

            @Override
            public void LoginError(String error) {
                LoginBean loginBean = new Gson().fromJson(error, LoginBean.class);
                iMainView.ShowlError(loginBean);
            }
        });
    }

    @Override
    public void ShowRegistertoView(IModel iModel, final IRegister iRegister) {

        Map<String, String> rmap = new HashMap<>();
        rmap.put("mobile",iRegister.mobile());
        rmap.put("password",iRegister.pass());

        iModel.getRegister(ApiUtil.register_url, rmap, new RegisterListener() {
            @Override
            public void RegisterSuccess(String json) {

                RegisterBean registerBean = new Gson().fromJson(json, RegisterBean.class);
                iRegister.ShowqRegister(registerBean);
            }

            @Override
            public void RegisterError(String error) {

                RegisterBean registerBean = new Gson().fromJson(error, RegisterBean.class);
                iRegister.ShowrError(registerBean);
            }
        });
    }


}
