package com.example.myapplication.fragment;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.weixinRecycleViewAdapter;
import com.example.myapplication.entity.weixin;

import java.util.ArrayList;


public class weixinFragment extends Fragment {
    private View view;
    private RecyclerView recyclerView;  //声明RecycleView
    private RecyclerView.Adapter weixinRCAdapter;  //声明适配器
    private RecyclerView.LayoutManager layoutManager;

    public weixinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.table01, container, false);
        initRecyclerView();
        return view;
    }
    //初始化RecycleView函数
    private void initRecyclerView() {
        recyclerView = (RecyclerView) view.findViewById(R.id.weixin_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<weixin> weixinList = new ArrayList<>();

            weixin weixin1 = new weixin(
                    "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1605366978067&di=834b7deb9a0a4d859a878bdee19d0c8b&imgtype=0&src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fblog%2F202008%2F08%2F20200808142612_nsopf.thumb.400_0.jpeg",
                    "张三",
                    "8:00",
                    "hello"
            );
            weixinList.add(weixin1);
            weixin weixin2 = new weixin(
                    "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1285063713,2753463619&fm=26&gp=0.jpg",
                    "李四",
                    "8:20",
                    "hello"
            );
            weixinList.add(weixin2);
            weixin weixin3 = new weixin(
                    "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2111520688,70457745&fm=26&gp=0.jpg",
                    "王五",
                    "8:30",
                    "hello"
            );
            weixinList.add(weixin3);
            weixin weixin4 = new weixin(
                    "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2345130998,305054013&fm=26&gp=0.jpg",
                    "赵六",
                    "9:00",
                    "hello"
            );
            weixinList.add(weixin4);
            weixin weixin5 = new weixin(
                    "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=233291323,4185710237&fm=26&gp=0.jpg",
                    "大黄",
                    "12:00",
                    "hello"
            );
            weixinList.add(weixin5);

        weixinRCAdapter = new weixinRecycleViewAdapter(weixinList,getActivity());
        recyclerView.setAdapter(weixinRCAdapter);
    }
}
