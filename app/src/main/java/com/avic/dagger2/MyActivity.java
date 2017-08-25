package com.avic.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.avic.dagger2.component.DaggerMyComponent;

import java.util.Set;

public class MyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        TextView textView4 = (TextView) findViewById(R.id.textView4);

//        DaggerMyComponent.builder().build().inject(this);

        Set<String> stringSet = DaggerMyComponent.builder().build().strings();
        StringBuilder stringBuilder = new StringBuilder();
        for (String temp : stringSet) {
            stringBuilder.append(temp);
        }
        textView4.setText(stringBuilder.toString() + "\n");


    }
}
