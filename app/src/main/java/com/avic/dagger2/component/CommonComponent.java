package com.avic.dagger2.component;

import com.avic.dagger2.Test3;
import com.avic.dagger2.module.CommonModule;

import dagger.Subcomponent;

/**
 * Creater: Created by wangyz on 25/8/2017.
 * Email: 936804097@qq.com
 */

@Subcomponent(modules = CommonModule.class)
public interface CommonComponent {

    Test3 getTest3();

}
