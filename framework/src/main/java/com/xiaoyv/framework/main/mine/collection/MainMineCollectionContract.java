package com.xiaoyv.framework.main.mine.collection;

import com.xiaoyv.cultureengine.module.main.mine.collection.MineCollectionBean;
import com.xiaoyv.cultureengine.module.main.mine.collection.MineCollectionType;
import com.xiaoyv.framework.BasePresenter;
import com.xiaoyv.framework.BaseView;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface MainMineCollectionContract {
    interface View extends BaseView<Presenter> {

        /**
         * 显示收藏数据
         */
        void showCollection(MineCollectionBean mineCollectionBean);
    }

    interface Presenter extends BasePresenter {
        /**
         * 获取收藏数据
         */
        void getCollectionData(MineCollectionType type);
    }
}
