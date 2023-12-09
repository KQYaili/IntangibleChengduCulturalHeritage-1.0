package com.xiaoyv.cultureengine.module.main.mine.fans;

import androidx.annotation.NonNull;

import com.blankj.utilcode.util.TimeUtils;
import com.xiaoyv.cultureengine.callback.CultureDataCallback;
import com.xiaoyv.cultureengine.module.BaseModule;
import com.xiaoyv.cultureengine.module.main.mine.message.MineMessageType;

import java.util.ArrayList;
import java.util.List;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MineFansModule extends BaseModule {

    public void getMineFans(@NonNull CultureDataCallback<MineFansBean> callback) {

        // 此处模拟数据
        MineFansBean mineFansBean = new MineFansBean();
        List<MineFansBean.MineFans> mineFans = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            MineFansBean.MineFans item = new MineFansBean.MineFans();
            item.setTime(TimeUtils.getNowString());

            if (i % 3 == 0) {
                item.setAttention(true);
                item.setName("中国梦");
                item.setDesc("超市里扫货");
                item.setHeader("http://img3.imgtn.bdimg.com/it/u=2747477288,1454412439&fm=26&gp=0.jpg");
            } else if (i % 3 == 1) {
                item.setAttention(false);
                item.setName("梦之蓝");
                item.setDesc("奥利安费");
                item.setHeader("https://pic4.zhimg.com/80/v2-9a5cbf9b6989a91ccc178e035d1e3347_720w.webp");
            } else {
                item.setName("荆州");
                item.setAttention(true);
                item.setDesc("赠送的芙蓉王");
                item.setHeader("http://img1.imgtn.bdimg.com/it/u=1718607933,1584052&fm=26&gp=0.jpg");
            }
            mineFans.add(item);
        }
        mineFansBean.setMineFans(mineFans);
        callback.onCultureData(mineFansBean);
        // 此处模拟数据
    }
}
