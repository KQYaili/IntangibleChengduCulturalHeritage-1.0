package com.xiaoyv.framework.main.news.page.details;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;
import com.xiaoyv.cultureengine.module.main.news.NewsPageBean;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainNewsPageDetailsPresenter implements MainNewsPageDetailsContract.Presenter {

    @NonNull
    private final MainNewsPageDetailsContract.View view;
    @NonNull
    private final NewsPageBean.NewsPage newsPage;

    MainNewsPageDetailsPresenter(@NonNull MainNewsPageDetailsContract.View view, @NonNull NewsPageBean.NewsPage foundHot) {
        this.view = view;
        this.newsPage = foundHot;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        view.showParentData(newsPage);
        getCommentItemData();
    }

    @Override
    public void getCommentItemData() {
        CultureEngineManager.getFoundCommentModule().getFoundComment(view::showCommentItem);
    }

}
