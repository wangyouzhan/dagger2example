package com.avic.dagger2.module;

import com.avic.dagger2.PerActivity;
import com.avic.dagger2.Test5;

import dagger.Module;
import dagger.Provides;

/**
 * Creater: Created by wangyz on 25/8/2017.
 * Email: 936804097@qq.com
 */

@Module
public class LazyActivityModule {


    @PerActivity
    @Provides
    Test5 provideTest3() {
        return new Test5(45);
    }


}
