package com.xiaoyv.framework.main.found.video;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainFoundVideoPresenter implements MainFoundVideoContract.Presenter {

    @NonNull
    private final MainFoundVideoContract.View view;

    public MainFoundVideoPresenter(@NonNull MainFoundVideoContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getItemData();
    }

    @Override
    public void getItemData() {
        CultureEngineManager.getFoundVideoModule().getFoundVideo(view::showItem);
    }
}
