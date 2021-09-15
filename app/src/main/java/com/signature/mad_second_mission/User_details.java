package com.signature.mad_second_mission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class User_details extends AppCompatActivity {

    private TextView text_detailname, text_detailage, text_detailaddress;
    private FloatingActionButton FAB_edit, FAB_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        text_detailname =findViewById(R.id.text_detailname);
        text_detailage =findViewById(R.id.text_detailage);
        text_detailaddress =findViewById(R.id.text_detailaddress);
        FAB_edit =findViewById(R.id.FAB_edit);
        FAB_delete =findViewById(R.id.FAB_delete);
    }
}