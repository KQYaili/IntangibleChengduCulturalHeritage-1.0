package com.xiaoyv.framework.main;

import androidx.annotation.NonNull;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainPresenter implements MainContract.Presenter {

    @NonNull
    private final MainContract.View view;

    MainPresenter( @NonNull MainContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

}
