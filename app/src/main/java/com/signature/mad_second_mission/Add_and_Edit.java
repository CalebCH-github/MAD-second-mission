package com.signature.mad_second_mission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.textfield.TextInputLayout;

import java.util.List;

public class Add_and_Edit extends AppCompatActivity {

    private TextInputLayout input_Fullname;
    private TextInputLayout input_Age;
    private TextInputLayout input_Address;
    private Button button_save;
    private Button button_update;
    private Toolbar toolbar_add, toolbar_edit;

    private boolean checkuser = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_and_edit);

        input_Fullname = findViewById(R.id.input_Fullname);
        input_Age = findViewById(R.id.input_Age);
        input_Address = findViewById(R.id.input_Address);
        button_save = findViewById(R.id.button_save);
        button_update = findViewById(R.id.button_update);
        //toolbar_edit = (Toolbar)findViewById(R.id.toolbar_edit);

        if (checkuser == false){
            button_update.setVisibility(View.INVISIBLE);
            //toolbar_edit.setTitle("Add user");
        }
        AddUser();

        }

        private void AddUser(){

            button_save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String add_name = input_Fullname.getEditText().getText().toString().trim();
                    String add_age = input_Age.getEditText().getText().toString().trim();
                    String add_address = input_Address.getEditText().getText().toString().trim();

                    if (add_name.isEmpty() || add_age.isEmpty() || add_address.isEmpty()){
                        Toast.makeText(Add_and_Edit.this,"Fill all data",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Intent intent = new Intent(Add_and_Edit.this, List_User.class);
                        intent.putExtra("name", add_name);
                        intent.putExtra("age", add_age);
                        intent.putExtra("address", add_address);
                        startActivity(intent);
                        finish();
                    }
                }


        });

    }
}