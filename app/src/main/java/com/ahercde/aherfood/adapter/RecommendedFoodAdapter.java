package com.ahercde.aherfood.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahercde.aherfood.R;
import com.ahercde.aherfood.model.RecommendedFood;

import java.util.List;

public class RecommendedFoodAdapter extends RecyclerView.Adapter<RecommendedFoodAdapter.RecommendedFoodViewHolder> {

    Context context;
    List<RecommendedFood> recommendedFoodList;

    public RecommendedFoodAdapter(Context context, List<RecommendedFood> recommendedFoodList) {
        this.context = context;
        this.recommendedFoodList = recommendedFoodList;
    }

    @NonNull
    @Override
    public RecommendedFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recommended_food_row, parent, false);

        return new RecommendedFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(recommendedFoodList.get(position).getImageUrl());
        holder.restaurantname.setText(recommendedFoodList.get(position).getRestaurantname());

        holder.name.setText(recommendedFoodList.get(position).getName());
        holder.rating.setText(recommendedFoodList.get(position).getRating());
        holder.price.setText(recommendedFoodList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return recommendedFoodList.size();
    }

    public static final class RecommendedFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView name, price, rating, restaurantname;


        public RecommendedFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage= itemView.findViewById(R.id.food_image);
            restaurantname= itemView.findViewById(R.id.restaurantname);
            name= itemView.findViewById(R.id.food_name);
            rating= itemView.findViewById(R.id.rating);
            price= itemView.findViewById(R.id.food_price);

        }
    }

}
