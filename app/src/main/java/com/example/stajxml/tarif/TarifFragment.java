package com.example.stajxml.tarif;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stajxml.R;

import java.util.ArrayList;

public class TarifFragment extends Fragment {
    private RecyclerView rvTarif, recyclerView;
    private int[] imag = new int[]{R.drawable.car_image, R.drawable.car_image2, R.drawable.car_image, R.drawable.car_image2};
    private ArrayList<Integer> carList;
    private PradoAdapter pradoAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvTarif = view.findViewById(R.id.tarif_list);

        ArrayList<TarifModel> tarifModels = TarifModel.genTarif();

        TarifAdapter adapter = new TarifAdapter(tarifModels, getContext());
        rvTarif.setLayoutManager(new LinearLayoutManager(getContext()));
        rvTarif.setAdapter(adapter);


        recyclerView = view.findViewById(R.id.rv_arenda);
        carList = car();
        pradoAdapter = new PradoAdapter(carList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(pradoAdapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.prado_xml, container, false);

        return view;
    }

    private ArrayList<Integer> car() {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(imag[i]);
        }
        return list;
    }
}
