package com.xiaoyv.framework.main.mine.attention;

import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineAttentionActivity extends BaseFragmentActivity<MainMineAttentionFragment> {

    @Override
    protected void createPresenter(MainMineAttentionFragment fragment) {
        new MainMineAttentionPresenter(fragment);
    }

    @Override
    protected MainMineAttentionFragment createFragment() {
        return MainMineAttentionFragment.newInstance();
    }

}
