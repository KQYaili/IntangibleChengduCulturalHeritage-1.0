package com.xiaoyv.framework.main.found.video.details;

import com.xiaoyv.cultureengine.module.main.found.hot.FoundHotBean;
import com.xiaoyv.cultureengine.module.main.found.video.FoundVideoBean;
import com.xiaoyv.framework.BaseFragmentActivity;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainFoundVideoDetailsActivity extends BaseFragmentActivity<MainFoundVideoDetailsFragment> {
    FoundVideoBean.FoundVideo foundVideo;

    @Override
    protected void initView() {
        foundVideo = (FoundVideoBean.FoundVideo) getIntent().getSerializableExtra("data");
        super.initView();
    }
    @Override
    protected void createPresenter(MainFoundVideoDetailsFragment fragment) {
        new MainFoundVideoDetailsPresenter(fragment, foundVideo);
    }

    @Override
    protected MainFoundVideoDetailsFragment createFragment() {
        return MainFoundVideoDetailsFragment.newInstance();
    }

    @Override
    public void onBackPressed() {
        if (!fragment.onBackPressed()) {
            super.onBackPressed();
        }
    }
}
