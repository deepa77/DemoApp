package com.example.deepa.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2loginActivity extends AppCompatActivity {
    EditText email_text, passwordEditText;
    TextView forgetTextView;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2login);
        email_text = findViewById(R.id.email_text);
        passwordEditText = findViewById(R.id.passwordEditText);
        btnLogin = findViewById(R.id.btn_login);
        forgetTextView = findViewById(R.id.forgetTextView);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = email_text.getText().toString().trim();
                String pass = passwordEditText.getText().toString().trim();


                if (email.equalsIgnoreCase("deepsojha77@gamil.com") && pass.equalsIgnoreCase("nast")) {
                    Toast.makeText(Main2loginActivity.this,"login Sucessfully",Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Main2loginActivity.this ,"loginFailed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
