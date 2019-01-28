package com.example.opp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.support.v7.widget.Toolbar;

public class Zhuce_page extends AppCompatActivity {
    private EditText account;
    private EditText putVerification;
    private EditText putpsw;
    private Button getVerification;
    private Button resgiter;
    private RadioButton parentClient;
    private RadioButton childrenClient;
    private RadioGroup selectClient;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhuce_page);
        //实例化
        account=findViewById(R.id.zhuceaccount_Edittext);
        putVerification=findViewById(R.id.zhuceputVerification_Edittext);
        getVerification=findViewById(R.id.zhucegetVerification_button);
        putpsw=findViewById(R.id.zhuceputpsw_Edittext);
        resgiter=findViewById(R.id.zhuceregister_button);
        parentClient=findViewById(R.id.zhuceparentclient_button);
        childrenClient=findViewById(R.id.zhucechildrenclient_button);
        selectClient=findViewById(R.id.zhuceSelectClient);

        //实例化标题栏
        Toolbar toolbar = findViewById(R.id.zhuce_title);
        setSupportActionBar(toolbar);
    }
}
