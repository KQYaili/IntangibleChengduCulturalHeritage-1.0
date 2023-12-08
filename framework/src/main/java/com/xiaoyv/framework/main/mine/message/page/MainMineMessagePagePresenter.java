package com.xiaoyv.framework.main.mine.message.page;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.CultureEngineManager;
import com.xiaoyv.cultureengine.callback.CultureDataCallback;
import com.xiaoyv.cultureengine.module.main.mine.message.MineMessageBean;
import com.xiaoyv.cultureengine.module.main.mine.message.MineMessageType;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MainMineMessagePagePresenter implements MainMineMessagePageContract.Presenter {

    @NonNull
    private final MainMineMessagePageContract.View view;
    private MineMessageType type;

    public MainMineMessagePagePresenter(@NonNull MainMineMessagePageContract.View view, MineMessageType type) {
        this.view = view;
        this.type = type;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        getMessageData();
    }


    @Override
    public void getMessageData() {
        CultureEngineManager.getMineMessageModule().getMineMessage(type, view::showMessage);
    }
}
