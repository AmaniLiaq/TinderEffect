package com.amani.tindereffect.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.amani.tindereffect.R;

public class ListItem extends RecyclerView.ViewHolder {
    TextView textView;


    public ListItem(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text);
    }

    public void bind(int i){
        textView.setText(String.valueOf(i));
    }
}
