package com.xiaoyv.cultureengine.module.main.mine.message;

import androidx.annotation.NonNull;

import com.blankj.utilcode.util.TimeUtils;
import com.xiaoyv.cultureengine.callback.CultureDataCallback;
import com.xiaoyv.cultureengine.module.BaseModule;
import com.xiaoyv.cultureengine.module.main.found.video.FoundVideoBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MineMessageModule extends BaseModule {

    public void getMineMessage(MineMessageType type, @NonNull CultureDataCallback<MineMessageBean> callback) {

        // 此处模拟数据
        MineMessageBean mineMessageBean = new MineMessageBean();
        List<MineMessageBean.MineMessage> mineMessages = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            MineMessageBean.MineMessage item = new MineMessageBean.MineMessage();
            item.setTime(TimeUtils.getNowString());

            if (i % 3 == 0) {
                item.setTitle(type.name() + "：锄禾日当午");
                item.setName("中国梦");
                item.setHeader("https://imgcdn.scol.com.cn/NEWS_AB4B0C81FA6F8CB409BB09C65BF366E3.JPG");
            } else if (i % 3 == 1) {
                item.setTitle(type.name() + "：唱脸谱，滦州古城");
                item.setName("梦之蓝");
                item.setHeader("https://pic4.zhimg.com/80/v2-9a5cbf9b6989a91ccc178e035d1e3347_720w.webp");
            } else {
                item.setTitle(type.name() + "：大邑县安仁古镇");
                item.setName("荆州");
                item.setHeader("http://img1.imgtn.bdimg.com/it/u=1718607933,1584052&fm=26&gp=0.jpg");
            }
            mineMessages.add(item);
        }
        mineMessageBean.setMineMessages(mineMessages);
        callback.onCultureData(mineMessageBean);
        // 此处模拟数据
    }
}
