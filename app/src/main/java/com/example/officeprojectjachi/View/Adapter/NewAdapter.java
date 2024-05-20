package com.example.officeprojectjachi.View.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.officeprojectjachi.Service.Model.BusinessTypesItem;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.NewViewHolder> {

    private Context context;
    private List<BusinessTypesItem> businessTypesItemList;;

    public NewAdapter(Context context, List<BusinessTypesItem> businessTypesItemList) {
        this.context = context;
        this.businessTypesItemList = businessTypesItemList;
    }

    @NonNull
    @Override
    public NewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_item_layout, parent, false);
        return new NewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewViewHolder holder, int position) {
        NewItemType currentItem = newItemList.get(position);
        // Bind data to views in the ViewHolder
    }

    @Override
    public int getItemCount() {
        return newItemList.size();
    }

    public class NewViewHolder extends RecyclerView.ViewHolder {
        // Declare views here

        public NewViewHolder(@NonNull View itemView) {
            super(itemView);
            // Initialize views here
        }
    }
}
