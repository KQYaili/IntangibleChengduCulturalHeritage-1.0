package com.xiaoyv.framework.main.mine.make;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineMakePresenter implements MainMineMakeContract.Presenter {

    @NonNull
    private final MainMineMakeContract.View view;

    MainMineMakePresenter(@NonNull MainMineMakeContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getCommentItemData();
    }

    @Override
    public void getCommentItemData() {
        CultureEngineManager.getMineMakeModule().getMineMakeModule(view::showCommentItem);
    }

}
