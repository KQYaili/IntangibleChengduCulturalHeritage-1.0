package com.xiaoyv.framework.app;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.orm.SugarApp;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class App extends SugarApp {

    @Override
    public void onCreate() {
        super.onCreate();

        boolean isMainPro = AppManager.checkMainProcess(this);
        if (!isMainPro) {
            return;
        }
        // 发布版关闭 Log
        LogUtils.getConfig().setLogSwitch(AppUtils.isAppDebug());

        AppManager.initCRASH(this);
        AppManager.initVIDEO();
        AppManager.initCULTURE(this);
        AppManager.initUtils(this);
        AppManager.initX5(this);
    }
}
