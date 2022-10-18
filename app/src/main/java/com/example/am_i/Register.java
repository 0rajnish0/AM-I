package com.example.am_i;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    public static final String TAG = "TAG";

    EditText mFullName, mEmail, mPassword;
    Button mRegisterBtn;
    TextView mloginBtn;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mFullName = findViewById(R.id.fullname);
        mEmail = findViewById(R.id.email);
        mRegisterBtn = findViewById(R.id.register);
        mloginBtn = findViewById(R.id.signin);


        mloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });


        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                final String fullname = mFullName.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    mEmail.setError("email is required");
                    return;
                }

                if (password.length() < 8 ){
                    mPassword.setError("password must be => 8 character");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);
            }
        });


    }
}