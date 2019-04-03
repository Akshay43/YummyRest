package com.example.akluv.firebasesampleapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.akluv.firebasesampleapp.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder
{
    public TextView t1;
    public TextView t2;
    public TextView t3;

    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);

        t1 = (TextView)itemView.findViewById(R.id.txtRestaurantNameResult);
        t2 = (TextView) itemView.findViewById(R.id.txtLocationResult);
        t3 = (TextView)itemView.findViewById(R.id.txtTimingsResult);

    }
}
