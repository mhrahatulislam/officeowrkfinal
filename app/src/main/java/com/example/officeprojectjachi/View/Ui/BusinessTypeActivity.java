package com.example.officeprojectjachi.View.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.officeprojectjachi.R;
import com.example.officeprojectjachi.Service.Model.BusinessTypesItem;
import com.example.officeprojectjachi.View.Adapter.BusinessAdapter;
import com.example.officeprojectjachi.View.Adapter.NewAdapter;

public class BusinessTypeActivity extends AppCompatActivity implements BusinessAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_type);
    }

    @Override
    public void onItemClick(BusinessTypesItem item) {

        // Create a new RecyclerView with a new adapter and dataset
        RecyclerView recyclerView = findViewById(R.id.newRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // Create and set adapter for the new RecyclerView
        NewAdapter newAdapter = new NewAdapter(this, getNewDataset(item));
        recyclerView.setAdapter(newAdapter);

    }
}