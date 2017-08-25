package com.avic.dagger2.module;

import android.location.LocationManager;

import com.avic.dagger2.PerActivity;
import com.avic.dagger2.Test4;
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
public class CModule {

    @PerActivity
    @Provides
    Test4 provideboy(LocationManager locationManager) {
        return new Test4(locationManager);
    }


    @PerActivity
    @ForBoy
    @Provides
    Test5 getTest5() {
        return new Test5(100);
    }

    @PerActivity
    @ForGirl
    @Provides
    Test5 getTest6() {
        return new Test5(600);
    }


}
