package com.example.deepa.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class databaseActivity extends AppCompatActivity {
    EditText etName, etpAss, etNewName, etDelete;
    Button btnUpdate, btnDelete, btnViewData, btnAddUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        etName = findViewById(R.id.et_name);
        etNewName = findViewById(R.id.et_newName);
        etpAss = findViewById(R.id.et_pAss);
        btnUpdate = findViewById(R.id.btn_update);
        btnDelete = findViewById(R.id.btn_delete);
        btnViewData = findViewById(R.id.btn_view_data);
        btnAddUser = findViewById(R.id.btn_add_user);


    }
}
