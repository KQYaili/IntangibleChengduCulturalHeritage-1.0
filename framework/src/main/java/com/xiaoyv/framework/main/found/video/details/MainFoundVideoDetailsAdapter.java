package com.xiaoyv.framework.main.found.video.details;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.xiaoyv.cultureengine.module.main.found.comment.FoundCommentBean;
import com.xiaoyv.cultureengine.module.main.found.hot.FoundHotBean;
import com.xiaoyv.framework.R;
import com.xiaoyv.open.adapter.base.BaseQuickAdapter;
import com.xiaoyv.open.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2020/2/23
 */
public class MainFoundVideoDetailsAdapter extends BaseQuickAdapter<FoundCommentBean.FoundComment, BaseViewHolder> implements BaseQuickAdapter.OnItemChildClickListener {

    MainFoundVideoDetailsAdapter(int layoutResId, @Nullable List<FoundCommentBean.FoundComment> data) {
        super(layoutResId, data);
        setOnItemChildClickListener(this);
    }

    @Override
    protected void convert(BaseViewHolder holder,FoundCommentBean.FoundComment itemBean) {
        ImageView headerView = holder.getView(R.id.main_found_video_details_item_header);
        Glide.with(mContext).load(itemBean.getHeader()).into(headerView);


        holder.setText(R.id.main_found_video_details_item_time, itemBean.getTime());
        holder.setText(R.id.main_found_video_details_item_name, (holder.getAdapterPosition() + 1) + "楼  " + itemBean.getName());
        holder.setText(R.id.main_found_video_details_item_comment, itemBean.getComment());

        holder.addOnClickListener(R.id.main_found_video_details_item_like);

    }
    

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        if (view.getId() == R.id.main_found_video_details_item_like) {
            ToastUtils.showShort(mContext.getString(R.string.tips_like));
        }
    }
}