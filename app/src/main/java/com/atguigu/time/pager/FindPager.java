package com.atguigu.time.pager;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.atguigu.time.base.BasePager;

/**
 * Created by vence on 16/4/8 18:17
 * 邮箱 ：vence0815@foxmail.com
 */
public class FindPager extends BasePager {
    public FindPager(Activity activity) {
        super(activity);
    }

    @Override
    protected View getView() {
        TextView textView = new TextView(mActivity);
        textView.setText("发现");
        return textView;
    }


}
