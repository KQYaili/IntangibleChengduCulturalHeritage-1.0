package com.xiaoyv.framework.main.found.hot.details;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;
import com.xiaoyv.cultureengine.module.main.found.hot.FoundHotBean;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainFoundHotDetailsPresenter implements MainFoundHotDetailsContract.Presenter {

    @NonNull
    private final MainFoundHotDetailsContract.View view;
    @NonNull
    private final FoundHotBean.FoundHot foundHot;

    MainFoundHotDetailsPresenter(@NonNull MainFoundHotDetailsContract.View view, @NonNull FoundHotBean.FoundHot foundHot) {
        this.view = view;
        this.foundHot = foundHot;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        view.showParentData(foundHot);
        getCommentItemData();
    }

    @Override
    public void getCommentItemData() {
        CultureEngineManager.getFoundCommentModule().getFoundComment(view::showCommentItem);
    }

}
