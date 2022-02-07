package com.example.practice_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logIn(View view) {
        Intent intent = new Intent(this, User_catgory.class);
        startActivity(intent);
    } // 点击登录

    public void registerAccount(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    } // 注册
}