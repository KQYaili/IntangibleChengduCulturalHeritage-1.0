package com.xiaoyv.framework.main.mine.fans;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineFansActivity extends BaseFragmentActivity<MainMineFansFragment> {

    @Override
    protected void createPresenter(MainMineFansFragment fragment) {
        new MainMineFansPresenter(fragment);
    }

    @Override
    protected MainMineFansFragment createFragment() {
        return MainMineFansFragment.newInstance();
    }

}
