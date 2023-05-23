package com.example.restapiwithretrofit;


import android.app.MediaRouteButton;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.CustomViewHolder> {

    private Context context;
    private List<postPojo> dataList;


    public Adapter(Context context, List<postPojo> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.design, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        postPojo item = dataList.get(position);
        Glide.with(context).load(dataList.get(position).getImage()).into(holder.imageView);
        holder.Title.setText(dataList.get(position).getTitle());
        holder.description.setText(dataList.get(position).getDescription());
        holder.price.setText("Price: " + dataList.get(position).getPrice() + " $");
        holder.rating.setText("Rating: " + dataList.get(position).getRating().getRate());
        holder.quantity.setText("Quantity: " + dataList.get(position).getRating().getCount());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailsActivity.class);
                intent.putExtra("image", item.getImage());
                intent.putExtra("title", item.getTitle());
                intent.putExtra("description", item.getDescription());
                intent.putExtra("price", item.getPrice());
                intent.putExtra("rate", item.getRating().getRate());
                intent.putExtra("count", item.getRating().getCount());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView Title, description, rating, quantity, price;
        ImageView imageView;

        public CustomViewHolder(View itemView) {
            super(itemView);
            Title = itemView.findViewById(R.id.product_title);
            rating = itemView.findViewById(R.id.product_rating);
            description = itemView.findViewById(R.id.product_description);
            quantity = itemView.findViewById(R.id.product_quantity);
            price = itemView.findViewById(R.id.product_price);
            imageView = itemView.findViewById(R.id.product_image);
        }
    }
}
