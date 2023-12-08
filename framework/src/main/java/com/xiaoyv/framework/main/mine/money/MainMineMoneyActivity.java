package com.xiaoyv.framework.main.mine.money;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineMoneyActivity extends BaseFragmentActivity<MainMineMoneyFragment> {

    @Override
    protected void createPresenter(MainMineMoneyFragment fragment) {
        new MainMineMoneyPresenter(fragment);
    }

    @Override
    protected MainMineMoneyFragment createFragment() {
        return MainMineMoneyFragment.newInstance();
    }

}
