package com.xiaoyv.cultureengine.module.main.found.page;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.callback.CultureDataCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * 成都非遗文化 App 非遗发现数据获取
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class FoundPageModule {

    public void getFoundPage(@NonNull CultureDataCallback<FoundPageBean> callback) {

        // 此处模拟数据
        FoundPageBean foundPageBean = new FoundPageBean();
        List<FoundPageBean.FoundPage> foundPages = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            FoundPageBean.FoundPage item = new FoundPageBean.FoundPage();
            if (i % 3 == 0) {
                item.setAttention(true);
                item.setBackground("https://ts1.cn.mm.bing.net/th/id/R-C.104369b6e5851035dac72f57f74c6894?rik=TCmXBrD9Z0kIGQ&riu=http%3a%2f%2fcc3.cache.cdqss.com%2fqy%2fimage%2f20150109%2f1420790172.jpg&ehk=4IuewsA4K%2f47RfwffdsJMAm2KAyAekB6xmwITSoLCJs%3d&risl=&pid=ImgRaw&r=0&sres=1&sresct=1");
                item.setDesc("锄禾日当午");
                item.setTitle("川剧变脸，响当当");
                item.setName("中国梦");
                item.setHeader("https://ts1.cn.mm.bing.net/th/id/R-C.104369b6e5851035dac72f57f74c6894?rik=TCmXBrD9Z0kIGQ&riu=http%3a%2f%2fcc3.cache.cdqss.com%2fqy%2fimage%2f20150109%2f1420790172.jpg&ehk=4IuewsA4K%2f47RfwffdsJMAm2KAyAekB6xmwITSoLCJs%3d&risl=&pid=ImgRaw&r=0&sres=1&sresct=1");
            } else if (i % 3 == 1) {
                item.setAttention(false);
                item.setBackground("https://img.zcool.cn/community/011199577ddaeb0000012e7ed4b1f8.jpg@1280w_1l_2o_100sh.jpg");
                item.setDesc("忍草禅枝绕精舍");
                item.setTitle("唱脸谱，滦州古城");
                item.setName("梦之蓝");
                item.setHeader("http://img2.imgtn.bdimg.com/it/u=3795630848,1477575400&fm=26&gp=0.jpg");
            } else {
                item.setAttention(false);
                item.setBackground("http://img4.imgtn.bdimg.com/it/u=3403496472,3338213390&fm=26&gp=0.jpg");
                item.setDesc("大邑县安仁古镇");
                item.setTitle("安仁古镇，欢迎您");
                item.setName("荆州");
                item.setHeader("http://img1.imgtn.bdimg.com/it/u=1718607933,1584052&fm=26&gp=0.jpg");
            }

            foundPages.add(item);
        }
        foundPageBean.setFoundPages(foundPages);
        callback.onCultureData(foundPageBean);
        // 此处模拟数据

    }
}
