package com.xiaoyv.framework.main.found;

import androidx.annotation.NonNull;

import com.blankj.utilcode.util.ToastUtils;
import com.xiaoyv.framework.main.found.page.MainFoundPageAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2020/2/8
 */
public class MainFoundPresenter implements MainFoundContract.Presenter {

    @NonNull
    private final MainFoundContract.View view;

    public MainFoundPresenter(@NonNull MainFoundContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

}
