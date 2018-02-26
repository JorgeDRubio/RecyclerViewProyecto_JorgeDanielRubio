package com.example.jorge.recyclerviewproyecto_jorgedanielrubio;

/**
 * Created by Jorge on 25/02/2018.
 */

public class music {

    private int id;
    private String title;
    private String title2;
    private String compra;
    private int image,color;

    public music(int id, String title, String title2, String compra, int image,int color) {
        this.id = id;
        this.title = title;
        this.title2 = title2;
        this.compra = compra;
        this.image = image;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle2() {
        return title2;
    }
    public String getCompra(){
        return compra;
    }


    public int getImage() {
        return image;
    }

    public int getColor(){
        return color;
    }
}
