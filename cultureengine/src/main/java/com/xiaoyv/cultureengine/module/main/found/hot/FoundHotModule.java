package com.xiaoyv.cultureengine.module.main.found.hot;

import androidx.annotation.NonNull;

import com.xiaoyv.cultureengine.callback.CultureDataCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 成都非遗文化 App 非遗发现数据获取
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class FoundHotModule {

    public void getFoundHot(@NonNull CultureDataCallback<FoundHotBean> callback) {

        // 此处模拟数据
        FoundHotBean foundHotBean = new FoundHotBean();
        List<FoundHotBean.FoundHot> foundHots = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            FoundHotBean.FoundHot item = new FoundHotBean.FoundHot();
            item.setLike(new Random().nextInt(500));
            if (i % 3 == 0) {
                item.setBackground("https://imgcdn.scol.com.cn/NEWS_AB4B0C81FA6F8CB409BB09C65BF366E3.JPG"); // 蜀锦
                item.setTitle("蜀锦织造技艺，天下母锦，万锦之源");
                item.setName("中国梦");
                item.setHeader("https://ts1.cn.mm.bing.net/th/id/R-C.6e6a0b56fc7cb02f075c5db87ca49cff?rik=%2bDh6Padb%2f6Hqxw&riu=http%3a%2f%2fn.sinaimg.cn%2fsinakd20200921ac%2f450%2fw750h500%2f20200921%2f6e80-izmihnt8229402.jpg&ehk=goOXzUP%2fP4iVdFVEdQNnG%2fzqPLVSbXYCtUqUGJSVffI%3d&risl=&pid=ImgRaw&r=0");
            } else if (i % 3 == 1) {
                item.setBackground("https://pic4.zhimg.com/80/v2-9a5cbf9b6989a91ccc178e035d1e3347_720w.webp");// 漆器
                item.setTitle("漆器雕刻精美，光泽细润，图彩绚丽，东方瑰宝");
                item.setName("梦之蓝");
                item.setHeader("https://www.tesegu.com/public/upload/photos/000/001/674/49/0ccaf1d3bed425d956be8cc885389634Yyvic5.jpg");
            } else {
                item.setBackground("http://inews.gtimg.com/newsapp_bt/0/15131626667/641");// 银花丝
                item.setTitle("银花丝手工打造，平填花丝，无胎成形，玲珑剔透");
                item.setName("荆州");
                item.setHeader("https://pic2.zhimg.com/80/v2-15f7ffc7829a9539a50f087eca2ed665_720w.webp");
            }
            foundHots.add(item);
        }
        foundHotBean.setFoundHots(foundHots);
        callback.onCultureData(foundHotBean);
        // 此处模拟数据

    }
}
