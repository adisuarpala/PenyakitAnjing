package com.example.adityaputra.newpenyakitanjing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DiagnosaActivity extends AppCompatActivity {

    int id;
    double persentase;
    TextView nama;
    TextView textgambar;
    ImageView imageView;
    TextView txtdesc;
    TextView deskripsi;
    Penyakit p[]=new Penyakit[17];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        setpenyakit();
        find();
        Intent i = getIntent();
        id = Integer.parseInt (i.getStringExtra("id").toString());
        persentase = Double.parseDouble (i.getStringExtra("persentase"));
        switch (id) {
            case 1:
                nama.setText(String.valueOf(persentase) + "% " + p[1].getNamapenyakit());
                imageView.setImageResource(R.drawable.p1_300pxw);
                deskripsi.setText(p[1].getDeskripsipenyakit());
                break;
            case 2:
                nama.setText(String.valueOf(persentase) + "% " + p[2].getNamapenyakit());
                imageView.setImageResource(R.drawable.p2_350px);
                deskripsi.setText(p[2].getDeskripsipenyakit());
                break;
            case 3:
                nama.setText(String.valueOf(persentase) + "% " + p[3].getNamapenyakit());
                imageView.setImageResource(R.drawable.p3);
                deskripsi.setText(p[3].getDeskripsipenyakit());
                break;
            case 4:
                nama.setText(String.valueOf(persentase) + "% " + p[4].getNamapenyakit());
                imageView.setImageResource(R.drawable.p4_300px);
                deskripsi.setText(p[4].getDeskripsipenyakit());
                break;
            case 5:
                nama.setText(String.valueOf(persentase) + "% " + p[5].getNamapenyakit());
                imageView.setImageResource(R.drawable.p5);
                deskripsi.setText(p[5].getDeskripsipenyakit());
                break;
            case 6:
                nama.setText(String.valueOf(persentase) + "% " + p[6].getNamapenyakit());
                imageView.setImageResource(R.drawable.p6);
                deskripsi.setText(p[6].getDeskripsipenyakit());
                break;
            case 7:
                nama.setText(String.valueOf(persentase) + "% " + p[7].getNamapenyakit());
                imageView.setImageResource(R.drawable.p7_350px);
                deskripsi.setText(p[7].getDeskripsipenyakit());
                break;
            case 8:
                nama.setText(String.valueOf(persentase) + "% " + p[8].getNamapenyakit());
                imageView.setImageResource(R.drawable.p8_350px);
                deskripsi.setText(p[8].getDeskripsipenyakit());
                break;
            case 9:
                nama.setText(String.valueOf(persentase) + "% " + p[9].getNamapenyakit());
                imageView.setImageResource(R.drawable.p9_350px);
                deskripsi.setText(p[9].getDeskripsipenyakit());
                break;
            case 10:
                nama.setText(String.valueOf(persentase) + "% " + p[10].getNamapenyakit());
                imageView.setImageResource(R.drawable.rabies);
                deskripsi.setText(p[10].getDeskripsipenyakit());
                break;
            case 11:
                nama.setText(String.valueOf(persentase) + "% " + p[11].getNamapenyakit());
                imageView.setImageResource(R.drawable.retensi_urine);
                deskripsi.setText(p[11].getDeskripsipenyakit());
                break;
            case 12:
                nama.setText(String.valueOf(persentase) + "% " + p[12].getNamapenyakit());
                imageView.setImageResource(R.drawable.gastric);
                deskripsi.setText(p[12].getDeskripsipenyakit());
                break;
            case 13:
                nama.setText(String.valueOf(persentase) + "% " + p[13].getNamapenyakit());
                imageView.setImageResource(R.drawable.pyometra);
                deskripsi.setText(p[13].getDeskripsipenyakit());
                break;
            case 14:
                nama.setText(String.valueOf(persentase) + "% " + p[14].getNamapenyakit());
                imageView.setImageResource(R.drawable.epitaxis);
                deskripsi.setText(p[14].getDeskripsipenyakit());
                break;
            case 15:
                nama.setText(String.valueOf(persentase) + "% " + p[15].getNamapenyakit());
                imageView.setImageResource(R.drawable.ear);
                deskripsi.setText(p[15].getDeskripsipenyakit());
                break;
            case 16:
                nama.setText(String.valueOf(persentase) + "% " + p[16].getNamapenyakit());
                imageView.setImageResource(R.drawable.diabetes);
                deskripsi.setText(p[16].getDeskripsipenyakit());
                break;
        }
    }

    public void find(){
        nama = (TextView) findViewById(R.id.persen);
        imageView = (ImageView) findViewById(R.id.imageView1);
        deskripsi = (TextView) findViewById(R.id.deskripsi);
    }

    public void setpenyakit(){
        p[1] = new Penyakit("Addisonian Crisis",getResources().getString(R.string.p1));
        p[2] = new Penyakit("Distemper",getResources().getString(R.string.p2));
        p[3] = new Penyakit("Leptospirosis",getResources().getString(R.string.p3));
        p[4] = new Penyakit("Parvo Virus",getResources().getString(R.string.p4));
        p[5] = new Penyakit("Demodectic Mange",getResources().getString(R.string.p5));
        p[6] = new Penyakit("Dermatitis",getResources().getString(R.string.p6));
        p[7] = new Penyakit("Scabies",getResources().getString(R.string.p7));
        p[8] = new Penyakit("Ring Worm",getResources().getString(R.string.p8));
        p[9] = new Penyakit("Eclampsia",getResources().getString(R.string.p9));
        p[10] = new Penyakit("Rabies",getResources().getString(R.string.p10));
        p[11] = new Penyakit("Retensi Urine",getResources().getString(R.string.p11));
        p[12] = new Penyakit("Gastric Dilatation",getResources().getString(R.string.p12));
        p[13] = new Penyakit("Pyometra",getResources().getString(R.string.p13));
        p[14] = new Penyakit("Epistaxis",getResources().getString(R.string.p14));
        p[15] = new Penyakit("Ear Mite",getResources().getString(R.string.p15));
        p[16] = new Penyakit("Diabetes Mellitus",getResources().getString(R.string.p16));
    }

    public void startabout(View view){
        Intent i = new Intent(this, About.class);
        finish();
        startActivity(i);
    }


}
