package com.example.nearmedemo.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nearmedemo.AdvisoryModel;
import com.example.nearmedemo.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends FirebaseRecyclerAdapter<AdvisoryModel,MyAdapter.myviewholder>
{
    public MyAdapter(@NonNull FirebaseRecyclerOptions<AdvisoryModel> options){
        super(options);
    }


    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull AdvisoryModel model) {

        holder.descriptiontxt.setText(model.getDescription());
        holder.titletxt.setText(model.getTitle());

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_adapter_layout,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder{

        TextView titletxt, descriptiontxt;

        public myviewholder(@NonNull View itemView){
            super(itemView);

            titletxt=itemView.findViewById(R.id.titleTV);
            descriptiontxt=itemView.findViewById(R.id.descriptionTV);

        }
    }


}
