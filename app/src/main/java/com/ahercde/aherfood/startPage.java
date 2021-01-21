package com.ahercde.aherfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class startPage extends AppCompatActivity {

    private Button button1;
    private Button button2;




    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        setContentView(R.layout.activity_start_page);



        button1 = findViewById(R.id.loginBtn);
        button2 = findViewById(R.id.signUpBtn);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startSignIn();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startSignUp();
            }
        });
    }

    public void startSignIn() {
        Intent intent1 = new Intent(startPage.this, MainActivity.class);
        startActivity(intent1);
    }


    public void startSignUp() {
        Intent intent2 = new Intent(startPage.this, SignupActivity.class);
        startActivity(intent2);

    }
}
