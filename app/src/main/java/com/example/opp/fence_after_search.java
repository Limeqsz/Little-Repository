package com.example.opp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class fence_after_search extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fence_after_search);
        Button button = findViewById(R.id.button);
        TextView tv_search_value = findViewById(R.id.search_position);
        Intent intent = getIntent();
        String data = intent.getStringExtra("search_value");   //传递搜索结果；
        tv_search_value.setText(data);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fence_after_search.this.onBackPressed();  //返回上一级页面；
            }
        });
        //开始时间选择……………………………………………………………………………………………………
        TimePicker startTimepicker = (TimePicker)findViewById(R.id.start_date);
        startTimepicker.setDescendantFocusability(TimePicker.FOCUS_BLOCK_DESCENDANTS);  //设置点击事件不弹键盘
        startTimepicker.setIs24HourView(true);   //设置时间显示为24小时
        startTimepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {  //获取当前选择的时间
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            }
        });
//        结束时间选择………………………………………………………………………………………………………
        TimePicker endTimepicker = (TimePicker)findViewById(R.id.end_date);
        endTimepicker.setDescendantFocusability(TimePicker.FOCUS_BLOCK_DESCENDANTS);  //设置点击事件不弹键盘
        endTimepicker.setIs24HourView(true);   //设置时间显示为24小时
        endTimepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {  //获取当前选择的时间
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            }
        });


    }
}
