package com.toolslibrary.LoadPicture;

import android.content.Context;
import android.widget.ImageView;

public class FrescoUtils {
    private static FrescoUtils instance;
    private Context mContext;
    public FrescoUtils(Context context) {
        this.mContext = context;
    }
    public static FrescoUtils getInstance(Context context) {
        instance = new FrescoUtils(context);
        return instance;
    }
    //普通加载
    public void FrescoNoError(String url, ImageView imageView) {
        if (null != url && !url.equals("")) {

        }
    }

}
