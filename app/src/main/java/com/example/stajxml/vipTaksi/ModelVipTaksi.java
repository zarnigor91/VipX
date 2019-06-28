package com.example.stajxml.vipTaksi;

import com.example.stajxml.R;

import java.util.ArrayList;

public class ModelVipTaksi {

    private int carImage;
    private String status;
    private String price;
    private String name;
    private String time;

    public ModelVipTaksi(int carImage, String status, String price, String name, String time) {
        this.carImage = carImage;
        this.status = status;
        this.price = price;
        this.name = name;
        this.time = time;
    }

    public int getCarImage() {
        return carImage;
    }

    public String getStatus() {
        return status;
    }

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public static ArrayList<ModelVipTaksi> genTaksi() {
        int[] image = new int[5];
        image[0] = R.drawable.car_image;
        image[1] = R.drawable.car_image2;
        image[2] = R.drawable.car_image;
        image[3] = R.drawable.car_image2;
        image[4] = R.drawable.car_image;

        String[] status = new String[5];
        status[0] = "свободен";
        status[1] = "занят";
        status[2] = "занят";
        status[3] = "свободен";
        status[4] = "занят";

        String[] name = new String[5];
        name[0] = "Tiago";
        name[1] = "Audi";
        name[2] = "Tiago";
        name[3] = "Audi";
        name[4] = "Tiago";

        String[] price = new String[5];
        price[0] = "200000 сум";
        price[1] = "200000 сум";
        price[2] = "200000 сум";
        price[3] = "200000 сум";
        price[4] = "200000 сум";

        String[] time = new String[5];
        time[0] = "Минимум часов-2";
        time[1] = "Минимум часов-2";
        time[2] = "Минимум часов-2";
        time[3] = "Минимум часов-2";
        time[4] = "Минимум часов-2";


        ArrayList<ModelVipTaksi> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ModelVipTaksi(image[i], status[i], price[i], name[i], time[i]));
        }
        return list;
    }
}
