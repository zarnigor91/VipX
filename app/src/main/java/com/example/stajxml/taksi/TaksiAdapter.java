package com.example.stajxml.taksi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stajxml.R;

import java.util.ArrayList;

public class TaksiAdapter extends RecyclerView.Adapter<TaksiAdapter.VH> {
   private ArrayList<ModelTaksi> list;
   private LayoutInflater inflater;

    public TaksiAdapter(ArrayList<ModelTaksi> list, Context context) {
        this.list = list;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_rv_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        ModelTaksi modelTaksi=list.get(position);
        holder.bind(modelTaksi);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class VH extends RecyclerView.ViewHolder{

ImageView imag;
TextView textTaksi;
        public VH(@NonNull View itemView) {
            super(itemView);
             imag=itemView.findViewById(R.id.imtak);
             textTaksi=itemView.findViewById(R.id.taksitv);

        }

        public void bind(ModelTaksi modelTaksi) {
            imag.setImageResource(modelTaksi.getImage());
            textTaksi.setText(modelTaksi.getText());
        }
    }
}
