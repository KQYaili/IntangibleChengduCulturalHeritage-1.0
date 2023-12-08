package com.xiaoyv.framework.main.mine.money;

import androidx.annotation.NonNull;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineMoneyPresenter implements MainMineMoneyContract.Presenter {

    @NonNull
    private final MainMineMoneyContract.View view;

    MainMineMoneyPresenter(@NonNull MainMineMoneyContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

}
