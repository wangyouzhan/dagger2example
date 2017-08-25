package com.avic.dagger2.component;

import com.avic.dagger2.MyActivity;
import com.avic.dagger2.module.MyModuleA;
import com.avic.dagger2.module.MyModuleB;

import java.util.Set;

import dagger.Component;

/**
 * Creater: Created by wangyz on 25/8/2017.
 * Email: 936804097@qq.com
 */

@Component(modules = {MyModuleA.class, MyModuleB.class})
public interface MyComponent {

    MyActivity inject(MyActivity activity);

    Set<String> strings();


}
