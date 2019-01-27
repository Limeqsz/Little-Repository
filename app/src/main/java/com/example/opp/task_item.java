package com.example.opp;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class task_item extends AppCompatActivity implements View.OnClickListener  {
    private TextView starttime,endtime;
    private Calendar calendar;
    private int hour;       //时
    private int minute;     //分

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_item);
        Button button = (Button) findViewById(R.id.title_back);


        starttime = findViewById(R.id.task_start_date);
        endtime = findViewById(R.id.task_end_date);
        calendar = Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR);//获取小时
        minute = calendar.get(Calendar.MINUTE);//获取分钟



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task_item.this.onBackPressed();  //返回上一级页面；
            }
        });
        starttime.setOnClickListener(this);
        endtime.setOnClickListener(this);

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


