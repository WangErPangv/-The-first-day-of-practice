package wby.laowang.loginxmt.presenter;

import wby.laowang.loginxmt.model.IModel;
import wby.laowang.loginxmt.view.IMainView;
import wby.laowang.loginxmt.view.IRegister;

public interface IPresenter {

    void ShowLogintoView(IModel iModel, IMainView iMainView);

    void ShowRegistertoView(IModel iModel, IRegister iRegister);
}
