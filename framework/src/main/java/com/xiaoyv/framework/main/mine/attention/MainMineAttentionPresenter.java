package com.xiaoyv.framework.main.mine.attention;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineAttentionPresenter implements MainMineAttentionContract.Presenter {

    @NonNull
    private final MainMineAttentionContract.View view;

    MainMineAttentionPresenter(@NonNull MainMineAttentionContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getAttentionData();
    }

    @Override
    public void getAttentionData() {
        CultureEngineManager.getMineAttentionModule().getMineAttention(view::showAttention);
    }
}
