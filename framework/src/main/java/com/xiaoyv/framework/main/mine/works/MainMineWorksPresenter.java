package com.xiaoyv.framework.main.mine.works;

import androidx.annotation.NonNull;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineWorksPresenter implements MainMineWorksContract.Presenter {

    @NonNull
    private final MainMineWorksContract.View view;

    MainMineWorksPresenter(@NonNull MainMineWorksContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

}
