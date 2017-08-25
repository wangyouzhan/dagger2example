package com.avic.dagger2;

import java.util.Set;

import javax.inject.Inject;

/**
 * Creater: Created by wangyz on 25/8/2017.
 * Email: 936804097@qq.com
 */

public class Bar {


    @Inject
    Bar(Set<String> strings) {
        assert strings.contains("ABC");
        assert strings.contains("DEF");
        assert strings.contains("GHI");
    }
}
