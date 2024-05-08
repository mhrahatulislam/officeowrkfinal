package com.example.officeprojectjachi.View.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.officeprojectjachi.R;
import com.example.officeprojectjachi.Service.Model.BusinessTypesItem;
import com.example.officeprojectjachi.Service.Model.ServiceTypesItem;

import java.util.ArrayList;
import java.util.List;

public class BusinessAdapter extends RecyclerView.Adapter<BusinessAdapter.BusinessVH> {

    private Context context;
    private List<BusinessTypesItem> businessTypesItemList;

    public BusinessAdapter(Context context, List<BusinessTypesItem> businessTypesItemList) {
        this.context = context;
        this.businessTypesItemList = businessTypesItemList;
    }

    @NonNull
    @Override
    public BusinessAdapter.BusinessVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_business_item, parent, false);
        return new BusinessVH(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull BusinessAdapter.BusinessVH holder, int position) {

        holder.tvBusinessName.setText(businessTypesItemList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return businessTypesItemList.size();
    }

    // Method to update adapter data
    public void setData(List<BusinessTypesItem> newData) {
        businessTypesItemList.clear();
        businessTypesItemList.addAll(newData);
        notifyDataSetChanged();
    }

    public class BusinessVH extends RecyclerView.ViewHolder {

        TextView tvBusinessName;
        TextView textViewBusinessName;
        public BusinessVH(@NonNull View itemView) {
            super(itemView);
            tvBusinessName=itemView.findViewById(R.id.tv_business_name);
        }

        public void bind(BusinessTypesItem businessItem) {
            textViewBusinessName.setText(businessItem.getName());
            // Bind other data as needed
        }

    }


}
