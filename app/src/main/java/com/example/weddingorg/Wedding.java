package com.example.weddingorg;

public class Wedding {
    private String nama_wedding;
    private int pic;

    public Wedding(String nama_wedding, int pic){
        this.nama_wedding = nama_wedding;
        this.pic = pic;
    }
    public String getWeddingName(){
        return nama_wedding;

    }

    public void setWeddingName(String nama_wedding){
        this.nama_wedding = nama_wedding;

    }
    public int getPic(){

        return pic;
    }
    public void setPic(int pic){

        this.pic = pic;
    }

}
