package com.example.stajxml.taksi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stajxml.vipTaksi.ModelVipTaksi;
import com.example.stajxml.R;
import com.example.stajxml.vipTaksi.VipTaksiAsoFragment;
import com.example.stajxml.vipTaksi.VipTaxiAdapter;

import java.util.ArrayList;

public class FragmentTaksi extends Fragment {
    RecyclerView horizontalList;
    RecyclerView gridList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.asosiy_xml,container,false);

        horizontalList = view.findViewById(R.id.im_rv_Vip);
        gridList = view.findViewById(R.id.rvM);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<ModelTaksi> listHorizontal=ModelTaksi.genTaksi();
        TaksiAdapter adapter=new TaksiAdapter(listHorizontal,getContext());
        horizontalList.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        horizontalList.setAdapter(adapter);

        ArrayList<ModelVipTaksi> listGrid=ModelVipTaksi.genTaksi();
        VipTaxiAdapter adapterVip=new VipTaxiAdapter(listGrid, getContext());
        gridList.setLayoutManager(new GridLayoutManager(getContext(), 2));
        gridList.setAdapter(adapterVip);
        TextView sveTaksi=view.findViewById(R.id.tvVsetak);
        sveTaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VipTaksiAsoFragment newFragment = new VipTaksiAsoFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.for_fragments, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}
