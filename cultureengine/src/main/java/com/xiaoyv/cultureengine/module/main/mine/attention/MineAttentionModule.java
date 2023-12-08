package com.xiaoyv.cultureengine.module.main.mine.attention;

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
public class MineAttentionModule extends BaseModule {

    public void getMineAttention(@NonNull CultureDataCallback<MineAttentionBean> callback) {

        // 此处模拟数据
        MineAttentionBean mineAttentionBean = new MineAttentionBean();
        List<MineAttentionBean.MineAttention> mineAttentions = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            MineAttentionBean.MineAttention item = new MineAttentionBean.MineAttention();

            if (i % 3 == 0) {
                item.setName("中国梦");
                item.setDesc("阿米诺斯");
                item.setHeader("http://img3.imgtn.bdimg.com/it/u=2747477288,1454412439&fm=26&gp=0.jpg");
            } else if (i % 3 == 1) {
                item.setName("梦之蓝");
                item.setDesc("阿黑路西");
                item.setHeader("https://img.zcool.cn/community/011199577ddaeb0000012e7ed4b1f8.jpg@1280w_1l_2o_100sh.jpg");
            } else {
                item.setName("荆州");
                item.setDesc("一得阁米诺");
                item.setHeader("http://img1.imgtn.bdimg.com/it/u=1718607933,1584052&fm=26&gp=0.jpg");
            }
            mineAttentions.add(item);
        }
        mineAttentionBean.setMineAttentions(mineAttentions);
        callback.onCultureData(mineAttentionBean);
        // 此处模拟数据
    }
}
