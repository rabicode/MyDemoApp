package com.example.user.mydemoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    Button btncall, btnmessage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncall = (Button) findViewById(R.id.btn_call);
        btnmessage = (Button) findViewById(R.id.btn_sms);
        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                call(view);
                btncall.setVisibility(View.INVISIBLE);

                btnmessage.setVisibility(View.INVISIBLE);
            }
        });
        btnmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
                message(view);
                btncall.setVisibility(View.INVISIBLE);

                btnmessage.setVisibility(View.INVISIBLE);
            }
        });
    }
    public void call(View view) {

    }

    public void message(View view) {

        startActivity(new Intent(getApplicationContext(),Login.class));
    }
}
