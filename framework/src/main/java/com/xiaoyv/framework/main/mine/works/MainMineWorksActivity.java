package com.xiaoyv.framework.main.mine.works;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineWorksActivity extends BaseFragmentActivity<MainMineWorksFragment> {

    @Override
    protected void createPresenter(MainMineWorksFragment fragment) {
        new MainMineWorksPresenter(fragment);
    }

    @Override
    protected MainMineWorksFragment createFragment() {
        return MainMineWorksFragment.newInstance();
    }

}
