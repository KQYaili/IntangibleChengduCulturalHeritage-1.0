package com.xiaoyv.framework.main.found.page;

import com.xiaoyv.cultureengine.module.main.found.page.FoundPageBean;
import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface MainFoundPageContract {
    interface View extends BaseView<Presenter> {

        void showItem(FoundPageBean foundPageBean);

    }

    interface Presenter extends BasePresenter {
        void getItemData();
    }
}
