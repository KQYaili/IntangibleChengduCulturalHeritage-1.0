package com.xiaoyv.framework.main.mine.message.page;

import com.xiaoyv.cultureengine.module.main.mine.message.MineMessageBean;
import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface MainMineMessagePageContract {
    interface View extends BaseView<Presenter> {

        /**
         * 展示消息
         * @param cultureData
         */
        void showMessage(MineMessageBean cultureData);

    }

    interface Presenter extends BasePresenter {
        /**
         * 获取消息
         */
        void getMessageData();
    }
}
