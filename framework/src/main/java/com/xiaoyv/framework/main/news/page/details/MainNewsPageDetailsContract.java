package com.xiaoyv.framework.main.news.page.details;

import com.xiaoyv.cultureengine.module.main.found.comment.FoundCommentBean;
import com.xiaoyv.cultureengine.module.main.news.NewsPageBean;
import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface MainNewsPageDetailsContract {
    interface View extends BaseView<Presenter> {

        /**
         * 展示评论数据
         */
        void showCommentItem(FoundCommentBean foundCommentBean);

        /**
         * 展示父窗口传递的数据
         */
        void showParentData(NewsPageBean.NewsPage newsPage);
    }

    interface Presenter extends BasePresenter {
        /**
         * 获取评论数据
         */
        void getCommentItemData();
    }
}
