package com.example.workwork.v;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.workwork.R;
import com.example.workwork.contract.Contract;
import com.example.workwork.p.MyPresent;

public class MainActivity extends AppCompatActivity implements Contract.ViewInteface {
//声明P层
    Contract.PresenterInteface presenterInteface;

    private EditText login_phone,login_pwd;
    private Button btn_login;
    private TextView text_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        presenterInteface=new MyPresent(this);
        ((MyPresent) presenterInteface).getMyModel();


    }

    private void init() {
        //初始化ID
         login_phone = findViewById(R.id.login_phone);
         login_pwd=findViewById(R.id.login_pwd);
         btn_login = findViewById(R.id.btn_login);
         text_show=findViewById(R.id.text_show);
    }

    @Override
    public void ShowDisplay(String str) {
        btn_login.setText(str);
    }
}
