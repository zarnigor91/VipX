package com.example.stajxml.vipTaksi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stajxml.R;

import java.util.ArrayList;

public class VipTaksiAsoFragment extends Fragment {
    RecyclerView rvtaksi;
    ImageView imSwap;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.vip_taksi_xml,container,false);
        rvtaksi=view.findViewById(R.id.rvVip);
        imSwap=view.findViewById(R.id.btSwap);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<ModelVipTaksi> listGrid=ModelVipTaksi.genTaksi();
        VipTaxiAdapter adapterVip=new VipTaxiAdapter(listGrid, getContext());
        rvtaksi.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rvtaksi.setAdapter(adapterVip);
        imSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog=new AlertDialog.Builder(view.getContext());


                View dialogView=LayoutInflater.from(view.getContext()).inflate(R.layout.dialog_xml,null,false);
                ImageView close=dialogView.findViewById(R.id.close);
                alertDialog.setView(dialogView);
                final AlertDialog dialog= alertDialog.create();
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();

//                FragmentTransaction ft = getFragmentManager().beginTransaction();
//                Fragment prev = getFragmentManager().findFragmentByTag("dialog");
//                if (prev != null) {
//                    ft.remove(prev);
//                }
//                ft.addToBackStack(null);
//                DialogFragment dialogFragment = new MyDialogFragment();
//                dialogFragment.show(ft, "dialog");
            }
        });
    }


}
