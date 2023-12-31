package com.xiaoyv.framework.sign.login;

import androidx.annotation.NonNull;

import com.blankj.utilcode.util.Utils;
import com.xiaoyv.account.UserManager;
import com.xiaoyv.account.listener.OnUserDataListener;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class LoginPresenter implements LoginContract.Presenter {

    @NonNull
    private final LoginContract.View view;

    LoginPresenter(@NonNull LoginContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void login(String phone, String password) {
        view.showProgress();

        UserManager.login(phone, password, new OnUserDataListener() {
            @Override
            public void onError(String error) {
                view.hideProgress();
                view.showError(error);
            }

            @Override
            public void onSuccess() {
                // 模拟登录用时2秒
                Utils.runOnUiThreadDelayed(() -> {
                    view.hideProgress();
                    view.onSuccess();
                }, 2000);
            }
        });

    }
}
