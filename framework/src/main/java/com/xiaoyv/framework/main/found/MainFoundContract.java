package com.xiaoyv.framework.main.found;

import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;
import com.xiaoyv.framework.main.found.page.MainFoundPageAdapter;

import java.util.List;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface MainFoundContract {
    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {


    }
}
