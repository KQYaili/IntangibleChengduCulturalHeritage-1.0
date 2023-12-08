package com.xiaoyv.framework.main.mine.message;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineMessageActivity extends BaseFragmentActivity<MainMineMessageFragment> {

    @Override
    protected void createPresenter(MainMineMessageFragment fragment) {
        new MainMineMessagePresenter(fragment);
    }

    @Override
    protected MainMineMessageFragment createFragment() {
        return MainMineMessageFragment.newInstance();
    }

}
