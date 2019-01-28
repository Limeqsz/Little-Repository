package com.example.opp;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class home_page extends AppCompatActivity {

    //滑动布局
    private DrawerLayout mDrawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
//        Button button_title_back = (Button) findViewById(R.id.title_back);
//        button_title_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(home_page.this,"这个页面还没写好",Toast.LENGTH_LONG ).show();
//            }
//        });
//        Button button_yonghu = (Button) findViewById(R.id.title_yonghu);
//        button_yonghu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(home_page.this,"这个页面还没写好",Toast.LENGTH_LONG ).show();
//            }
//        });
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

        //实例化标题栏
        Toolbar toolbar = findViewById(R.id.home_page_title);
        setSupportActionBar(toolbar);
        //实例化滑动布局
        mDrawerLayout=findViewById(R.id.home_drawer_layout);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ice_add_childern);
        }
    }

    //title中的menu点击逻辑

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    //设置toolbar中menu的点击事件


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_setting:
                mDrawerLayout.openDrawer(GravityCompat.END);
                break;
            default:
        }
        return true;
    }
}
