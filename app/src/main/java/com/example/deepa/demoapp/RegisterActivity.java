package com.example.deepa.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    TextView tv_register;
    EditText et_fName, et_lName, et_Email, et_pass, et_confirmPass;
    Spinner simpleSpinner;
    CheckBox checkBox;
    Button btn_register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        String[] arraySpinner = new String[]{
                "1", "2", "3", "4", "5", "6", "7"
        };
        Spinner s = (Spinner) findViewById(R.id.simpleSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        et_fName = findViewById(R.id.et_fName);
        et_lName = findViewById(R.id.et_lName);
        et_Email = findViewById(R.id.et_Email);
        et_pass = findViewById(R.id.et_pass);
        et_confirmPass = findViewById(R.id.et_confirmPass);
        simpleSpinner = findViewById(R.id.simpleSpinner);
        checkBox = findViewById(R.id.checkbox);
        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String fName = et_fName.getText().toString().trim();
                String lName = et_lName.getText().toString().trim();
                String pass = et_pass.getText().toString().trim();
                String confirmPass = et_confirmPass.getText().toString().trim();
                String email = et_Email.getText().toString().trim();


            }

            public void onCheckedClicked(View view) {
                CheckBox cBox = findViewById(R.id.checkbox);
                if (cBox.isChecked()) {
                    btn_register.setEnabled(true);
                } else {
                    btn_register.setEnabled(false);

                }


            }
        });

    }
}
