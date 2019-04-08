package com.tony.tang.dummy.lib;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.tony.tang.dummy.lib.demo.DummyUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_message = findViewById(R.id.tv_message);
        tv_message.setText(DummyUtil.getDummyMessage());
    }
}
