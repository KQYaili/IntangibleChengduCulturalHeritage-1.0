package com.xiaoyv.framework.main.found.page.details;

import com.xiaoyv.cultureengine.module.main.found.hot.FoundHotBean;
import com.xiaoyv.cultureengine.module.main.found.page.FoundPageBean;
import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainFoundPageDetailsActivity extends BaseFragmentActivity<MainFoundPageDetailsFragment> {
    FoundPageBean.FoundPage foundPage;

    @Override
    protected void initView() {
        foundPage = (FoundPageBean.FoundPage) getIntent().getSerializableExtra("data");
        super.initView();
    }

    @Override
    protected void createPresenter(MainFoundPageDetailsFragment fragment) {
        new MainFoundPageDetailsPresenter(fragment, foundPage);
    }

    @Override
    protected MainFoundPageDetailsFragment createFragment() {
        return MainFoundPageDetailsFragment.newInstance();
    }

}
