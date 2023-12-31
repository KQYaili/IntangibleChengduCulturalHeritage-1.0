package com.xiaoyv.framework.main.mine;

import androidx.annotation.NonNull;

import com.xiaoyv.framework.main.home.MainHomeContract;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMinePresenter implements MainMineContract.Presenter {

    @NonNull
    private final MainMineContract.View view;

    public MainMinePresenter(@NonNull MainMineContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
