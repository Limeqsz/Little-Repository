package com.example.opp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fence_before_search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fence_before_search);
        final EditText tv_search_vaule = findViewById(R.id.search_position);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fence_before_search.this.onBackPressed();  //返回上一级页面；
            }
        });
        Button button_search = (Button) findViewById(R.id.button_search);
        button_search.setOnClickListener(new View.OnClickListener() {    //搜索后；
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fence_before_search.this,fence_after_search.class);
                intent.putExtra("search_value",tv_search_vaule.getText().toString());
                startActivity(intent);
            }
        });

    }

}
