package com.xiaoyv.cultureengine.module.holl;

import androidx.annotation.NonNull;

import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.xiaoyv.cultureengine.callback.CultureDataCallback;
import com.xiaoyv.cultureengine.module.BaseModule;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class HallModule extends BaseModule {

    public void getHall(HallModule.TYPE type, @NonNull CultureDataCallback<HallBean> callback) {
        String json = ResourceUtils.readAssets2String("online_hall/" + type.name() + ".json");
        HallBean hallBean = GsonUtils.fromJson(json, HallBean.class);
        callback.onCultureData(hallBean);
    }

    public enum TYPE {
        SPORT, MEDICINE, THEATER, SKILL, ART, DANCE, MUSIC, SONG, FOLKCOSTUM, LITERATURE
    }
}
