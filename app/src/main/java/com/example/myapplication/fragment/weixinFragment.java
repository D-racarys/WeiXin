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
    private RecyclerView recyclerView;
    private RecyclerView.Adapter weixinRCAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public weixinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.table01, container, false);
//        initRecyclerView();
        return view;
    }

//    private void initRecyclerView() {
//        recyclerView = (RecyclerView) view.findViewById(R.id.weixin_recycler_view);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(layoutManager);
//
//        // specify an adapter (see also next example)
//        ArrayList<weixin> weixinList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            weixin weixin = new weixin(
//                    "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1604377714766&di=047992da111aa3829771424516bd6cdd&imgtype=0&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F02%2F42%2F32%2F59ba3c2b4d7da_610.jpg",
//                    "小明",
//                    "8:00",
//                    "这是一条消息"
//            );
//            weixinList.add(weixin);
//        }
//
//        weixinRCAdapter = new weixinRecycleViewAdapter(weixinList,getActivity());
//        recyclerView.setAdapter(weixinRCAdapter);
//    }
}