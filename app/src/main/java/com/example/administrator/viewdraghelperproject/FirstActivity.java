package com.example.administrator.viewdraghelperproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/1.
 */
public class FirstActivity extends Activity{

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView = new TextView(FirstActivity.this);
        textView.setLayoutParams(new LinearLayout.LayoutParams(100,100));
        textView.setText("I'm First");
    }
}
