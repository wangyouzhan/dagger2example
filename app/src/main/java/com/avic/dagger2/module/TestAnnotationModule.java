package com.avic.dagger2.module;

import com.avic.dagger2.PerActivity;
import com.avic.dagger2.Test5;
import com.avic.dagger2.annotation.ForBoy;
import com.avic.dagger2.annotation.ForGirl;

import dagger.Module;
import dagger.Provides;

/**
 * Creater: Created by wangyz on 24/8/2017.
 * Email: 936804097@qq.com
 */

@Module
public class TestAnnotationModule {


    @PerActivity
    @ForBoy
    @Provides
    Test5 provideBoy() {
        return new Test5(100);
    }


    @PerActivity
    @ForGirl
    @Provides
    Test5 provideGirl() {
        return new Test5(300);
    }


}
