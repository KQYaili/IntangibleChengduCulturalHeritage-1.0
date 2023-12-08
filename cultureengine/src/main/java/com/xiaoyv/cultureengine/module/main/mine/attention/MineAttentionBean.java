package com.xiaoyv.cultureengine.module.main.mine.attention;

import com.xiaoyv.cultureengine.module.BaseBean;

import java.io.Serializable;
import java.util.List;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class MineAttentionBean extends BaseBean {
    private static final long serialVersionUID = -5715406895511205279L;

    private List<MineAttention> mineAttentions;

    public List<MineAttention> getMineAttentions() {
        return mineAttentions;
    }

    public void setMineAttentions(List<MineAttention> mineAttentions) {
        this.mineAttentions = mineAttentions;
    }

    public static class MineAttention implements Serializable {
        private static final long serialVersionUID = 5750822129749239143L;
        private String header;
        private String name;
        private String desc;

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

    }
}
