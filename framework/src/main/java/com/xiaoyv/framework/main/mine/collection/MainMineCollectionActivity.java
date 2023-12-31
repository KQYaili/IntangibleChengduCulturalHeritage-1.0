package com.xiaoyv.framework.main.mine.collection;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineCollectionActivity extends BaseFragmentActivity<MainMineCollectionFragment> {

    @Override
    protected void createPresenter(MainMineCollectionFragment fragment) {
        new MainMineCollectionPresenter(fragment);
    }

    @Override
    protected MainMineCollectionFragment createFragment() {
        return MainMineCollectionFragment.newInstance();
    }

}
