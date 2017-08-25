package com.avic.dagger2;

import javax.inject.Inject;

/**
 * Creater: Created by wangyz on 24/8/2017.
 * Email: 936804097@qq.com
 */

public class Test3 {

    String name = "wang";

    @Inject
    public Test3() {
        name = "you";
    }
}
