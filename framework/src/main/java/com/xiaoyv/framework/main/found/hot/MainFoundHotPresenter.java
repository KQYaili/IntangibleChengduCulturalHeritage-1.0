package com.xiaoyv.framework.main.found.hot;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2020/2/8
 */
public class MainFoundHotPresenter implements MainFoundHotContract.Presenter {

    @NonNull
    private final MainFoundHotContract.View view;

    public MainFoundHotPresenter(@NonNull MainFoundHotContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getItemData();
    }

    @Override
    public void getItemData() {
        CultureEngineManager.getFoundHotModule().getFoundHot(view::showItem);
    }
}
