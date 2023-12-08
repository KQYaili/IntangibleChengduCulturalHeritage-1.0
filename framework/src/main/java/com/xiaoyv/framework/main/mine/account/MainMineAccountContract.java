package com.xiaoyv.framework.main.mine.account;

import com.xiaoyv.account.datebase.User;
import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2020/2/8
 */
public interface MainMineAccountContract {
    interface View extends BaseView<Presenter> {

        void showUser(User currentUser);
    }

    interface Presenter extends BasePresenter {

        void getUser();
    }
}
