package com.xiaoyv.cultureengine.module.main.news;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.callback.CultureDataCallback;
import com.xiaoyv.cultureengine.module.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * 成都非遗文化 App 非遗资讯数据获取
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class NewsPageModule {

    public void getNewsPage(Type type, @NonNull CultureDataCallback<NewsPageBean> callback) {

        // 此处模拟数据
        NewsPageBean newsPageBean = new NewsPageBean();
        List<NewsPageBean.NewsPage> newsPages = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            NewsPageBean.NewsPage item = new NewsPageBean.NewsPage();
            item.setTitle("模拟数据“非遗文化”：" + i);
            if (i % 3 == 0) {
                item.setBackground("https://imgcdn.scol.com.cn/NEWS_AB4B0C81FA6F8CB409BB09C65BF366E3.JPG");
                item.setDesc("锄禾日当午");
                item.setName("中国梦");
                item.setHeader("http://img3.imgtn.bdimg.com/it/u=2747477288,1454412439&fm=26&gp=0.jpg");
            } else if (i % 3 == 1) {
                item.setBackground("https://pic4.zhimg.com/80/v2-9a5cbf9b6989a91ccc178e035d1e3347_720w.webp");
                item.setDesc("唱脸谱，滦州古城");
                item.setName("梦之蓝");
                item.setHeader("http://img2.imgtn.bdimg.com/it/u=3795630848,1477575400&fm=26&gp=0.jpg");
            } else {
                item.setBackground("https://th.bing.com/th/id/R.926c8c77159d03f5c6486a1c97d045ef?rik=sxrU83NG5APIhw&riu=http%3a%2f%2fyouimg1.c-ctrip.com%2ftarget%2ffd%2ftg%2fg4%2fM06%2fFB%2f5D%2fCggYHlYp34iAdCA0ABQblCKwzEE757.jpg&ehk=RKZaWbDJu49oFHPzexg0WcRaj3zLBhHhCgBSsJWSYsg%3d&risl=&pid=ImgRaw&r=0");
                item.setDesc("大邑县安仁古镇");
                item.setName("荆州");
                item.setHeader("https://th.bing.com/th/id/OIP.KRa241htR0CHGlZXQ7YY4AHaEf?w=319&h=193&c=7&r=0&o=5&dpr=1.3&pid=1.7");
            }

            newsPages.add(item);
        }
        newsPageBean.setNewsPages(newsPages);
        callback.onCultureData(newsPageBean);
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
