package com.avic.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.avic.dagger2.component.DaggerTestTwoActivityComponent;
import com.avic.dagger2.module.CModule;

import javax.inject.Inject;

public class TestTwoActivity extends AppCompatActivity {


    //    //
    @Inject
    Test4 test4;

    @Inject
    Test4 test5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_two);

        DaggerTestTwoActivityComponent.builder()
                .applicationComponent(((DemoApplication) getApplication()).getComponent())
                .cModule(new CModule()).build().inject(this);


        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("test4:" + test4.hashCode() + "\ntest5:" + test5.hashCode());
        System.out.println("-----------------test4:" + test4.hashCode() + "-test5:" + test5.hashCode());


    }


}
