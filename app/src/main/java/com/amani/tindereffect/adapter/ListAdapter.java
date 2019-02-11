package com.amani.tindereffect.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.amani.tindereffect.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListItem> {

    private List<Integer> items = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));


    @NonNull
    @Override
    public ListItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ListItem(
                LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.dummy_list_view,viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListItem listItem, int i) {
        listItem.bind(items.get(i).intValue());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public List<Integer> getItems(){
        return items;
    }

    public void removeTopItem(){
        items.remove(0);
        notifyDataSetChanged();
    }
}
