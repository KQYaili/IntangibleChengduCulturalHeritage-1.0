package com.xiaoyv.framework.main.mine.collection;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;
import com.xiaoyv.cultureengine.module.main.mine.collection.MineCollectionType;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineCollectionPresenter implements MainMineCollectionContract.Presenter {

    @NonNull
    private final MainMineCollectionContract.View view;

    MainMineCollectionPresenter(@NonNull MainMineCollectionContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getCollectionData(MineCollectionType.ARTICLE);
    }

    @Override
    public void getCollectionData(MineCollectionType type) {
        CultureEngineManager.getMineCollectionModule().getMineCollectionModule(type, view::showCollection);
    }
}
