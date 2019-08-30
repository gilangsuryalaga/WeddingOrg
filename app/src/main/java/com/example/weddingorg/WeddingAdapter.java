package com.example.weddingorg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WeddingAdapter extends RecyclerView.Adapter<WeddingAdapter.ViewHolder> {
    private List<Wedding> weddingList;


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private List<Wedding> weddingList;

        public TextView WeddingName,Deskripsi;
        public ImageView Album;

        public ViewHolder(View v) {
            super(v);
            this.weddingList = weddingList;
            WeddingName = (TextView)v.findViewById(R.id.wedding_name);
            Album = (ImageView)v.findViewById(R.id.album);

        }
    }
    public WeddingAdapter(List<Wedding> weddingList){

        this.weddingList= weddingList;

    }
    public WeddingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_wedding_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(WeddingAdapter.ViewHolder holder, int position) {
        Wedding wedding = weddingList.get(position);
        holder.WeddingName.setText(String.valueOf(wedding.getWeddingName()));
        holder.Album.setImageResource(wedding.getPic());
    }

    @Override
    public int getItemCount() {
        return weddingList.size();
    }
}