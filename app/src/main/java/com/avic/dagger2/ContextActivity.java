package com.avic.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.avic.dagger2.component.DaggerApplicationComponent;
import com.avic.dagger2.module.AndroidModule;

import javax.inject.Inject;

public class ContextActivity extends AppCompatActivity {


    @Inject
    Test test;

    @Inject
    Test test2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context);

        DaggerApplicationComponent.builder()
                .androidModule(new AndroidModule((DemoApplication) getApplication()))
                .build()
                .inject(this);


        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        if (test != null){
            System.out.println("--------------------test:" + test.hashCode());
            System.out.println("--------------------test:" + test2.hashCode());
            tv_name.setText(String.valueOf(test.age));
        }


    }
}
