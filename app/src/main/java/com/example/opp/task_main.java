package com.example.opp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class task_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_main);
        Button button = (Button) findViewById(R.id.title_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task_main.this.onBackPressed();  //返回上一级页面；
            }
        });
        Button button_add_task = (Button) findViewById(R.id.task_add);
        button_add_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(task_main.this,task_item.class );
                startActivity(intent);
            }
        });

    }
}
