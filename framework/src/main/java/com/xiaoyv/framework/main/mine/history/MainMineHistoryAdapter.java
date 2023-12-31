package com.xiaoyv.framework.main.mine.history;

import android.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.xiaoyv.cultureengine.module.main.mine.history.MineHistoryBean;
import com.xiaoyv.framework.R;
import com.xiaoyv.open.adapter.base.BaseQuickAdapter;
import com.xiaoyv.open.adapter.base.BaseViewHolder;

import java.util.List;

import static com.blankj.utilcode.util.StringUtils.getString;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/23
 */
public class MainMineHistoryAdapter extends BaseQuickAdapter<MineHistoryBean.MineHistory, BaseViewHolder> implements BaseQuickAdapter.OnItemChildClickListener {

    MainMineHistoryAdapter(int layoutResId, @Nullable List<MineHistoryBean.MineHistory> data) {
        super(layoutResId, data);
        setOnItemChildClickListener(this);
    }

    @Override
    protected void convert(BaseViewHolder holder, MineHistoryBean.MineHistory itemBean) {
        ImageView headerView = holder.getView(R.id.main_mine_history_item_image);
        Glide.with(mContext).load(itemBean.getImage()).into(headerView);

        holder.setText(R.id.main_mine_history_item_title, itemBean.getTitle());
        holder.setText(R.id.main_mine_history_item_time, itemBean.getTime());
        holder.setText(R.id.main_mine_history_item_kind, "来自：" + "精选文章");

        holder.addOnClickListener(R.id.main_mine_history_item_layout);
    }

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        if (view.getId() == R.id.main_mine_history_item_layout) {
            AlertDialog alertDialog = new AlertDialog.Builder(mContext)
                    .setTitle(R.string.dialog_delete_history)
                    .setMessage(R.string.dialog_is_delete_history)
                    .setPositiveButton(R.string.dialog_yes, (dialog, which) -> {
                        ToastUtils.showShort(getString(R.string.tips_delete_history_success));
                        notifyItemRemoved(position);
                        getData().remove(position);
                        notifyItemRangeChanged(position, getItemCount());
                    })
                    .setNegativeButton(R.string.dialog_no, null)
                    .create();
            alertDialog.show();
        }
    }
}
