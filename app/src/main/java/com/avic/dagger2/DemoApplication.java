package com.avic.dagger2;

import android.app.Application;
import android.location.LocationManager;

import com.avic.dagger2.component.ApplicationComponent;
import com.avic.dagger2.component.DaggerApplicationComponent;
import com.avic.dagger2.module.AndroidModule;

import javax.inject.Inject;

/**
 * Creater: Created by wangyz on 24/8/2017.
 * Email: 936804097@qq.com
 * https://github.com/luxiaoming/dagger2Demo
 */

public class DemoApplication extends Application {

    @Inject
    LocationManager locationManager;


    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .androidModule(new AndroidModule(this))
                .build();
        component.inject(this);
    }




    public ApplicationComponent getComponent() {
        return component;
    }
}
