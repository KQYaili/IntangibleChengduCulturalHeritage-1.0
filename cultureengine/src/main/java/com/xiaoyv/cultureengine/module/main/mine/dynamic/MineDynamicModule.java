package com.xiaoyv.cultureengine.module.main.mine.dynamic;

import androidx.annotation.NonNull;

import com.blankj.utilcode.util.TimeUtils;
import com.xiaoyv.cultureengine.callback.CultureDataCallback;
import com.xiaoyv.cultureengine.module.BaseModule;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MineDynamicModule extends BaseModule {

    public void getMineDynamic(@NonNull CultureDataCallback<MineDynamicBean> callback) {

        // 此处模拟数据
        MineDynamicBean mineDynamicBean = new MineDynamicBean();
        List<MineDynamicBean.MineDynamic> mineDynamics = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            MineDynamicBean.MineDynamic item = new MineDynamicBean.MineDynamic();
            item.setComment(new Random().nextInt(999));
            item.setDislike(new Random().nextInt(400));
            item.setLike(new Random().nextInt(999));
            item.setTime(TimeUtils.getNowString());
            if (i % 3 == 0) {
                item.setName("哈比下");
                item.setContent("2005年12月22日下发的《国务院关于加强文化遗产保护的通知》中指出：“为了进一步加强我国文化遗产保护，继承和弘扬中华民族优秀传统文化，推动社会主义先进文化建设，国务院决定从2006年起，每年六月的第二个星期六为我国的‘文化遗产日’。”");
                item.setHeader("http://img3.imgtn.bdimg.com/it/u=2747477288,1454412439&fm=26&gp=0.jpg");
                item.setImage("https://img.zcool.cn/community/011199577ddaeb0000012e7ed4b1f8.jpg@1280w_1l_2o_100sh.jpg");
            } else if (i % 3 == 1) {
                item.setName("可爱捏");
                item.setContent("非遗是非物质文化遗产的简称，区别于物质文化遗产，不像物质文化遗产那样是有形的，比如历史文物、历史建筑、人类文化遗址等都是物质文化遗产。非物质文化遗产指被各群体、团体、有时为个人所视为其文化遗产的各种实践、表演、表现形式、知识体系和技能及其有关的工具、实物、工艺品和文化场所。所以非遗也被称作是“活态文化遗产”，依靠人来进行传承和保护。它是世界、国家和民族历史文化的重要标志，是咱们全人类的共同财富。非物质文化遗产分为世界级、国家级、省级、市级和县级。");
                item.setHeader("https://img.zcool.cn/community/011199577ddaeb0000012e7ed4b1f8.jpg@1280w_1l_2o_100sh.jpg");
                item.setImage("http://img4.imgtn.bdimg.com/it/u=3403496472,3338213390&fm=26&gp=0.jpg");
            } else {
                item.setName("我燃烧你的梦");
                item.setContent("说起成都，你一定会想到川剧、蜀锦、漆器、银花丝、、瓷胎竹编等当今的“非遗”，是成都都悠久历史文化的载体，也是那个历史年代的时尚生活和城市名片。蜀锦因产于于蜀地 (成都地区)而得名，色彩明艳、织纹精细、花型型饱满、质地坚坚韧，距今已有近3000年的历史。蜀锦有“天下母锦”和“万锦之源”的历史地位，世人誉之“东方方瑰宝”，被誉为中国织锦的第一座里程碑。此外，还有川剧、漆器、银花丝等富有地方特色的非遗文化。");
                item.setHeader("http://img1.imgtn.bdimg.com/it/u=1718607933,1584052&fm=26&gp=0.jpg");
                item.setImage("https://img.zcool.cn/community/011199577ddaeb0000012e7ed4b1f8.jpg@1280w_1l_2o_100sh.jpg");
            }
            mineDynamics.add(item);
        }
        mineDynamicBean.setMineDynamics(mineDynamics);
        callback.onCultureData(mineDynamicBean);
        // 此处模拟数据
    }
}
