package com.xiaoyv.cultureengine.module.main.found.page.works;

import androidx.annotation.NonNull;

import com.blankj.utilcode.util.TimeUtils;
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
public class FoundPageDetailsModule {

    public void getPageDetailsModule(@NonNull CultureDataCallback<FoundPageDetailsBean> callback) {

        // 此处模拟数据
        FoundPageDetailsBean foundPageDetailsBean = new FoundPageDetailsBean();
        List<FoundPageDetailsBean.FoundPageDetails> foundPageDetails = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            FoundPageDetailsBean.FoundPageDetails item = new FoundPageDetailsBean.FoundPageDetails();
            item.setLike(new Random().nextInt(500));
            item.setTime(TimeUtils.getNowString());
            if (i % 3 == 0) {
                item.setBackground("https://bkimg.cdn.bcebos.com/pic/0b907cd9dc32b41e10df9b31?x-bce-process=image/resize,m_lfit,w_440,limit_1");
                item.setTitle("新津龙舟会");
            } else if (i % 3 == 1) {
                item.setBackground("https://pics2.baidu.com/feed/30adcbef76094b363c5a99ad656214d28f109de4.jpeg@f_auto?token=a6fc009ee9b5e9145ffb8622c61ea029");
                item.setTitle("黄龙溪火龙节");
            } else {
                item.setBackground("https://imagepphcloud.thepaper.cn/pph/image/123/899/806.jpg");
                item.setTitle("都江堰放水节");
            }

            foundPageDetails.add(item);
        }
        foundPageDetailsBean.setFoundPageDetails(foundPageDetails);
        callback.onCultureData(foundPageDetailsBean);
        // 此处模拟数据

    }
}
