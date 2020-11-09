package com.example.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.ImageButton;
import android.widget.LinearLayout;


import com.example.myapplication.fragment.contactFragment;
import com.example.myapplication.fragment.frdFragment;
import com.example.myapplication.fragment.settingFragment;
import com.example.myapplication.fragment.weixinFragment;

public class MainActivity extends Activity implements View.OnClickListener {
//创建xml的对象，这里是分别创建的xml和fragment文件
    private Fragment mTab01 = new weixinFragment();
    private Fragment mTab02 = new frdFragment();
    private Fragment mTab03 = new contactFragment();
    private Fragment mTab04 = new settingFragment();

    private FragmentManager fm;

//获取线性布局的变量
    LinearLayout mTabWeixin;
    LinearLayout mTabFrd;
    LinearLayout mTabContact;
    LinearLayout mTabSetting;
//获取标签图片按钮的变量
    ImageButton mImgWeixin;
    ImageButton mImgFrd;
    ImageButton mImgContact;
    ImageButton mImgSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //创建调用时的函数
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉窗口标题
        setContentView(R.layout.activity_main);
        initView();
        initFragment();
        initEvent();
        selectFragment(0);
    }


    private void initView() {   //初始化页面，获取切换需要的布局
        mTabWeixin = (LinearLayout) findViewById(R.id.id_tab_weixin);
        mTabFrd = (LinearLayout) findViewById(R.id.id_tab_frd);
        mTabContact = (LinearLayout) findViewById(R.id.id_tab_contact);
        mTabSetting = (LinearLayout) findViewById(R.id.id_tab_setting);

        mImgWeixin = (ImageButton) findViewById(R.id.id_tab_weixin_img);
        mImgFrd = (ImageButton) findViewById(R.id.id_tab_frd_img);
        mImgContact = (ImageButton) findViewById(R.id.id_tab_contact_img);
        mImgSetting = (ImageButton) findViewById(R.id.id_tab_setting_img);
    }

    private void initFragment() {  //初始化中间内容模块
        fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(R.id.id_content, mTab01);
        transaction.add(R.id.id_content, mTab02);
        transaction.add(R.id.id_content, mTab03);
        transaction.add(R.id.id_content, mTab04);
        transaction.commit();
    }

    private void initEvent() {  //开启监听
        mTabWeixin.setOnClickListener(this);
        mTabFrd.setOnClickListener(this);
        mTabContact.setOnClickListener(this);
        mTabSetting.setOnClickListener(this);
    }

    private void selectFragment(int i) {  //实现标签图片点击变色
        FragmentTransaction transaction = fm.beginTransaction();
        hideFragment(transaction);
        switch (i) {
            case 0:
                transaction.show(mTab01);
                mImgWeixin.setImageResource(R.mipmap.tab_weixin_pressed);
                break;
            case 1:
                transaction.show(mTab02);
                mImgFrd.setImageResource(R.mipmap.tab_find_frd_pressed);
                break;
            case 2:
                transaction.show(mTab03);
                mImgContact.setImageResource(R.mipmap.tab_address_pressed);
                break;
            case 3:
                transaction.show(mTab04);
                mImgSetting.setImageResource(R.mipmap.tab_settings_pressed);
                break;
            default:
                break;
        }
        transaction.commit();
    }
    private void hideFragment(FragmentTransaction transaction) {  //隐藏页面
        transaction.hide(mTab01);
        transaction.hide(mTab02);
        transaction.hide(mTab03);
        transaction.hide(mTab04);
    }

    @Override
    public void onClick(View v) {  //实现页面跳转
        resetImgs();
        switch (v.getId()) {
            case R.id.id_tab_weixin:
                selectFragment(0);
                break;
            case R.id.id_tab_frd:
                selectFragment(1);
                break;
            case R.id.id_tab_contact:
                selectFragment(2);
                break;
            case R.id.id_tab_setting:
                selectFragment(3);
                break;
            default:
                break;
        }
    }

    public void resetImgs() {  //设置按钮图片
        mImgWeixin.setImageResource(R.mipmap.tab_weixin_normal);
        mImgFrd.setImageResource(R.mipmap.tab_find_frd_normal);
        mImgContact.setImageResource(R.mipmap.tab_address_normal);
        mImgSetting.setImageResource(R.mipmap.tab_settings_normal);
    }
}