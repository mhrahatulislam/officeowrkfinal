package com.example.officeprojectjachi.View.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.officeprojectjachi.R;
import com.example.officeprojectjachi.Service.Model.BusinessTypesItem;
import com.example.officeprojectjachi.Service.Model.Responmodel;
import com.example.officeprojectjachi.Service.Model.ServiceTypesItem;
import com.example.officeprojectjachi.Service.Network.ApiService;
import com.example.officeprojectjachi.Service.Network.RetrofitClient;
import com.example.officeprojectjachi.View.Adapter.BusinessAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ApiService apiService;

    private BusinessAdapter businessAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rclMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(businessAdapter);


        // Initialize the adapter
        businessAdapter = new BusinessAdapter(MainActivity.this, new ArrayList<>());
        recyclerView.setAdapter(businessAdapter);

        faceData();
    }

    private void faceData() {
        apiService= RetrofitClient.getRetrofitInstance().create(ApiService.class);
        apiService.getApiServiceType().enqueue(new Callback<Responmodel>() {
            @Override
            public void onResponse(Call<Responmodel> call, retrofit2.Response<Responmodel> response) {

                if(response.isSuccessful()){

                    List<BusinessTypesItem> businessTypesItemList=response.body().getBusinessTypes();
                    // Update adapter data
                    businessAdapter.setData(businessTypesItemList);
                    // Notify adapter about data change
                    businessAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<Responmodel> call, Throwable t) {

            }
        });


    }


}