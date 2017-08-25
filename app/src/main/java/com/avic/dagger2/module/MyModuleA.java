package com.avic.dagger2.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

/**
 * Creater: Created by wangyz on 25/8/2017.
 * Email: 936804097@qq.com
 */

@Module
public class MyModuleA {

    @Provides
    @IntoSet
    static String provideOneString() {
        return "ABC";
    }

}
