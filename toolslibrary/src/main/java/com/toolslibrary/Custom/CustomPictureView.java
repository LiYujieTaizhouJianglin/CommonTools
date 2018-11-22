package com.toolslibrary.Custom;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.view.SimpleDraweeView;

public class CustomPictureView extends SimpleDraweeView {

    public CustomPictureView(Context context) {
        this(context,null);
    }

    public CustomPictureView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomPictureView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


}
