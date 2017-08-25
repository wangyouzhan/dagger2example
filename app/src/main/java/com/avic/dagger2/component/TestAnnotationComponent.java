package com.avic.dagger2.component;

import com.avic.dagger2.PerActivity;
import com.avic.dagger2.TestAnnotationActivity;
import com.avic.dagger2.module.TestAnnotationModule;

import dagger.Component;

/**
 * Creater: Created by wangyz on 24/8/2017.
 * Email: 936804097@qq.com
 */

@PerActivity
@Component(modules = TestAnnotationModule.class)
public interface TestAnnotationComponent {

    void inject(TestAnnotationActivity annotationActivity);



}
