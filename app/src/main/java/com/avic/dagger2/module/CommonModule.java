package com.avic.dagger2.module;

import com.avic.dagger2.Test3;

import dagger.Module;
import dagger.Provides;

/**
 * Creater: Created by wangyz on 25/8/2017.
 * Email: 936804097@qq.com
 */

@Module
public class CommonModule {


    @Provides
    Test3 ProvideTest3() {
        return new Test3();
    }


}
