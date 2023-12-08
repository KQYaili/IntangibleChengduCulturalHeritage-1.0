package com.xiaoyv.framework.main.mine.dynamic;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineDynamicPresenter implements MainMineDynamicContract.Presenter {

    @NonNull
    private final MainMineDynamicContract.View view;

    MainMineDynamicPresenter(@NonNull MainMineDynamicContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getDynamicData();
    }

    @Override
    public void getDynamicData() {
        CultureEngineManager.getMineDynamicModule().getMineDynamic(view::showDynamic);
    }
}
