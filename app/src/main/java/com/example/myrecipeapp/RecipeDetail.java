package com.example.myrecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeDetail extends AppCompatActivity {

    TextView foodDetail;
    TextView foodIngredients;
    TextView foodCookingTime;
    TextView foodNutrition;
    ImageView foodImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipe_detail);

        initViews();

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            foodCookingTime.setText(bundle.getInt("RECIPE_COOKINGTIME"));
            foodIngredients.setText(bundle.getInt("RECIPE_INGREDIENTS"));
            foodNutrition.setText(bundle.getInt("RECIPE_NUTRITION"));
            foodDetail.setText(bundle.getInt("RECIPE_DESCRIPTION"));
            foodImage.setImageResource(bundle.getInt("IMAGE"));

        }
    }

    private void initViews() {
        foodDetail = findViewById(R.id.textDetail);
        foodIngredients = findViewById(R.id.textIngredients);
        foodCookingTime = findViewById(R.id.textCookingTime);
        foodNutrition = findViewById(R.id.textNutrition);
        foodImage = findViewById(R.id.imgFood);
    }
}
