package com.xiaoyv.cultureengine.module.main.home;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.callback.CultureDataCallback;
import com.xiaoyv.cultureengine.module.BaseModule;
import com.xiaoyv.cultureengine.module.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * 成都非遗文化 App 首页条目获取
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class HomeItemModule extends BaseModule {

    public void getHomeItem(Type type, @NonNull CultureDataCallback<HomeItemBean> callback) {

        // 此处模拟数据
        HomeItemBean homeItemBean = new HomeItemBean();
        List<HomeItemBean.HomeItem> homeItems = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            HomeItemBean.HomeItem item = new HomeItemBean.HomeItem();
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
                item.setBackground("https://th.bing.com/th/id/R.926c8c77159d03f5c6486a1c97d045ef?rik=sxrU83NG5APIhw&riu=http%3a%2f%2fyouimg1.c-ctrip.com%2ftarget%2ffd%2ftg%2fg4%2fM06%2fFB%2f5D%2fCggYHlYp34iAdCA0ABQblCKwzEE757.jpg&ehk=RKZaWbDJu49oFHPzexg0WcRaj3zLBhHhCgBSsJWSYsg%3d&risl=&pid=ImgRaw&r=0");
                item.setDesc("大邑县安仁古镇");
                item.setTitle("安仁古镇，欢迎您");
                item.setName("荆州");
                item.setHeader("https://th.bing.com/th/id/R.926c8c77159d03f5c6486a1c97d045ef?rik=sxrU83NG5APIhw&riu=http%3a%2f%2fyouimg1.c-ctrip.com%2ftarget%2ffd%2ftg%2fg4%2fM06%2fFB%2f5D%2fCggYHlYp34iAdCA0ABQblCKwzEE757.jpg&ehk=RKZaWbDJu49oFHPzexg0WcRaj3zLBhHhCgBSsJWSYsg%3d&risl=&pid=ImgRaw&r=0");
            }
            homeItems.add(item);
        }
        homeItemBean.setHomeItems(homeItems);
        callback.onCultureData(homeItemBean);
        // 此处模拟数据


        switch (type) {
            case WORD:
                break;
            case DANCE:
                break;
            case SONG:
                break;
            case ART:
                break;
            case MEDICINE:
                break;
            case MUSIC:
                break;
            case DRAMA:
                break;
            case ACROBATICS:
                break;
            case SKILL:
                break;
            case FOLKORE:
                break;
            default:
                break;
        }
    }

}
