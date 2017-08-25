package com.avic.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.avic.dagger2.component.DaggerLazyActivityComponent;

import javax.inject.Inject;

import dagger.Lazy;

public class LazyActivity extends AppCompatActivity {


    @Inject
    Lazy<Test3> test1;

    @Inject
    Lazy<Test3> test2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lazy);

        TextView textView3 = (TextView) findViewById(R.id.textView3);


        DaggerLazyActivityComponent.builder().build().inject(this);
        textView3.setText(test1.get().name + "\n--->" + test2.get().name);


    }
}
