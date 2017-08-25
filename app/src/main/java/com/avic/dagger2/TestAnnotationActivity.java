package com.avic.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.avic.dagger2.annotation.ForBoy;
import com.avic.dagger2.annotation.ForGirl;
import com.avic.dagger2.component.DaggerTestAnnotationComponent;
import com.avic.dagger2.module.TestAnnotationModule;

import javax.inject.Inject;

public class TestAnnotationActivity extends AppCompatActivity {


    @ForGirl
    @Inject
    Test5 test1;

    @ForBoy
    @Inject
    Test5 test2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_annotation);


        TextView textView2 = (TextView) findViewById(R.id.textView2);

        DaggerTestAnnotationComponent.builder()
                .testAnnotationModule(new TestAnnotationModule())
                .build()
                .inject(this);


        textView2.setText(test1.hashCode() + "\ntest2:" + test2.hashCode() + "\ntest1:" + test1.a + "\ntest2:" + test2.a);


    }


}
