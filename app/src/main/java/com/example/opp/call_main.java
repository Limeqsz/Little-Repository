package com.example.opp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class call_main extends AppCompatActivity {
    private Button button_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_record_main);
        button_back = (Button) findViewById(R.id.title_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    call_main.this.onBackPressed();  //返回上一级页面；
            }
        });
    }
}
