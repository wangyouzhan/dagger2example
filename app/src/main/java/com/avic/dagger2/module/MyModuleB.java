package com.avic.dagger2.module;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;

/**
 * Creater: Created by wangyz on 25/8/2017.
 * Email: 936804097@qq.com
 */

@Module
public class MyModuleB {


    @Provides
    @ElementsIntoSet
    static Set<String> provideSomeStrings() {
        return new HashSet<>(Arrays.asList("DEF", "GHI"));
    }


}
