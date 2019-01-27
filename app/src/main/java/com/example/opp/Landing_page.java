package com.example.opp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Landing_page extends AppCompatActivity {
    //命名所需要控件
    private Button landButton;
    private Button registerButton;
    private Button forgetButton;
    private RadioGroup selectclient;
    private RadioButton parentclient;
    private RadioButton childrenclient;
    private EditText account;
    private EditText psw;
    private RadioButton pswRemember;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //实例化控件
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
        registerButton=findViewById(R.id.forget_button);
        landButton=findViewById(R.id.landing_button);
        account=findViewById(R.id.account_Edittext);
        psw=findViewById(R.id.psw_Edittext);
        pswRemember=findViewById(R.id.pswRemember_button);
        forgetButton=findViewById(R.id.forget_button);
        selectclient=findViewById(R.id.selectclient_button);
        parentclient=findViewById(R.id.parentclient_button);
        childrenclient=findViewById(R.id.childrenclient_button);
        //跳转逻辑

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Landing_page.this,Zhuce_page.class);
                startActivity(intent);
            }
        });
        forgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Landing_page.this,Xiugai_page.class);
                startActivity(intent);
            }
        });

        //landing逻辑
        landButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Landing_page.this,home_page.class);
                startActivity(intent);
            }
        });
    }
}
