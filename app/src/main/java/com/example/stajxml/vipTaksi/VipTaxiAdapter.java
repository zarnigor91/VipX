package com.example.stajxml.vipTaksi;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stajxml.R;

import java.util.ArrayList;

public class VipTaxiAdapter extends RecyclerView.Adapter<VipTaxiAdapter.VH> {
    private ArrayList<ModelVipTaksi> list;
    private LayoutInflater inflater;

    public VipTaxiAdapter(ArrayList<ModelVipTaksi> list, Context context) {
        this.list = list;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vip_taxi,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        ModelVipTaksi modelTaksi=list.get(position);
        holder.bind(modelTaksi);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class VH extends RecyclerView.ViewHolder{

        ImageView carImage;
        TextView status;
        TextView price;
        TextView name;
        TextView time;

        public VH(@NonNull View itemView) {
            super(itemView);
            carImage=itemView.findViewById(R.id.car_image);
            name=itemView.findViewById(R.id.car_name);
            price=itemView.findViewById(R.id.car_price);
            status=itemView.findViewById(R.id.car_status);
            time=itemView.findViewById(R.id.car_time);

        }

        public void bind(ModelVipTaksi modelTaksi) {
            Log.d("TTT", "data: "+modelTaksi.getCarImage()+" -> "+modelTaksi.getStatus()+" -> "+modelTaksi.getName()+" -> "+modelTaksi.getPrice()+" -> "+modelTaksi.getTime());
            carImage.setImageResource(modelTaksi.getCarImage());
            status.setText(modelTaksi.getStatus());
            name.setText(modelTaksi.getName());
            price.setText(modelTaksi.getPrice());
            time.setText(modelTaksi.getTime());
        }
    }
}
