package com.xiaoyv.framework.main.mine.message;

import androidx.annotation.NonNull;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineMessagePresenter implements MainMineMessageContract.Presenter {

    @NonNull
    private final MainMineMessageContract.View view;

    MainMineMessagePresenter(@NonNull MainMineMessageContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

}
