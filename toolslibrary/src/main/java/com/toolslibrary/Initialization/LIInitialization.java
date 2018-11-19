package com.toolslibrary.Initialization;

import android.content.Context;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class LIInitialization {
    //初始化
    public void init(Context context, String appid){
        UMConfigure.init(context,appid,"umeng", UMConfigure.DEVICE_TYPE_PHONE,"");
    }
    //微信
    public void initweixin(String appid,String AppSecret){
        PlatformConfig.setWeixin(appid, AppSecret);
    }
}
