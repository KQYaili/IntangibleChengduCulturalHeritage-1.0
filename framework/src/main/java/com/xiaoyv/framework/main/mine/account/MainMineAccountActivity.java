package com.xiaoyv.framework.main.mine.account;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineAccountActivity extends BaseFragmentActivity<MainMineAccountFragment> {

    @Override
    protected void createPresenter(MainMineAccountFragment fragment) {
        new MainMineAccountPresenter(fragment);
    }

    @Override
    protected MainMineAccountFragment createFragment() {
        return MainMineAccountFragment.newInstance();
    }

}
