package com.example.restapiwithretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {
    TextView Title , description, rating, quantity ,price  ;
    ImageView imageView;


    private String itemTitle;
    private String itemDescription;
    private String itemPrice;
    private String itemrating;
    private String itemcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Get the item data from the intent
        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra("image");
        itemTitle = intent.getStringExtra("title");
        itemDescription = intent.getStringExtra("description");
        itemPrice = intent.getStringExtra("price");
        itemcount = intent.getStringExtra("count");
        itemrating = intent.getStringExtra("rate");

        Title = findViewById(R.id.product_title);
        rating = findViewById(R.id.product_rating);
        description = findViewById(R.id.product_description);
        quantity = findViewById(R.id.product_quantity);
        price = findViewById(R.id.product_price);
        imageView = findViewById(R.id.product_image);

        Glide.with(this).load(imageUrl).into(imageView);
        Title.setText(itemTitle);
        description.setText(itemDescription);
        price.setText("Price: "+itemPrice+"$");
        quantity.setText("Quantity: "+itemcount);
        rating.setText("Rating: "+itemrating);
    }
}