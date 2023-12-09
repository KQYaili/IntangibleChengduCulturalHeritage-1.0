package com.xiaoyv.cultureengine.module.main.mine.history;

import androidx.annotation.NonNull;

import com.blankj.utilcode.util.TimeUtils;
import com.xiaoyv.cultureengine.callback.CultureDataCallback;
import com.xiaoyv.cultureengine.module.BaseModule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MineHistoryModule extends BaseModule {

    public void getMineHistoryModule(MineHistoryType type, @NonNull CultureDataCallback<MineHistoryBean> callback) {
        // 此处模拟数据
        MineHistoryBean mineHistoryBean = new MineHistoryBean();
        List<MineHistoryBean.MineHistory> mineHistories = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            MineHistoryBean.MineHistory item = new MineHistoryBean.MineHistory();
            item.setTime(TimeUtils.getNowString());
            if (i % 3 == 0) {
                item.setName("中国梦");
                item.setTitle("阿米诺斯");
                item.setImage("https://imgcdn.scol.com.cn/NEWS_AB4B0C81FA6F8CB409BB09C65BF366E3.JPG");
            } else if (i % 3 == 1) {
                item.setName("梦之蓝");
                item.setTitle("阿黑路西");
                item.setImage("https://img.zcool.cn/community/011199577ddaeb0000012e7ed4b1f8.jpg@1280w_1l_2o_100sh.jpg");
            } else {
                item.setName("荆州");
                item.setTitle("一得阁米诺");
                item.setImage("http://img4.imgtn.bdimg.com/it/u=3403496472,3338213390&fm=26&gp=0.jpg");
            }
            mineHistories.add(item);
        }
        mineHistoryBean.setMineHistories(mineHistories);
        callback.onCultureData(mineHistoryBean);
        // 此处模拟数据
    }
}
