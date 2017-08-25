package com.avic.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.avic.dagger2.component.ApplicationComponent;
import com.avic.dagger2.component.DaggerMainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Test3 test3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_title = (TextView) findViewById(R.id.tv_title);

        DaggerMainActivityComponent.builder().build().inject(this);

        ApplicationComponent component = ((DemoApplication)getApplication()).getComponent();
        if (component != null){
            System.out.println("applicationcomponent init....----------");
        }

        tv_title.setText(test3.name);


    }
}
