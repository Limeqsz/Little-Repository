package com.example.opp;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class fence_after_search extends AppCompatActivity implements View.OnClickListener {
    private Button button_back;
    private  EditText tv_search_value;
    private  TimePicker startTimepicker;
    private TimePicker endTimepicker;
    private TextView starttime,endtime;
    private Calendar calendar;
    private int hour;       //时
    private int minute;     //分
    private int Year;       //年
    private int month;      //月
    private int day;        //日
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fence_after_search);
        button_back = findViewById(R.id.button);
        tv_search_value = findViewById(R.id.search_position);
        starttime = findViewById(R.id.start_date);
        endtime = findViewById(R.id.end_date);
        calendar = Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR);//获取小时
        minute = calendar.get(Calendar.MINUTE);//获取分钟
        Intent intent = getIntent();
        String data = intent.getStringExtra("search_value");   //传递搜索结果；
        tv_search_value.setText(data);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fence_after_search.this.onBackPressed();  //返回上一级页面；
            }
        });
        starttime.setOnClickListener(this);
        endtime.setOnClickListener(this);
//        //开始时间选择……………………………………………………………………………………………………
//        startTimepicker = (TimePicker)findViewById(R.id.start_date);
//        startTimepicker.setDescendantFocusability(TimePicker.FOCUS_BLOCK_DESCENDANTS);  //设置点击事件不弹键盘
//        startTimepicker.setIs24HourView(true);   //设置时间显示为24小时
//        startTimepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {  //获取当前选择的时间
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//            }
//        });
//        结束时间选择………………………………………………………………………………………………………
//        endTimepicker = (TimePicker)findViewById(R.id.end_date);
//        endTimepicker.setDescendantFocusability(TimePicker.FOCUS_BLOCK_DESCENDANTS);  //设置点击事件不弹键盘
//        endTimepicker.setIs24HourView(true);   //设置时间显示为24小时
//        endTimepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {  //获取当前选择的时间
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//
//            }
//        });


    }
    public void onClick(View v)
    {
        if (v==starttime) {
            new TimePickerDialog(this, AlertDialog.THEME_HOLO_LIGHT,new TimePickerDialog.OnTimeSetListener() {
                //实现监听方法
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
                    //设置文本显示内容
                    starttime.setText(i + ":" + i1);
                }
            }, hour, minute, true).show();//记得使用show才能显示！
        }
        if(v==endtime)
        {
            new TimePickerDialog(this, AlertDialog.THEME_HOLO_LIGHT,new TimePickerDialog.OnTimeSetListener() {
                //实现监听方法
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
                    //设置文本显示内容
                    endtime.setText(i + ":" + i1);
                }
            }, hour, minute, true).show();//记得使用show才能显示！
        }
    }
}
