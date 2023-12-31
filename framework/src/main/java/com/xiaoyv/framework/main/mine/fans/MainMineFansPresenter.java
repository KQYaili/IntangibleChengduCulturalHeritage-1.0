package com.xiaoyv.framework.main.mine.fans;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineFansPresenter implements MainMineFansContract.Presenter {

    @NonNull
    private final MainMineFansContract.View view;

    MainMineFansPresenter(@NonNull MainMineFansContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getFansData();
    }

    @Override
    public void getFansData() {
        CultureEngineManager.getMineFansModule().getMineFans(view::showFans);
    }
}
