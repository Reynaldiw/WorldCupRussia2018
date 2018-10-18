package com.reynaldiwijaya.worldcuprussia2018;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    String[] namaNegara;
    int [] lambangNegara;

    public Adapter(Context context, String[] namaNegara, int[] lambangNegara) {
        this.context = context;
        this.namaNegara = namaNegara;
        this.lambangNegara = lambangNegara;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_worldcup, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {
            viewHolder.txtListTitle.setText(namaNegara[i]);
        Glide.with(context).load(lambangNegara[i]).into(viewHolder.imgList);

    }

    @Override
    public int getItemCount() {
        return lambangNegara.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgList;
        TextView txtListTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgList = itemView.findViewById(R.id.imgList);
            txtListTitle = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
