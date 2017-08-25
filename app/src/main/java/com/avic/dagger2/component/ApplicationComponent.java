package com.avic.dagger2.component;

import android.location.LocationManager;

import com.avic.dagger2.ContextActivity;
import com.avic.dagger2.DemoApplication;
import com.avic.dagger2.MainActivity;
import com.avic.dagger2.module.AndroidModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Creater: Created by wangyz on 24/8/2017.
 * Email: 936804097@qq.com
 */

@Singleton
@Component(modules = AndroidModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication application);

    void inject(MainActivity activity);

    void inject(ContextActivity activity);

    LocationManager getLocationManager();

}
