package com.signature.mad_second_mission;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import model.User;

public class List_User extends AppCompatActivity {

    private FloatingActionButton FAB_Add;
    private TextView NoData;
    private RecyclerView recyclerview_user;
    private Userdata_adapter adapter;
    private ArrayList<User> datauser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user);

        FAB_Add = findViewById(R.id.FAB_Add);
        NoData = findViewById(R.id.NoData);
        recyclerview_user = findViewById(R.id.recyclerview_user);
        datauser = new ArrayList<User>();
        adapter = new Userdata_adapter(datauser, new OnCardListener() {
            @Override
            public void OnCardClick(int position) {

            }
        });


        showrecyclerview();




        FAB_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_User.this,Add_and_Edit.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        for (int i = 0; i < datauser.size(); i++) {
        User userbaru = data.getParcelableExtra("userbaru");

            //User userbaru = new User();
            userbaru.setName("name");
            userbaru.setAge("age");
            userbaru.setAddress("address");
            datauser.add(userbaru);
            //loaddata();
            adapter.notifyDataSetChanged();
        }
    }


    private void showrecyclerview(){
        RecyclerView.LayoutManager manager =new LinearLayoutManager(getBaseContext());
        recyclerview_user.setLayoutManager(manager);
        recyclerview_user.setAdapter(adapter);

    }

    private void loaddata(){
        for (int i = 0; i < datauser.size(); i++){
            User userbaruu = new User();
            userbaruu.setName("name");
            userbaruu.setAge("age");
            userbaruu.setAddress("address");
            datauser.add(userbaruu);
        }
        adapter.notifyDataSetChanged();
    }
}