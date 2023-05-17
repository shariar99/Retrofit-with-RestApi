package com.example.restapiwithretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.CustomViewHolder> {
    private List<postPojo> dataList;
    private Context context;
    public Adapter(Context context , List<postPojo> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View  view = layoutInflater.inflate(R.layout.design,parent,false);
        return  new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Glide.with(context).load(dataList.get(position).getPoster()).into(holder.imageView);
        holder.Title.setText(dataList.get(position).getTitle());
        holder.Runtime.setText(dataList.get(position).getRuntime());


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView Title , Runtime;
        ImageView imageView;
        public CustomViewHolder( View itemView) {

            super(itemView);
            Title = itemView.findViewById(R.id.title);
            Runtime = itemView.findViewById(R.id.dis);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
