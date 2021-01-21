package com.ahercde.aherfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.ahercde.aherfood.adapter.PopularFoodAdapter;
import com.ahercde.aherfood.adapter.RecommendedFoodAdapter;
import com.ahercde.aherfood.model.PopularFood;
import com.ahercde.aherfood.model.RecommendedFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    RecyclerView popularRecycler, recommendedRecycler;
    PopularFoodAdapter popularFoodAdapter;
    RecommendedFoodAdapter recommendedFoodAdapter;
    private Button btnOrder;
    
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);



        setContentView(R.layout.food_menu);

        btnOrder = findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Order();
            }
        });

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Moist Cake Roll","$15.00", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Con Flake","$10.00", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Spring Roll","$7.00", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Moist Cake Roll","$15.00", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Con Flake","$10.00", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Spring Roll","$7.00", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);

        List<RecommendedFood> recommendedFoodList = new ArrayList<>();

        recommendedFoodList.add(new RecommendedFood("Burger","Ghc 20.00","2.0","Papaye", R.drawable.burger));
        recommendedFoodList.add(new RecommendedFood("Rice","Ghc 13.00","1.4","KFC", R.drawable.popularfood3));
        recommendedFoodList.add(new RecommendedFood("Pizza","Ghc 42.00","3.8","Eddys Pizza", R.drawable.popularfood2));
        recommendedFoodList.add(new RecommendedFood("Jollof","Ghc 11.00","0.6","Papaye", R.drawable.popularfood1));
        recommendedFoodList.add(new RecommendedFood("Burger","Ghc 15.00","2.3","KFC", R.drawable.food_5366));
        recommendedFoodList.add(new RecommendedFood("Pizza","Ghc 61.00","1.6","Pizza Inn", R.drawable.popularfood3));

        setRecommendedRecycler(recommendedFoodList);
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList){
        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this, RecyclerView.HORIZONTAL,  false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }
    private void setRecommendedRecycler(List<RecommendedFood> recommendedFoodList){
        recommendedRecycler = findViewById(R.id.recommended_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this, RecyclerView.VERTICAL,  false);
        recommendedRecycler.setLayoutManager(layoutManager);
        recommendedFoodAdapter = new RecommendedFoodAdapter(this, recommendedFoodList);
        recommendedRecycler.setAdapter(recommendedFoodAdapter);
    }
    public void Order() {
        Intent int1 = new Intent(MainActivity.this,BuyActivity.class);
        startActivity(int1);
    }

}