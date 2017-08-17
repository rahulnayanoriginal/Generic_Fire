package com.example.parasajmera.genericfire;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loginpage extends AppCompatActivity {
Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        addListenerOnButton();

    }
    public void addListenerOnButton()
    {
        final Context context = this;
        button = (Button) findViewById(R.id.button);
        button2 =(Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(Loginpage.this, Login2.class);
                startActivity(intent);
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(Loginpage.this, Register.class);
                startActivity(intent);
            }


        });
    }

}
