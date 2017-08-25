package com.avic.dagger2.component;

import com.avic.dagger2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Creater: Created by wangyz on 24/8/2017.
 * Email: 936804097@qq.com
 */


@Singleton
@Component()
public interface MainActivityComponent {

    void inject(MainActivity activity);
}
