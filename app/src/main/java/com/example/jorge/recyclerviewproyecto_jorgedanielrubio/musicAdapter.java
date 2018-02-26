package com.example.jorge.recyclerviewproyecto_jorgedanielrubio;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jorge on 25/02/2018.
 */

public class musicAdapter extends RecyclerView.Adapter<musicAdapter.ProductViewHolder> {
    private Context mCtx;
    private List<music> musicList;


    public musicAdapter(Context mCtx, List<music> musicList) {
        this.mCtx = mCtx;
        this.musicList = musicList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_music, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        music alumnos = musicList.get(position);
        holder.rela.setBackgroundColor(alumnos.getColor());
        holder.textViewTitle.setText(alumnos.getTitle());
        holder.textViewTitle2.setText(alumnos.getTitle2());
        holder.textcompra.setText(String.valueOf(alumnos.getCompra()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(alumnos.getImage()));

    }


    @Override
    public int getItemCount() {
        return musicList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewTitle2, textcompra;
        ImageView imageView;
       RelativeLayout rela;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewTitle2 = itemView.findViewById(R.id.textViewTitle2);
            textcompra = itemView.findViewById(R.id.comprar);
            imageView = itemView.findViewById(R.id.imageView);
            rela = itemView.findViewById(R.id.relative);

        }
    }

}
