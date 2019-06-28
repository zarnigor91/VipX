package com.example.stajxml.tarif;

import java.util.ArrayList;

public class OplataModel {
    private String adress;
    private String narx;

    public OplataModel(String adress, String narx) {
        this.adress = adress;
        this.narx = narx;
    }

    public String getAdress() {
        return adress;
    }

    public String getNarx() {
        return narx;
    }
    public  static ArrayList<OplataModel> genOplata(){
        String [] adress=new String[9];
       adress[0]= "Samarqand (1 den)";
       adress[1]="Samarqand-Buxoro(2 den)";
       adress[2]="Samarqand-Buxoro(3 den)";
       adress[3]="Samarqand-Buxoro-Xiva(5 den)";
       adress[4]="Fargona(1 den)";
       adress[5]="Namangan(1 den)";
       adress[6]="Qoqon(1 den)";
       adress[7]="Andijon(1 den)";
       adress[8]="Poezdku po dolinu(2 den)";

       String [] narx=new String[9];
       narx[0]="ot 1700000 sum";
        narx[1]="ot 2000000 sum";
        narx[2]="ot 1800000 sum";
        narx[3]="ot 1900000 sum";
        narx[4]="ot 2100000 sum";
        narx[5]="ot 2200000 sum";
        narx[6]="ot 2300000 sum";
        narx[7]="ot 2400000 sum";
        narx[8]="ot 2500000 sum";
       ArrayList<OplataModel> list=new ArrayList<>();
        for (int i = 0; i <9 ; i++) {
            list.add(new OplataModel(adress[i],narx[i]));
        }
        return list;
    }
}
