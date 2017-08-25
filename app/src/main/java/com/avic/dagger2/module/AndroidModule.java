package com.avic.dagger2.module;

import android.content.Context;
import android.location.LocationManager;

import com.avic.dagger2.DemoApplication;
import com.avic.dagger2.Test;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Creater: Created by wangyz on 24/8/2017.
 * Email: 936804097@qq.com
 */

@Module
public class AndroidModule {

    private final DemoApplication application;

    public AndroidModule(DemoApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context ApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    LocationManager provideLocationManager() {
        return (LocationManager) application.getSystemService(Context.LOCATION_SERVICE);
    }

    @Provides
    Test provideTest() {
        Test test = new Test(application);
        test.age = 200;
        return test;
    }


}
