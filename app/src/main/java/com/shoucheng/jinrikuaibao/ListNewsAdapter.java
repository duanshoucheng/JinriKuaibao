package com.shoucheng.jinrikuaibao;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ThinKPad on 2017/8/19.
 */

public class ListNewsAdapter extends RecyclerView.Adapter<ListNewsAdapter.NewsHolder> {
    private Context mContext;
    private List<String> mList;
    public ListNewsAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(mContext).inflate(R.layout.news_item, null);
        return new NewsHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {
        holder.titleTV.setText(mList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, AboutMeActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class NewsHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.titleTV)
        TextView titleTV;
        public NewsHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
