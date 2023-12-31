package com.xiaoyv.framework.main.mine.account;

import androidx.annotation.NonNull;

import com.xiaoyv.account.UserManager;
import com.xiaoyv.account.datebase.User;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineAccountPresenter implements MainMineAccountContract.Presenter {

    @NonNull
    private final MainMineAccountContract.View view;

    MainMineAccountPresenter(@NonNull MainMineAccountContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getUser();
    }

    @Override
    public void getUser() {
        User currentUser = UserManager.getCurrentUser();
        view.showUser(currentUser);
    }

}
