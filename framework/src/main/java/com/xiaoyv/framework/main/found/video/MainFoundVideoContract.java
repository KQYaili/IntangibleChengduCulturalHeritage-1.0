package com.xiaoyv.framework.main.found.video;

import com.xiaoyv.cultureengine.module.main.found.video.FoundVideoBean;
import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface MainFoundVideoContract {
    interface View extends BaseView<Presenter> {

        void showItem(FoundVideoBean foundVideoBean);

    }

    interface Presenter extends BasePresenter {
        void getItemData();
    }
}
