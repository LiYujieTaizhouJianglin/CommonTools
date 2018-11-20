package com.toolslibrary.Login;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.toolslibrary.Toast.LIToast;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

public class LiLogin {
    private Map<String, String> paramsac;
    public Map<String, String> WeChatlogin(final Context mContext){
        UMShareAPI.get(mContext).getPlatformInfo((Activity)mContext, SHARE_MEDIA.WEIXIN, new UMAuthListener() {
            @Override
            public void onStart(SHARE_MEDIA share_media) {

            }

            @Override
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                paramsac = map;
            }

            @Override
            public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
                LIToast.show(mContext, "失败");
            }

            @Override
            public void onCancel(SHARE_MEDIA share_media, int i) {
                LIToast.show(mContext, "取消了");
            }
        });
        return paramsac;
    }
    public Map<String, String> QQlogin(final Context mContext){
        UMShareAPI.get(mContext).getPlatformInfo((Activity)mContext, SHARE_MEDIA.QQ, new UMAuthListener() {
            @Override
            public void onStart(SHARE_MEDIA share_media) {

            }

            @Override
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                paramsac = map;
            }

            @Override
            public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
                LIToast.show(mContext, "失败");
            }

            @Override
            public void onCancel(SHARE_MEDIA share_media, int i) {
                LIToast.show(mContext, "取消了");
            }
        });
        return paramsac;
    }
}
