package com.example.adapters;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.models.FoodModel;
import com.example.myrecipeapp.R;
import com.example.myrecipeapp.RecipeDetail;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder>{

    private Context fContext;
    private List<FoodModel> foodModelList;


    public FoodAdapter(Context fContext, List<FoodModel> foodModelList) {
        this.fContext = fContext;
        this.foodModelList = foodModelList;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_item, parent, false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final FoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(foodModelList.get(position).getItemImage());
        holder.fTitle.setText(foodModelList.get(position).getItemName());
        holder.fDescription.setText(foodModelList.get(position).getItemDescription());
        holder.fPrice.setText(foodModelList.get(position).getItemPrice());

        holder.fCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fContext, RecipeDetail.class);
                intent.putExtra("IMAGE", foodModelList.get(holder.getAdapterPosition()).getItemImage());
                intent.putExtra("RECIPE_COOKINGTIME", foodModelList.get(holder.getAdapterPosition()).getItemCookingTime());
                intent.putExtra("RECIPE_INGREDIENTS", foodModelList.get(holder.getAdapterPosition()).getItemIngredients());
                intent.putExtra("RECIPE_DESCRIPTION", foodModelList.get(holder.getAdapterPosition()).getItemDescription());
                intent.putExtra("RECIPE_NUTRITION", foodModelList.get(holder.getAdapterPosition()).getItemNutrition());
                fContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodModelList.size();
    }
}

class FoodViewHolder extends RecyclerView.ViewHolder{

    ImageView foodImage;
    TextView fTitle, fDescription, fPrice;
    CardView fCardView;

    public FoodViewHolder(View itemView) {
        super(itemView);

        foodImage = itemView.findViewById(R.id.ivImage);
        fTitle = itemView.findViewById(R.id.tvTitle);
        fDescription = itemView.findViewById(R.id.tvDescription);
        fPrice = itemView.findViewById(R.id.tvPrice);

        fCardView = itemView.findViewById(R.id.myCardView);
    }
}
