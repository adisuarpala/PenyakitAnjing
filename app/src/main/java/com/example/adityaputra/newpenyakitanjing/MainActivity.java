package com.example.adityaputra.newpenyakitanjing;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected static final Context SplashApp = null;
    public static String EXTRA_MESSAGE;
    //private CheckBox cboxA1, cboxA2, cboxA3, cboxA4, cboxA5, cboxB1, cboxB2, cboxB3, cboxB4, cboxB5, cboxB6, cboxB7, cboxB8,
     //       cboxD1, cboxD2, cboxD3, cboxD5, cboxD6, cboxD7, cboxD8, cboxD9, cboxD11, cboxD12;
    private CheckBox checkBox[]= new CheckBox[38];
    double p[]= new double[17];
    double x[] = new double[17];
    int id;
    double     A,  B,  C,  D,  E,  F,  G,  H,  I;
    double persen, persenmax;
    double pn[]= new double[17];
    double pn2[]= new double[17];

    int counter;


    Button diagnos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        finview();
        //addListenerOnStart();
        diagnos = (Button)findViewById(R.id.btnProsesNext1);
        diagnos.setEnabled(true);
    }

    public void finview(){
        checkBox[1]= (CheckBox) findViewById(R.id.c1);
        checkBox[2]= (CheckBox) findViewById(R.id.c2);
        checkBox[3]= (CheckBox) findViewById(R.id.c3);
        checkBox[4]= (CheckBox) findViewById(R.id.c4);
        checkBox[5]= (CheckBox) findViewById(R.id.c5);
        checkBox[6]= (CheckBox) findViewById(R.id.c6);
        checkBox[7]= (CheckBox) findViewById(R.id.c7);
        checkBox[8]= (CheckBox) findViewById(R.id.c8);
        checkBox[9]= (CheckBox) findViewById(R.id.c9);
        checkBox[10]= (CheckBox) findViewById(R.id.c10);
        checkBox[11]= (CheckBox) findViewById(R.id.c11);
        checkBox[12]= (CheckBox) findViewById(R.id.c12);
        checkBox[13]= (CheckBox) findViewById(R.id.c13);
        checkBox[14]= (CheckBox) findViewById(R.id.c14);
        checkBox[15]= (CheckBox) findViewById(R.id.c15);
        checkBox[16]= (CheckBox) findViewById(R.id.c16);
        checkBox[17]= (CheckBox) findViewById(R.id.c17);
        checkBox[18]= (CheckBox) findViewById(R.id.c18);
        checkBox[19]= (CheckBox) findViewById(R.id.c19);
        checkBox[20]= (CheckBox) findViewById(R.id.c20);
        checkBox[21]= (CheckBox) findViewById(R.id.c21);
        checkBox[22]= (CheckBox) findViewById(R.id.c22);
        checkBox[23]= (CheckBox) findViewById(R.id.c23);
        checkBox[24]= (CheckBox) findViewById(R.id.c24);
        checkBox[25]= (CheckBox) findViewById(R.id.c25);
        checkBox[26]= (CheckBox) findViewById(R.id.c26);
        checkBox[27]= (CheckBox) findViewById(R.id.c27);
        checkBox[28]= (CheckBox) findViewById(R.id.c28);
        checkBox[29]= (CheckBox) findViewById(R.id.c29);
        checkBox[30]= (CheckBox) findViewById(R.id.c30);
        checkBox[31]= (CheckBox) findViewById(R.id.c31);
        checkBox[32]= (CheckBox) findViewById(R.id.c32);
        checkBox[33]= (CheckBox) findViewById(R.id.c33);
        checkBox[34]= (CheckBox) findViewById(R.id.c34);
        checkBox[35]= (CheckBox) findViewById(R.id.c35);
        checkBox[36]= (CheckBox) findViewById(R.id.c36);
        checkBox[37]= (CheckBox) findViewById(R.id.c37);


    }

    public void chkhandler(View view){
        switch (view.getId()){
            case R.id.c1:
                if(checkBox[1].isChecked()){
                    p[1]++;
                    p[2]++;
                    p[3]++;
                    p[4]++;
                }else {
                    p[1]=p[1]-1;
                    p[2]=p[2]-1;
                    p[3]=p[3]-1;
                    p[4]=p[4]-1;
                }
                break;
            case R.id.c2:
                if (checkBox[2].isChecked()){
                    p[1]++;
                    p[2]++;
                    p[3]++;
                    p[4]++;
                }else {
                    p[1]--;
                    p[2]--;
                    p[3]--;
                    p[4]--;
                }
                break;
            case R.id.c3:
                if (checkBox[3].isChecked()){
                    p[1]++;
                    p[2]++;
                    p[3]++;
                    p[4]++;
                    p[13]++;
                }else {
                    p[1]--;
                    p[2]--;
                    p[3]--;
                    p[4]--;
                    p[13]--;
                }
                break;
            case R.id.c4:
                if (checkBox[4].isChecked()){
                    p[1]++;
                }else {
                    p[1]--;
                }
                break;
            case R.id.c5:
                if(checkBox[5].isChecked()){
                    p[1]++;
                }else {
                    p[1]--;
                }
                break;
            case R.id.c6:
                if(checkBox[6].isChecked()){
                    p[1]++;
                }else {
                    p[1]--;
                }
                break;
            case R.id.c7:
                if(checkBox[7].isChecked()){
                    p[2]++;
                    p[3]++;
                    p[4]++;
                    p[9]++;
                }else {
                    p[2]--;
                    p[3]--;
                    p[4]--;
                    p[9]--;
                }
                break;
            case R.id.c8:
                if(checkBox[8].isChecked()){
                    p[2]++;
                }else {
                    p[2]--;
                }
                break;
            case R.id.c9:
                if(checkBox[9].isChecked()){
                    p[2]++;
                }else {
                    p[2]--;
                }
                break;
            case R.id.c10:
                if(checkBox[10].isChecked()){
                    p[2]++;
                }else {
                    p[2]--;
                }
                break;
            case R.id.c11:
                if(checkBox[11].isChecked()){
                    p[5]++;
                }else {
                    p[5]--;
                }
                break;
            case R.id.c12:
                if(checkBox[12].isChecked()){
                    p[3]++;
                    p[9]++;
                }else {
                    p[3]--;
                    p[9]--;
                }
                break;
            case R.id.c13:
                if(checkBox[13].isChecked()){
                    p[4]++;
                    p[5]++;
                    p[10]++;
                    p[13]++;
                    p[14]++;
                }else {
                    p[4]--;
                    p[5]--;
                    p[10]--;
                    p[13]--;
                    p[14]--;
                }
                break;
            case R.id.c14:
                if(checkBox[14].isChecked()){
                    p[4]++;
                }else {
                    p[4]--;
                }
                break;
            case R.id.c15:
                if(checkBox[15].isChecked()){
                    p[5]++;
                    p[13]++;
                    p[14]++;
                }else {
                    p[5]--;
                    p[13]--;
                    p[14]--;
                }
                break;
            case R.id.c16:
                if(checkBox[16].isChecked()){
                    p[5]++;
                    p[6]++;
                    p[7]++;
                    p[8]++;
                }else {
                    p[5]--;
                    p[6]--;
                    p[7]--;
                    p[8]--;
                }
                break;
            case R.id.c17:
                if(checkBox[17].isChecked()){
                    p[5]++;
                    p[6]++;
                    p[7]++;
                }else {
                    p[5]--;
                    p[6]--;
                    p[7]--;
                }
                break;
            case R.id.c18:
                if(checkBox[18].isChecked()){
                    p[5]++;
                }else {
                    p[5]--;
                }
                break;
            case R.id.c19:
                if(checkBox[19].isChecked()){
                    p[5]++;
                }else {
                    p[5]--;
                }
                break;
            case R.id.c20:
                if(checkBox[20].isChecked()){
                    p[6]++;
                }else {
                    p[6]--;
                }
                break;
            case R.id.c21:
                if(checkBox[21].isChecked()){
                    p[7]++;
                }else {
                    p[7]--;
                }
                break;
            case R.id.c22:
                if(checkBox[22].isChecked()){
                    p[8]++;
                }else {
                    p[8]--;
                }
                break;
            case R.id.c23:
                if(checkBox[23].isChecked()){
                    p[9]++;
                }else {
                    p[9]--;
                }
                break;
            case R.id.c24:
                if(checkBox[24].isChecked()){
                    p[9]++;
                    p[14]++;
                }else {
                    p[9]--;
                    p[14]--;
                }
                break;
            case R.id.c25:
                if(checkBox[25].isChecked()){
                    p[10]++;
                }else {
                    p[10]--;
                }
                break;
            case R.id.c26:
                if(checkBox[26].isChecked()){
                    p[10]++;
                }else {
                    p[10]--;
                }
                break;
            case R.id.c27:
                if(checkBox[27].isChecked()){
                    p[11]++;
                }else {
                    p[11]--;
                }
                break;
            case R.id.c28:
                if(checkBox[28].isChecked()){
                    p[11]++;
                }else {
                    p[11]--;
                }
                break;
            case R.id.c29:
                if(checkBox[29].isChecked()){
                    p[12]++;
                }else {
                    p[12]--;
                }
                break;
            case R.id.c30:
                if(checkBox[30].isChecked()){
                    p[12]++;
                }else {
                    p[12]--;
                }
                break;
            case R.id.c31:
                if(checkBox[31].isChecked()){
                    p[13]++;
                }else {
                    p[13]--;
                }
                break;
            case R.id.c32:
                if(checkBox[32].isChecked()){
                    p[14]++;
                }else {
                    p[14]--;
                }
                break;
            case R.id.c33:
                if(checkBox[33].isChecked()){
                    p[15]++;
                }else {
                    p[15]--;
                }
                break;
            case R.id.c34:
                if(checkBox[34].isChecked()){
                    p[15]++;
                }else {
                    p[15]--;
                }
                break;
            case R.id.c35:
                if(checkBox[35].isChecked()){
                    p[16]++;
                }else {
                    p[16]--;
                }
                break;
            case R.id.c36:
                if(checkBox[36].isChecked()){
                    p[16]++;
                }else {
                    p[16]--;
                }
                break;
            case R.id.c37:
                if(checkBox[37].isChecked()){
                    p[16]++;
                }else {
                    p[16]--;
                }
                break;
        }
    }

    public void hitung(View view){
        persenmax=0;
        x[1]=6;
        x[2]=7;
        x[3]=6;
        x[4]=6;
        x[5]=5;
        x[6]=4;
        x[7]=3;
        x[8]=3;
        x[9]=4;
        x[10]=3;
        x[11]=2;
        x[12]=2;
        x[13]=4;
        x[14]=4;
        x[15]=2;
        x[16]=3;
        int z=100;
        for (int i =1; i<=16; i++){
            persen =  p[i]/x[i]*z;
            if (persenmax<persen){
                persenmax=persen;
                id=i;
            }
        }

        Intent diagnosa = new Intent(this, DiagnosaActivity.class);
        persenmax= Math.round(persenmax);
        String a = String.valueOf(id);
        String b = String.valueOf(persenmax);
        diagnosa.putExtra("id",a);
        diagnosa.putExtra("persentase",b);
        startActivity(diagnosa);
    }


    public void resetEvent(View view){
        Intent intent = new Intent(this,MainActivity.class);
        finish();
        startActivity(intent);
    }
}
