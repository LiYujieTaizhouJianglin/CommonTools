package com.toolslibrary.Initialization;

import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class LIInitialization {
    //初始化
    public static void init(Context context, String appid){
        UMConfigure.init(context,appid,"umeng", UMConfigure.DEVICE_TYPE_PHONE,"");
    }
    //微信
    public static void initweixin(String appid,String AppSecret){
        PlatformConfig.setWeixin(appid, AppSecret);
    }

    //初始化Fresco
    public static void initFresco(Context context){
        Fresco.initialize(context);
    }

}
