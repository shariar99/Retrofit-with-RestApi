package com.example.restapiwithretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        holder.title.setText(dataList.get(position).getTitle());
        holder.posts.setText(dataList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView title , posts;
        public CustomViewHolder( View itemView) {

            super(itemView);
            title = itemView.findViewById(R.id.title);
            posts = itemView.findViewById(R.id.dis);
        }
    }
}
