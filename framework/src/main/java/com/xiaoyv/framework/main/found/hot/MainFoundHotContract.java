package com.xiaoyv.framework.main.found.hot;

import com.xiaoyv.cultureengine.module.main.found.hot.FoundHotBean;
import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface MainFoundHotContract {
    interface View extends BaseView<Presenter> {

        void showItem(FoundHotBean foundHotBean);

    }

    interface Presenter extends BasePresenter {
        void getItemData();
    }
}
