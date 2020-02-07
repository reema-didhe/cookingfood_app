package com.example.myrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.adapters.FoodAdapter;
import com.example.models.FoodModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView fRecyclerView;
    List<FoodModel> foodModelList;
    FoodModel foodModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        fRecyclerView = findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        fRecyclerView.setLayoutManager(gridLayoutManager);

        foodModelList = new ArrayList<>();

        /*foodModels = new FoodModel("veg Wrap", "Spread 2 tablespoons spreadable cheese over each tortilla. Top with tomatoes, spinach, red pepper, bacon and pepper. Roll up tightly. Nutrition Facts 1 wrap: 294 calories, 9g fat (4g saturated fat), 16mg cholesterol, 584mg sodium, 36g carbohydrate (3g sugars, 7g fiber), 11g protein. Diabetic Exchanges: 2-1/2 starch, 2 fat, 1 vegetable.", "$20", R.drawable.food1);
        foodModelList.add(foodModels);*/
        foodModels = new FoodModel("veg Wrap", R.string.veg_wrap_recipe, "$20", R.string.veg_wrap_ingrediens,
                R.string.veg_wrap_cookingtime, R.string.veg_wrap_nutrutionfacts, R.drawable.food1);
        foodModelList.add(foodModels);

        foodModels = new FoodModel("Pani Puri", R.string.panipuri_recipe, "$15", R.string.panipuri_ingredients,
                R.string.panipuri_cookingtime, R.string.panipri_nutritionfacts, R.drawable.food3);
        foodModelList.add(foodModels);

        foodModels = new FoodModel("Veg Hakka Noodles", R.string.hakka_noodles_recipe, "$25", R.string.hakkanoodles_ingredients,
                R.string.hakka_noodles_cookingtime, R.string.hakka_noodles_nutrition, R.drawable.food5);
        foodModelList.add(foodModels);

        foodModels = new FoodModel("Corn Salad", R.string.corn_salad_recipe, "$12", R.string.corn_salad_ingredients,
                R.string.corn_salad_cookingtime, R.string.corn_salad_nutrition, R.drawable.food6);
        foodModelList.add(foodModels);

        foodModels = new FoodModel("Basil Mozzarella Pizza", R.string.pizza_recipe, "$12", R.string.pizza_ingredients,
                R.string.pizza_cookingtime, R.string.pizza_nutrition, R.drawable.food2);
        foodModelList.add(foodModels);

        foodModels = new FoodModel("Cheese Slider", R.string.pizza_recipe, "$12", R.string.pizza_ingredients,
                R.string.pizza_cookingtime, R.string.pizza_nutrition, R.drawable.food4);
        foodModelList.add(foodModels);

        FoodAdapter foodAdapter = new FoodAdapter(MainActivity.this, foodModelList);
        fRecyclerView.setAdapter(foodAdapter);
    }
}
