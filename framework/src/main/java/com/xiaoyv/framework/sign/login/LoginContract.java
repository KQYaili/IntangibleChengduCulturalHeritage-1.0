package com.xiaoyv.framework.sign.login;

import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface LoginContract {
    interface View extends BaseView<Presenter> {

        void showError(String error);

        void onSuccess();

        void showProgress();

        void hideProgress();
    }

    interface Presenter extends BasePresenter {

        void login(String phone, String password);
    }
}
