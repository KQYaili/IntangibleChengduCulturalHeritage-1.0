package com.xiaoyv.framework.main.mine.history;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineHistoryActivity extends BaseFragmentActivity<MainMineHistoryFragment> {

    @Override
    protected void createPresenter(MainMineHistoryFragment fragment) {
        new MainMineHistoryPresenter(fragment);
    }

    @Override
    protected MainMineHistoryFragment createFragment() {
        return MainMineHistoryFragment.newInstance();
    }

}
