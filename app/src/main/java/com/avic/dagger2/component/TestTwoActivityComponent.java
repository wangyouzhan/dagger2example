package com.avic.dagger2.component;

import com.avic.dagger2.PerActivity;
import com.avic.dagger2.TestTwoActivity;
import com.avic.dagger2.module.CModule;

import dagger.Component;

/**
 * Creater: Created by wangyz on 24/8/2017.
 * Email: 936804097@qq.com
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = CModule.class)
public interface TestTwoActivityComponent {

    void inject(TestTwoActivity activity);


}
