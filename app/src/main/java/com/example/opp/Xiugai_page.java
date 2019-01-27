package com.example.opp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class Xiugai_page extends AppCompatActivity {
    private EditText account;
    private EditText oldpsw;
    private EditText newpsw;
    private EditText newpswagin;
    private Button nextButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiugai_page);
        //实例化控件
        account=findViewById(R.id.xiugai_account);
        oldpsw=findViewById(R.id.xiugai_oldpsw);
        newpsw=findViewById(R.id.xiugai_newpsw);
        newpswagin=findViewById(R.id.xiugai_newpswagin);
        nextButton=findViewById(R.id.xiugai_next);


    }
}
