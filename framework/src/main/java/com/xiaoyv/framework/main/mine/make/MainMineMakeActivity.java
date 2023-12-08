package com.xiaoyv.framework.main.mine.make;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineMakeActivity extends BaseFragmentActivity<MainMineMakeFragment> {

    @Override
    protected void createPresenter(MainMineMakeFragment fragment) {
        new MainMineMakePresenter(fragment);
    }

    @Override
    protected MainMineMakeFragment createFragment() {
        return MainMineMakeFragment.newInstance();
    }

}
