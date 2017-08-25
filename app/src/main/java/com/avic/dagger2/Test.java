package com.avic.dagger2;

import android.content.Context;

import javax.inject.Inject;

/**
 * Creater: Created by wangyz on 24/8/2017.
 * Email: 936804097@qq.com
 */

public class Test {

    private Context mContext;
    public int age = 0;

    @Inject
    public Test(Context mContext) {
        this.mContext = mContext;
        age = 100;
    }
}
