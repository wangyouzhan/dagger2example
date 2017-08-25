package com.avic.dagger2.component;

import com.avic.dagger2.LazyActivity;

import dagger.Component;

/**
 * Creater: Created by wangyz on 25/8/2017.
 * Email: 936804097@qq.com
 */

@Component
public interface LazyActivityComponent {

    void inject(LazyActivity activity);

    CommonComponent getCommonComponent();


}
