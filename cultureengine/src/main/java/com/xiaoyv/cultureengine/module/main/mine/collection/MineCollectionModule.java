package com.xiaoyv.cultureengine.module.main.mine.collection;

import androidx.annotation.NonNull;

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
public class MineCollectionModule extends BaseModule {

    public void getMineCollectionModule(MineCollectionType type, @NonNull CultureDataCallback<MineCollectionBean> callback) {
        // 此处模拟数据
        MineCollectionBean mineCollectionBean = new MineCollectionBean();
        List<MineCollectionBean.MineCollection> mineCollections = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            MineCollectionBean.MineCollection item = new MineCollectionBean.MineCollection();
            item.setTimes(new Random().nextInt(5000));
            if (i % 3 == 0) {
                item.setName("中国梦");
                item.setTitle("阿米诺斯");
                item.setImage("https://imgcdn.scol.com.cn/NEWS_AB4B0C81FA6F8CB409BB09C65BF366E3.JPG");
            } else if (i % 3 == 1) {
                item.setName("梦之蓝");
                item.setTitle("阿黑路西");
                item.setImage("https://pic4.zhimg.com/80/v2-9a5cbf9b6989a91ccc178e035d1e3347_720w.webp");
            } else {
                item.setName("荆州");
                item.setTitle("一得阁米诺");
                item.setImage("http://img4.imgtn.bdimg.com/it/u=3403496472,3338213390&fm=26&gp=0.jpg");
            }
            mineCollections.add(item);
        }
        mineCollectionBean.setMineCollections(mineCollections);
        callback.onCultureData(mineCollectionBean);
        // 此处模拟数据
    }
}
