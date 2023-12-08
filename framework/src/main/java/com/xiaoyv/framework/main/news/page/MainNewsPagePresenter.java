package com.xiaoyv.framework.main.news.page;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainNewsPagePresenter implements MainNewsPageContract.Presenter {

    @NonNull
    private final MainNewsPageContract.View view;

    public MainNewsPagePresenter(@NonNull MainNewsPageContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getItemData();
    }

    @Override
    public void getItemData() {
        CultureEngineManager.getNewsPageModule().getNewsPage(view.getType(), view::showItem);
    }
}
