package com.xiaoyv.framework.main.mine.dynamic;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineDynamicActivity extends BaseFragmentActivity<MainMineDynamicFragment> {

    @Override
    protected void createPresenter(MainMineDynamicFragment fragment) {
        new MainMineDynamicPresenter(fragment);
    }

    @Override
    protected MainMineDynamicFragment createFragment() {
        return MainMineDynamicFragment.newInstance();
    }

}
