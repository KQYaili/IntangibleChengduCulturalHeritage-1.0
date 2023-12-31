package com.xiaoyv.framework.main.mine.attention;

import com.xiaoyv.cultureengine.module.main.mine.attention.MineAttentionBean;
import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface MainMineAttentionContract {
    interface View extends BaseView<Presenter> {

        /**
         * 显示我关注的用户数据
         */
        void showAttention(MineAttentionBean bean);
    }

    interface Presenter extends BasePresenter {

        /**
         * 获取我关注的用户数据
         */
        void getAttentionData();
    }
}
