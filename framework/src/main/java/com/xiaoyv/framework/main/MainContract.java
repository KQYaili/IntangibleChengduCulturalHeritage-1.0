package com.xiaoyv.framework.main;

import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2020/2/8
 */
public interface MainContract {
    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
