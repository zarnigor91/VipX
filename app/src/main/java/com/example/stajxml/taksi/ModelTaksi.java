package com.example.stajxml.taksi;

import com.example.stajxml.R;

import java.util.ArrayList;

public class ModelTaksi {
    private String text;
    private int image;

    public ModelTaksi(String text, int image) {
        this.text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public static ArrayList<ModelTaksi> genTaksi() {
        int[] taksi = new int[5];
        taksi[0] = R.drawable.c01;
        taksi[1] = R.drawable.c02;
        taksi[2] = R.drawable.c03;
        taksi[3] = R.drawable.c04;
        taksi[4] = R.drawable.c05;
        String[] tekst = new String[5];
        tekst[0] = "Vip taksi";
        tekst[1] = "Vnedorojniki";
        tekst[2] = "Vip avto";
        tekst[3] = "Puteshestviy na mashine";
        tekst[4] = "Avto na svadbu";
        ArrayList<ModelTaksi> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ModelTaksi(tekst[i], taksi[i]));
        }
        return list;
    }
}
