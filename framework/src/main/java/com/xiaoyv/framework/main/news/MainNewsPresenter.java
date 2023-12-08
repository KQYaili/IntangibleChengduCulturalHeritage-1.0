package com.xiaoyv.framework.main.news;

import androidx.annotation.NonNull;

import com.xiaoyv.framework.main.home.MainHomeContract;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2020/2/8
 */
public class MainNewsPresenter implements MainNewsContract.Presenter {

    @NonNull
    private final MainNewsContract.View view;

    public MainNewsPresenter(@NonNull MainNewsContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
