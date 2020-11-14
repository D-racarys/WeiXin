package com.example.myapplication.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.entity.weixin;

import java.util.List;

public class weixinRecycleViewAdapter extends RecyclerView.Adapter<weixinRecycleViewAdapter.MyViewHolder> {
        private List<weixin> wexinList;
        private Context context;

        // 为每个数据项提供对视图的引用
        // 复杂的数据项每个项可能需要多个View，您可以提供对ViewHolder中某个数据项的所有View的访问
        public static class MyViewHolder extends RecyclerView.ViewHolder{
                TextView weixinName;
                TextView weixinLastTime;
                TextView weixinContent;
                ImageView weixinAvatar;

                public MyViewHolder(View itemView) {
                        super(itemView);
                        weixinName = itemView.findViewById(R.id.weixin_name);
                        weixinLastTime = itemView.findViewById(R.id.weixin_time);
                        weixinContent = itemView.findViewById(R.id.weixin_content);
                        weixinAvatar = itemView.findViewById(R.id.weixin_avatar);
                }
        }

        //提供合适的构造函数（取决于数据集的类型）
        public weixinRecycleViewAdapter(List<weixin> weixinList,Context context) {
                this.wexinList=weixinList;
                this.context = context;
        }

        //创建新视图（由布局管理器调用），创建MyViewHolder的实例
        @NonNull
        @Override
        public weixinRecycleViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                // 创建一个新view
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.tb01viewtext, parent, false);
                return new MyViewHolder(v);
        }

        // 替换视图的内容（由布局管理器调用）用于绑定数据和事件
        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
                // 从此位置的数据集中获取元素
                // 用该元素替换视图的内容
                weixin weixin = this.wexinList.get(position);
                holder.weixinName.setText(weixin.getName());
                holder.weixinLastTime.setText(weixin.getLastTime());
                holder.weixinContent.setText(weixin.getContent());
                Glide.with(context)
                        .load(weixin.getAvatar())//加载图片链接
                        .into(holder.weixinAvatar);//将图片放进imageText
        }

        // 用于确认子项的数量，直接返回数据源的长度就可以（由布局管理器调用）
        @Override
        public int getItemCount() {
                return this.wexinList.size();
        }
}