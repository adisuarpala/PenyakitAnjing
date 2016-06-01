package com.example.adityaputra.newpenyakitanjing;

/**
 * Created by Aditya Putra on 5/16/2016.
 */
public class Penyakit {
    private String namapenyakit;
    private String deskripsipenyakit;

    public Penyakit(String namapenyakit, String deskripsipenyakit){
        setNamapenyakit(namapenyakit);
        setDeskripsipenyakit(deskripsipenyakit);
    }

    public void setNamapenyakit(String namapenyakit){
        this.namapenyakit=namapenyakit;
    }

    public void setDeskripsipenyakit(String deskripsipenyakit){
        this.deskripsipenyakit=deskripsipenyakit;
    }

    public String getNamapenyakit(){
        return namapenyakit;
    }

    public String getDeskripsipenyakit(){
        return deskripsipenyakit;
    }
}
