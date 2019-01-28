package com.example.opp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        Button button_add = (Button) findViewById(R.id.btn_add);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_page.this,add_page.class );
                startActivity(intent);
            }
        });

        Button button_yonghu = (Button) findViewById(R.id.title_yonghu);
        button_yonghu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home_page.this,"这个页面还没写好",Toast.LENGTH_LONG ).show();
            }
        });
        Button button_fence = (Button) findViewById(R.id.fence);
        button_fence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_page.this,fence_before_search.class );
                startActivity(intent);
            }
        });
        Button button_task = (Button) findViewById(R.id.title_renwu);
        button_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_page.this,task_main.class );
                startActivity(intent);
            }
        });
        Button button_chat = (Button) findViewById(R.id.title_liaotian);
        button_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_page.this,chat_main.class );
                startActivity(intent);
            }
        });
        Button button_call_record = (Button) findViewById(R.id.title_tonghua);
        button_call_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_page.this,call_main.class );
                startActivity(intent);
            }
        });
        Button button_lianxiren = (Button) findViewById(R.id.title_lianxiren);
        button_lianxiren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_page.this,contacts_main.class );
                startActivity(intent);
            }
        });



    }
}
