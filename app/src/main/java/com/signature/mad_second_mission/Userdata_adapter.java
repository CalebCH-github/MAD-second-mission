package com.signature.mad_second_mission;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import model.User;

public class Userdata_adapter extends RecyclerView.Adapter<Userdata_adapter.Viewholder> {

    private ArrayList<User> listuser;
    private OnCardListener cardListener;

    public Userdata_adapter(ArrayList<User> listuser, OnCardListener cardListener) {
        this.listuser = listuser;
        this.cardListener = cardListener;
    }




    @NonNull

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_user,parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        User listuserr = listuser.get(position);
        holder.text_name.setText(listuserr.getName());
        holder.text_agenumber.setText(listuserr.getAge());
        holder.text_address.setText(listuserr.getAddress());
    }

    @Override
    public int getItemCount() {
        return listuser.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        //private RecyclerView recycler_user;
        private TextView text_name, text_address, text_agenumber, text_agetext;
        private ImageView imageView_user;

        public Viewholder(View itemView) {
            super(itemView);

            //recycler_user = itemView.findViewById(R.id.recyclerview_user);
        }
    }
}
