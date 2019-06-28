package com.example.stajxml.tarif;

import java.util.ArrayList;

public class TarifModel {
    private String tarif;
    private String place;
    private ArrayList<NarxModel> listNarx;

    public TarifModel(String tarif, String place, ArrayList<NarxModel> listNarx) {
        this.tarif = tarif;
        this.place = place;
        this.listNarx = listNarx;
    }

    public String getTarif() {
        return tarif;
    }

    public String getPlace() {
        return place;
    }

    public ArrayList<NarxModel> getListNarx() {
        return listNarx;
    }

    public static ArrayList<TarifModel> genTarif() {


        String[] tarif = new String[6];
        tarif[0] = " vip taksi";
        tarif[1] = " gorod vip";
        tarif[2] = " transfer";
        tarif[3] = " svadba";
        tarif[4] = " vstrecha";
        tarif[5] = " turi po";

        String[] place = new String[6];
        place[0] = "pochasovaya oplata";
        place[1] = "";
        place[2] = "Aeroport-otel, otel-aeroport";
        place[3] = "Gorod tashkent";
        place[4] = "Gorod tashkent";
        place[5] = "";

        ArrayList<ArrayList<NarxModel>> list2 = new ArrayList<>();

        ArrayList<NarxModel> list9 = new ArrayList<>();
        list9.add(new NarxModel("do 2-x chasov","200 000", "85 000 сум", "prodlenie(1 chas)", true));

        ArrayList<NarxModel> list8 = new ArrayList<>();
        list8.add(new NarxModel("dnem (c 9:00 do 19:00)","650 000", "85 000 сум", "prodlenie(1 chas)", true));
        list8.add(new NarxModel("nochyu (c 18:00 do 08:00)","200 000", "100 000 сум", "prodlenie(1 chas)", true));
        list8.add(new NarxModel("vip (c 8:00 do 23:00)","850 000", "100 000 сум", "prodlenie(1 chas)", true));

        ArrayList<NarxModel> list7 = new ArrayList<>();
        list7.add(new NarxModel("do 2-x chasov","650 000", "85 000 сум", "prodlenie(1 chas)", true));

        ArrayList<NarxModel> list6 = new ArrayList<>();
        list6.add(new NarxModel("do 4-x chasov","500 000", "100 000 сум", "prodlenie(1 chas)", true));

        ArrayList<NarxModel> list5 = new ArrayList<>();
        list5.add(new NarxModel("do 2-x chasov","150 000", "100 000 сум", "prodlenie(1 chas)", true));

        ArrayList<NarxModel> list4 = new ArrayList<>();
        list4.add(new NarxModel("Samarqand (1 den)","1 700 000", "", "", false));
        list4.add(new NarxModel("Samarqand-Buxoro(2 dnya)","3 000 000", "", "", false));
        list4.add(new NarxModel("Samarqand-Buxoro(3 dnya)","3 800 000", "", "", false));
        list4.add(new NarxModel("Fergana(1 dnya)","2 200 000", "", "", false));
        list4.add(new NarxModel("Namangan(1 dnya)","2 200 000", "", "", false));
        list4.add(new NarxModel("Qo'qand(1 dnya)","1 700 000", "", "", false));
        list4.add(new NarxModel("Andijon(1 dnya)","3 000 000", "", "", false));
        list4.add(new NarxModel("Poezdki v dolinu(2 dnya)","3 400 000", "", "", false));

        list2.add(list9);
        list2.add(list8);
        list2.add(list7);
        list2.add(list6);
        list2.add(list5);
        list2.add(list4);

        ArrayList<TarifModel> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(new TarifModel(tarif[i], place[i], list2.get(i)));
        }
        return list;
    }
}
