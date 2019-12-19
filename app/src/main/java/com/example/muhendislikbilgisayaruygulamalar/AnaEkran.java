package com.example.muhendislikbilgisayaruygulamalar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AnaEkran extends AppCompatActivity {


    int str=0;
    int stn=0;



    EditText birbir;
    EditText biriki;
    EditText biruc;
    EditText birdort;
    EditText birbes;
    EditText ikibir;
    EditText ikiiki;
    EditText ikiuc;
    EditText ikidort;
    EditText ikibes;
    EditText ucbir;
    EditText uciki;
    EditText ucuc;
    EditText ucdort;
    EditText ucbes;
    EditText dortbir;
    EditText dortiki;
    EditText dortuc;
    EditText dortdort;
    EditText dortbes;
    EditText besbir;
    EditText besiki;
    EditText besuc;
    EditText besdort;
    EditText besbes;

    String birbirTemp;
    String birikiTemp;
    String birucTemp;
    String birdortTemp;
    String birbesTemp;
    String ikibirTemp;
    String ikiikiTemp;
    String ikiucTemp;
    String ikidortTemp;
    String ikibesTemp;
    String ucbirTemp;
    String ucikiTemp;
    String ucucTemp;
    String ucdortTemp;
    String ucbesTemp;
    String dortbirTemp;
    String dortikiTemp;
    String dortucTemp;
    String dortdortTemp;
    String dortbesTemp;
    String besbirTemp;
    String besikiTemp;
    String besucTemp;
    String besdortTemp;
    String besbesTemp;

    String strTemp;
    String stnTemp;

    EditText satir;
    EditText sutun;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);




        //***---Satir ve sutun textfieldlari---***

         satir = (EditText) findViewById(R.id.satirText1);
       sutun = (EditText) findViewById(R.id.sutunText1);

        //***---Kutulari programin basinda kapatir---***

         birbir = (EditText) findViewById(R.id.editText14);

        birbir.setVisibility(View.INVISIBLE);

        biriki = (EditText) findViewById(R.id.editText);
        biriki.setVisibility(View.INVISIBLE);

         biruc = (EditText) findViewById(R.id.editText2);
        biruc.setVisibility(View.INVISIBLE);

         birdort = (EditText) findViewById(R.id.editText4);
        birdort.setVisibility(View.INVISIBLE);

         birbes = (EditText) findViewById(R.id.editText5);
        birbes.setVisibility(View.INVISIBLE);

         ikibir = (EditText) findViewById(R.id.editText6);
        ikibir.setVisibility(View.INVISIBLE);

         ikiiki = (EditText) findViewById(R.id.editText7);
        ikiiki.setVisibility(View.INVISIBLE);

         ikiuc = (EditText) findViewById(R.id.editText8);
        ikiuc.setVisibility(View.INVISIBLE);

         ikidort = (EditText) findViewById(R.id.editText9);
        ikidort.setVisibility(View.INVISIBLE);

        ikibes = (EditText) findViewById(R.id.editText10);
        ikibes.setVisibility(View.INVISIBLE);

        ucbir = (EditText) findViewById(R.id.editText11);
        ucbir.setVisibility(View.INVISIBLE);

         uciki = (EditText) findViewById(R.id.editText12);
        uciki.setVisibility(View.INVISIBLE);

        ucuc = (EditText) findViewById(R.id.editText13);
        ucuc.setVisibility(View.INVISIBLE);

        ucdort = (EditText) findViewById(R.id.editText3);
        ucdort.setVisibility(View.INVISIBLE);

         ucbes = (EditText) findViewById(R.id.editText15);
        ucbes.setVisibility(View.INVISIBLE);

        dortbir = (EditText) findViewById(R.id.editText16);
        dortbir.setVisibility(View.INVISIBLE);

         dortiki = (EditText) findViewById(R.id.editText17);
        dortiki.setVisibility(View.INVISIBLE);

         dortuc = (EditText) findViewById(R.id.editText18);
        dortuc.setVisibility(View.INVISIBLE);

        dortdort = (EditText) findViewById(R.id.editText19);
        dortdort.setVisibility(View.INVISIBLE);

         dortbes = (EditText) findViewById(R.id.editText20);
        dortbes.setVisibility(View.INVISIBLE);

         besbir = (EditText) findViewById(R.id.editText21);
        besbir.setVisibility(View.INVISIBLE);

         besiki = (EditText) findViewById(R.id.editText22);
        besiki.setVisibility(View.INVISIBLE);

         besuc = (EditText) findViewById(R.id.editText23);
        besuc.setVisibility(View.INVISIBLE);

        besdort = (EditText) findViewById(R.id.editText24);
        besdort.setVisibility(View.INVISIBLE);

        besbes = (EditText) findViewById(R.id.editText26);
        besbes.setVisibility(View.INVISIBLE);

        //***------------------------------------------------------------***


        //***---Bir kutucugun satir ve sutun degerini sayisal integera donusturur---***
        char value1 = birbir.getHint().toString().trim().charAt(0);
        char value2 = birbir.getHint().toString().trim().charAt(2);
        final int a1 = Character.getNumericValue(value1);
        final int a2 = Character.getNumericValue(value2);

        char value3 = biriki.getHint().toString().trim().charAt(0);
        char value4 = biriki.getHint().toString().trim().charAt(2);
        final int b1 = Character.getNumericValue(value3);
        final int b2 = Character.getNumericValue(value4);

        char value5 = biruc.getHint().toString().trim().charAt(0);
        char value6 = biruc.getHint().toString().trim().charAt(2);
        final int c1 = Character.getNumericValue(value5);
        final int c2 = Character.getNumericValue(value6);

        char value7 = birdort.getHint().toString().trim().charAt(0);
        char value8 = birdort.getHint().toString().trim().charAt(2);
        final int d1 = Character.getNumericValue(value7);
        final int d2 = Character.getNumericValue(value8);

        char value9 = birbes.getHint().toString().trim().charAt(0);
        char value10 = birbes.getHint().toString().trim().charAt(2);
        final int e1 = Character.getNumericValue(value9);
        final int e2 = Character.getNumericValue(value10);

        char value11 = ikibir.getHint().toString().trim().charAt(0);
        char value12 = ikibir.getHint().toString().trim().charAt(2);
        final int f1 = Character.getNumericValue(value11);
        final int f2 = Character.getNumericValue(value12);

        char value13 = ikiiki.getHint().toString().trim().charAt(0);
        char value14 = ikiiki.getHint().toString().trim().charAt(2);
        final int g1 = Character.getNumericValue(value13);
        final int g2 = Character.getNumericValue(value14);

        char value15 = ikiuc.getHint().toString().trim().charAt(0);
        char value16 = ikiuc.getHint().toString().trim().charAt(2);
        final int i1 = Character.getNumericValue(value15);
        final int i2 = Character.getNumericValue(value16);

        char value17 = ikidort.getHint().toString().trim().charAt(0);
        char value18 = ikidort.getHint().toString().trim().charAt(2);
        final int j1 = Character.getNumericValue(value17);
        final int j2 = Character.getNumericValue(value18);

        char value19 = ikibes.getHint().toString().trim().charAt(0);
        char value20 = ikibes.getHint().toString().trim().charAt(2);
        final int k1 = Character.getNumericValue(value19);
        final int k2 = Character.getNumericValue(value20);

        char value21 = ucbir.getHint().toString().trim().charAt(0);
        char value22 = ucbir.getHint().toString().trim().charAt(2);
        final int l1 = Character.getNumericValue(value21);
        final int l2 = Character.getNumericValue(value22);

        char value23 = uciki.getHint().toString().trim().charAt(0);
        char value24 = uciki.getHint().toString().trim().charAt(2);
        final int m1 = Character.getNumericValue(value23);
        final int m2 = Character.getNumericValue(value24);

        char value25 = ucuc.getHint().toString().trim().charAt(0);
        char value26 = ucuc.getHint().toString().trim().charAt(2);
        final int n1 = Character.getNumericValue(value25);
        final int n2 = Character.getNumericValue(value26);

        char value27 = ucdort.getHint().toString().trim().charAt(0);
        char value28 = ucdort.getHint().toString().trim().charAt(2);
        final int o1 = Character.getNumericValue(value27);
        final int o2 = Character.getNumericValue(value28);

        char value30 = ucbes.getHint().toString().trim().charAt(0);
        char value31 = ucbes.getHint().toString().trim().charAt(2);
        final int p1 = Character.getNumericValue(value30);
        final int p2 = Character.getNumericValue(value31);

        char value32 = dortbir.getHint().toString().trim().charAt(0);
        char value33 = dortbir.getHint().toString().trim().charAt(2);
        final int r1 = Character.getNumericValue(value32);
        final int r2 = Character.getNumericValue(value33);

        char value34 = dortiki.getHint().toString().trim().charAt(0);
        char value35 = dortiki.getHint().toString().trim().charAt(2);
        final int s1 = Character.getNumericValue(value34);
        final int s2 = Character.getNumericValue(value35);

        char value36 = dortuc.getHint().toString().trim().charAt(0);
        char value37 = dortuc.getHint().toString().trim().charAt(2);
        final int t1 = Character.getNumericValue(value36);
        final int t2 = Character.getNumericValue(value37);

        char value38 = dortdort.getHint().toString().trim().charAt(0);
        char value39 = dortdort.getHint().toString().trim().charAt(2);
        final int u1 = Character.getNumericValue(value38);
        final int u2 = Character.getNumericValue(value39);

        char value40 = dortbes.getHint().toString().trim().charAt(0);
        char value41 = dortbes.getHint().toString().trim().charAt(2);
        final int z1 = Character.getNumericValue(value40);
        final int z2 = Character.getNumericValue(value41);

        char value42 = besbir.getHint().toString().trim().charAt(0);
        char value43 = besbir.getHint().toString().trim().charAt(2);
        final int x1 = Character.getNumericValue(value42);
        final int x2 = Character.getNumericValue(value43);

        char value44 = besiki.getHint().toString().trim().charAt(0);
        char value45 = besuc.getHint().toString().trim().charAt(2);
        final int q1 = Character.getNumericValue(value44);
        final int q2 = Character.getNumericValue(value45);

        char value46 = besuc.getHint().toString().trim().charAt(0);
        char value47 = besuc.getHint().toString().trim().charAt(2);
        final int w1 = Character.getNumericValue(value46);
        final int w2 = Character.getNumericValue(value47);

        char value48 = besdort.getHint().toString().trim().charAt(0);
        char value49 = besdort.getHint().toString().trim().charAt(2);
        final int v1 = Character.getNumericValue(value48);
        final int v2 = Character.getNumericValue(value49);

        char value50 = besbes.getHint().toString().trim().charAt(0);
        char value51 = besbes.getHint().toString().trim().charAt(2);
        final int mer1 = Character.getNumericValue(value50);
        final int mer2 = Character.getNumericValue(value51);





        // birbir.setVisibility(View.INVISIBLE); gorunmezlik iksiri


        //Toast.makeText(this, String.valueOf(a), Toast.LENGTH_SHORT).show();


        Button dogrula = (Button) findViewById(R.id.dogrula);
        dogrula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    str = Integer.parseInt(satir.getText().toString().trim());
                    stn = Integer.parseInt(sutun.getText().toString().trim());

                    if (str > 5 || stn > 5) {

                        Toast.makeText(AnaEkran.this, "Satir veya sutun 5'den buyuk olamaz!", Toast.LENGTH_SHORT).show();

                    }

                    // kutulari acma/kapama kodlamasi

                    else {

                        if (a1 <= str && a2 <= stn) {
                            birbir.setVisibility(View.VISIBLE);
                        } else {
                            birbir.setVisibility(View.INVISIBLE);
                        }

                        if (b1 <= str && b2 <= stn) {
                            biriki.setVisibility(View.VISIBLE);
                        } else {
                            biriki.setVisibility(View.INVISIBLE);
                        }

                        if (c1 <= str && c2 <= stn) {
                            biruc.setVisibility(View.VISIBLE);
                        } else {
                            biruc.setVisibility(View.INVISIBLE);
                        }

                        if (d1 <= str && d2 <= stn) {
                            birdort.setVisibility(View.VISIBLE);
                        } else {
                            birdort.setVisibility(View.INVISIBLE);
                        }

                        if (e1 <= str && e2 <= stn) {
                            birbes.setVisibility(View.VISIBLE);
                        } else {
                            birbes.setVisibility(View.INVISIBLE);
                        }

                        if (f1 <= str && f2 <= stn) {
                            ikibir.setVisibility(View.VISIBLE);
                        } else {
                            ikibir.setVisibility(View.INVISIBLE);
                        }

                        if (g1 <= str && g2 <= stn) {
                            ikiiki.setVisibility(View.VISIBLE);
                        } else {
                            ikiiki.setVisibility(View.INVISIBLE);
                        }

                        if (i1 <= str && i2 <= stn) {
                            ikiuc.setVisibility(View.VISIBLE);
                        } else {
                            ikiuc.setVisibility(View.INVISIBLE);
                        }

                        if (j1 <= str && j2 <= stn) {
                            ikidort.setVisibility(View.VISIBLE);
                        } else {
                            ikidort.setVisibility(View.INVISIBLE);
                        }

                        if (k1 <= str && k2 <= stn) {
                            ikibes.setVisibility(View.VISIBLE);
                        } else {
                            ikibes.setVisibility(View.INVISIBLE);
                        }

                        if (l1 <= str && l2 <= stn) {
                            ucbir.setVisibility(View.VISIBLE);
                        } else {
                            ucbir.setVisibility(View.INVISIBLE);
                        }

                        if (m1 <= str && m2 <= stn) {
                            uciki.setVisibility(View.VISIBLE);
                        } else {
                            uciki.setVisibility(View.INVISIBLE);
                        }

                        if (n1 <= str && n2 <= stn) {
                            ucuc.setVisibility(View.VISIBLE);
                        } else {
                            ucuc.setVisibility(View.INVISIBLE);
                        }

                        if (o1 <= str && o2 <= stn) {
                            ucdort.setVisibility(View.VISIBLE);
                        } else {
                            ucdort.setVisibility(View.INVISIBLE);
                        }

                        if (p1 <= str && p2 <= stn) {
                            ucbes.setVisibility(View.VISIBLE);
                        } else {
                            ucbes.setVisibility(View.INVISIBLE);
                        }

                        if (r1 <= str && r2 <= stn) {
                            dortbir.setVisibility(View.VISIBLE);
                        } else {
                            dortbir.setVisibility(View.INVISIBLE);
                        }

                        if (s1 <= str && s2 <= stn) {
                            dortiki.setVisibility(View.VISIBLE);
                        } else {
                            dortiki.setVisibility(View.INVISIBLE);
                        }

                        if (t1 <= str && t2 <= stn) {
                            dortuc.setVisibility(View.VISIBLE);
                        } else {
                            dortuc.setVisibility(View.INVISIBLE);
                        }

                        if (u1 <= str && u2 <= stn) {
                            dortdort.setVisibility(View.VISIBLE);
                        } else {
                            dortdort.setVisibility(View.INVISIBLE);
                        }

                        if (z1 <= str && z2 <= stn) {
                            dortbes.setVisibility(View.VISIBLE);
                        } else {
                            dortbes.setVisibility(View.INVISIBLE);
                        }

                        if (x1 <= str && x2 <= stn) {
                            besbir.setVisibility(View.VISIBLE);
                        } else {
                            besbir.setVisibility(View.INVISIBLE);
                        }

                        if (q1 <= str && q2 <= stn) {
                            besiki.setVisibility(View.VISIBLE);
                        } else {
                            besiki.setVisibility(View.INVISIBLE);
                        }

                        if (w1 <= str && w2 <= stn) {
                            besuc.setVisibility(View.VISIBLE);
                        } else {
                            besuc.setVisibility(View.INVISIBLE);
                        }

                        if (v1 <= str && v2 <= stn) {
                            besdort.setVisibility(View.VISIBLE);
                        } else {
                            besdort.setVisibility(View.INVISIBLE);
                        }

                        if (mer1 <= str && mer2 <= stn) {
                            besbes.setVisibility(View.VISIBLE);
                        } else {
                            besbes.setVisibility(View.INVISIBLE);
                        }

                    }


                } catch (Exception e) {
                    Toast.makeText(AnaEkran.this, "İşlemi kontrol Ediniz", Toast.LENGTH_SHORT).show();
                }
            }

        });







            final List<Integer> integerList = new ArrayList<Integer>();
            final TextView sonuc = (TextView) findViewById(R.id.textView11);

            final Button hesapla = (Button) findViewById(R.id.hesapla);
            hesapla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        final int str2 = Integer.parseInt(satir.getText().toString().trim());
                        final int stn2 = Integer.parseInt(sutun.getText().toString().trim());

                        if (str2 == 1 && stn2 == 1) {
                            Toast.makeText(AnaEkran.this, "1x1 matrisin determinanti olamaz!", Toast.LENGTH_SHORT).show();
                        } else if (str2 == 2 && stn2 == 2) { // 2x2 matrisin determinanti

                            int a = Integer.parseInt(birbir.getText().toString());
                            int b = Integer.parseInt(biriki.getText().toString());
                            int c = Integer.parseInt(ikibir.getText().toString());
                            int d = Integer.parseInt(ikiiki.getText().toString());

                            int determinant = (a * d) - (b * c);
                            Toast.makeText(AnaEkran.this, String.valueOf(determinant), Toast.LENGTH_SHORT).show();
                            sonuc.setText(String.valueOf(determinant));

                        } else if (str2 == 3 && stn2 == 3) { //3x3 matrisin determinanti

                            int a = Integer.parseInt(birbir.getText().toString());
                            int b = Integer.parseInt(biriki.getText().toString());
                            int c = Integer.parseInt(biruc.getText().toString());
                            int d = Integer.parseInt(ikibir.getText().toString());
                            int e = Integer.parseInt(ikiiki.getText().toString());
                            int f = Integer.parseInt(ikiuc.getText().toString());
                            int g = Integer.parseInt(ucbir.getText().toString());
                            int h = Integer.parseInt(uciki.getText().toString());
                            int i = Integer.parseInt(ucuc.getText().toString());

                            int determinant = (a * ((e * i) - (f * h))) - (b * ((d * i) - (f * g))) + (c * ((d * h) - (e * g)));
                            Toast.makeText(AnaEkran.this, String.valueOf(determinant), Toast.LENGTH_SHORT).show();
                            sonuc.setText(String.valueOf(determinant));

                        } else if (str2 == 4 && stn2 == 4) {

                            int a = Integer.parseInt(birbir.getText().toString().trim());
                            int b = Integer.parseInt(biriki.getText().toString().trim());
                            int c = Integer.parseInt(biruc.getText().toString().trim());
                            int d = Integer.parseInt(birdort.getText().toString().trim());
                            int e = Integer.parseInt(ikibir.getText().toString().trim());
                            int f = Integer.parseInt(ikiiki.getText().toString().trim());
                            int g = Integer.parseInt(ikiuc.getText().toString().trim());
                            int h = Integer.parseInt(ikidort.getText().toString().trim());
                            int i = Integer.parseInt(ucbir.getText().toString().trim());
                            int j = Integer.parseInt(uciki.getText().toString().trim());
                            int k = Integer.parseInt(ucuc.getText().toString().trim());
                            int l = Integer.parseInt(ucdort.getText().toString().trim());
                            int m = Integer.parseInt(dortbir.getText().toString().trim());
                            int n = Integer.parseInt(dortiki.getText().toString().trim());
                            int o = Integer.parseInt(dortuc.getText().toString().trim());
                            int p = Integer.parseInt(dortdort.getText().toString().trim());


                            int minor1 = (a * ((f * ((k * p) - (o * l)))
                                    - (g * ((j * p) - (n * l)))
                                    + (h * ((j * o) - (n * k)))));

                            int minor2 = (b * ((e * ((k * p) - (o * l)))
                                    - (g * ((i * p) - (m * l)))
                                    + (h * ((i * o) - (m * k)))));

                            int minor3 = (c * ((e * ((j * p) - (n * l)))
                                    - (f * ((i * p) - (m * l)))
                                    + (h * ((i * n) - (m * j)))));

                            int minor4 = (d * ((e * ((j * o) - (n * k)))
                                    - (f * ((i * o) - (m * k)))
                                    + (g * ((i * n) - (m * j)))));

                            int determinant = minor1 - minor2 + minor3 - minor4;
                            Toast.makeText(AnaEkran.this, String.valueOf(determinant), Toast.LENGTH_SHORT).show();
                            sonuc.setText(String.valueOf(determinant));

                        } else if (str2 == 5 && stn2 == 5) {

                            int a = Integer.parseInt(birbir.getText().toString().trim());
                            int b = Integer.parseInt(biriki.getText().toString().trim());
                            int c = Integer.parseInt(biruc.getText().toString().trim());
                            int d = Integer.parseInt(birdort.getText().toString().trim());
                            int e = Integer.parseInt(birbes.getText().toString().trim());
                            int f = Integer.parseInt(ikibir.getText().toString().trim());
                            int g = Integer.parseInt(ikiiki.getText().toString().trim());
                            int h = Integer.parseInt(ikiuc.getText().toString().trim());
                            int i = Integer.parseInt(ikidort.getText().toString().trim());
                            int j = Integer.parseInt(ikibes.getText().toString().trim());
                            int k = Integer.parseInt(ucbir.getText().toString().trim());
                            int l = Integer.parseInt(uciki.getText().toString().trim());
                            int m = Integer.parseInt(ucuc.getText().toString().trim());
                            int n = Integer.parseInt(ucdort.getText().toString().trim());
                            int o = Integer.parseInt(ucbes.getText().toString().trim());
                            int p = Integer.parseInt(dortbir.getText().toString().trim());
                            int r = Integer.parseInt(dortiki.getText().toString().trim());
                            int s = Integer.parseInt(dortuc.getText().toString().trim());
                            int t = Integer.parseInt(dortdort.getText().toString().trim());
                            int u = Integer.parseInt(dortbes.getText().toString().trim());
                            int w = Integer.parseInt(besbir.getText().toString().trim());
                            int y = Integer.parseInt(besiki.getText().toString().trim());
                            int z = Integer.parseInt(besuc.getText().toString().trim());
                            int x = Integer.parseInt(besdort.getText().toString().trim());
                            int q = Integer.parseInt(besbes.getText().toString().trim());


                            int minor1 = (a * (g * ((m * ((t * q) - (x * u)))
                                    - (n * ((s * q) - (z * u)))
                                    + (o * ((s * x) - (z * t)))))
                                    -
                                    (h * ((l * ((t * q) - (x * u)))
                                            - (n * ((r * q) - (y * u)))
                                            + (o * ((r * x) - (y * t)))))
                                    +
                                    (i * ((l * ((s * q) - (z * u)))
                                            - (m * ((r * q) - (y * u)))
                                            + (o * ((r * z) - (y * s)))))
                                    -
                                    (j * ((l * ((s * x) - (z * t)))
                                            - (m * ((r * x) - (y * t)))
                                            + (n * ((r * z) - (y * s))))));

                            int minor2 = (b * (f * ((m * ((t * q) - (x * u)))
                                    - (n * ((s * q) - (z * u)))
                                    + (o * ((s * x) - (z * t)))))
                                    -
                                    (h * ((k * ((t * q) - (x * u)))
                                            - (n * ((p * q) - (w * u)))
                                            + (o * ((p * x) - (w * t)))))
                                    +
                                    (i * ((k * ((s * q) - (z * u)))
                                            - (m * ((p * q) - (w * u)))
                                            + (o * ((p * z) - (w * s)))))
                                    -
                                    (j * ((k * ((s * x) - (z * t)))
                                            - (m * ((p * x) - (w * t)))
                                            + (n * ((p * z) - (w * s))))));

                            int minor3 = (c * (f * ((l * ((t * q) - (x * u)))
                                    - (n * ((r * q) - (y * u)))
                                    + (o * ((r * x) - (y * t)))))
                                    -
                                    (g * ((k * ((t * q) - (x * u)))
                                            - (l * ((p * q) - (w * u)))
                                            + (o * ((p * x) - (w * t)))))
                                    +
                                    (i * ((k * ((r * q) - (y * u)))
                                            - (l * ((p * q) - (w * u)))
                                            + (o * ((p * y) - (w * r)))))
                                    -
                                    (j * ((k * ((r * x) - (y * t)))
                                            - (l * ((p * x) - (w * t)))
                                            + (n * ((p * y) - (w * r))))));

                            int minor4 = (d * (f * ((l * ((s * q) - (z * u)))
                                    - (m * ((r * q) - (y * u)))
                                    + (o * ((r * z) - (y * z)))))
                                    -
                                    (g * ((k * ((s * q) - (z * u)))
                                            - (m * ((p * q) - (w * u)))
                                            + (o * ((p * z) - (w * s)))))
                                    +
                                    (h * ((k * ((r * q) - (y * u)))
                                            - (l * ((p * q) - (w * u)))
                                            + (o * ((p * y) - (w * r)))))
                                    -
                                    (j * ((k * ((r * z) - (y * s)))
                                            - (l * ((p * z) - (w * s)))
                                            + (m * ((p * y) - (w * r))))));

                            int minor5 = (e * (f * ((l * ((s * x) - (z * t)))
                                    - (m * ((r * x) - (y * t)))
                                    + (n * ((r * z) - (y * s)))))
                                    -
                                    (g * ((k * ((s * x) - (z * t)))
                                            - (m * ((p * x) - (w * t)))
                                            + (n * ((p * z) - (w * s)))))
                                    +
                                    (h * ((k * ((r * x) - (y * t)))
                                            - (l * ((p * x) - (w * t)))
                                            + (n * ((p * y) - (w * r)))))
                                    -
                                    (i * ((k * ((r * z) - (y * s)))
                                            - (l * ((p * z) - (w * s)))
                                            + (m * ((p * y) - (w * r))))));


                            int determinant = minor1 - minor2 + minor3 - minor4 + minor5;
                            Toast.makeText(AnaEkran.this, String.valueOf(determinant), Toast.LENGTH_SHORT).show();
                            sonuc.setText(String.valueOf(determinant));

                        } else {
                            Toast.makeText(AnaEkran.this, "Bir matrisin determinantinin olmasi icin kare matris olmak gerekmektedir", Toast.LENGTH_SHORT).show();
                        }


                    } catch (Exception e) {
                        Toast.makeText(AnaEkran.this, "İşlemi Kontrol Ediniz", Toast.LENGTH_SHORT).show();

                    }
                }

            });




        Button transpoze= (Button) findViewById(R.id.transpoze);
        transpoze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    final int str3 = Integer.parseInt(satir.getText().toString().trim());
                    final int stn3 = Integer.parseInt(sutun.getText().toString().trim());


                    if (str3 == 1 && stn3 == 2) {

                        int a = Integer.parseInt(birbir.getText().toString().trim());
                        int b = Integer.parseInt(biriki.getText().toString().trim());

                        biriki.setVisibility(View.INVISIBLE);

                        ikibir.setVisibility(View.VISIBLE);

                        birbir.setText(String.valueOf(a));
                        ikibir.setText(String.valueOf(b));

                    } else if (str3 == 1 && stn3 == 3) {

                        int a = Integer.parseInt(birbir.getText().toString().trim());
                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(biruc.getText().toString().trim());

                        biriki.setVisibility(View.INVISIBLE);
                        biruc.setVisibility(View.INVISIBLE);


                        ikibir.setVisibility(View.VISIBLE);
                        ucbir.setVisibility(View.VISIBLE);

                        birbir.setText(String.valueOf(a));
                        ikibir.setText(String.valueOf(b));
                        ucbir.setText(String.valueOf(c));

                    } else if (str3 == 1 && stn3 == 4) {

                        int a = Integer.parseInt(birbir.getText().toString().trim());
                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(biruc.getText().toString().trim());
                        int d = Integer.parseInt(birdort.getText().toString().trim());

                        biriki.setVisibility(View.INVISIBLE);
                        biruc.setVisibility(View.INVISIBLE);
                        birdort.setVisibility(View.INVISIBLE);

                        ikibir.setVisibility(View.VISIBLE);
                        ucbir.setVisibility(View.VISIBLE);
                        dortbir.setVisibility(View.VISIBLE);

                        birbir.setText(String.valueOf(a));
                        ikibir.setText(String.valueOf(b));
                        ucbir.setText(String.valueOf(c));
                        dortbir.setText(String.valueOf(d));

                    } else if (str3 == 1 && stn3 == 5) {

                        int a = Integer.parseInt(birbir.getText().toString().trim());
                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(biruc.getText().toString().trim());
                        int d = Integer.parseInt(birdort.getText().toString().trim());
                        int e = Integer.parseInt(birbes.getText().toString().trim());

                        biriki.setVisibility(View.INVISIBLE);
                        biruc.setVisibility(View.INVISIBLE);
                        birdort.setVisibility(View.INVISIBLE);
                        birbes.setVisibility(View.INVISIBLE);

                        ikibir.setVisibility(View.VISIBLE);
                        ucbir.setVisibility(View.VISIBLE);
                        dortbir.setVisibility(View.VISIBLE);
                        besbir.setVisibility(View.VISIBLE);

                        birbir.setText(String.valueOf(a));
                        ikibir.setText(String.valueOf(b));
                        ucbir.setText(String.valueOf(c));
                        dortbir.setText(String.valueOf(d));
                        besbir.setText(String.valueOf(e));

                    } else if (str3 == 2 && stn3 == 1) {

                        int a = Integer.parseInt(birbir.getText().toString().trim());
                        int b = Integer.parseInt(ikibir.getText().toString().trim());

                        ikibir.setVisibility(View.INVISIBLE);

                        biriki.setVisibility(View.VISIBLE);

                        birbir.setText(String.valueOf(a));
                        biriki.setText(String.valueOf(b));

                    } else if (str3 == 2 && stn3 == 2) {

                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(ikibir.getText().toString().trim());

                        biriki.setText(String.valueOf(c));
                        ikibir.setText(String.valueOf(b));

                    } else if (str3 == 2 && stn3 == 3) {

                        int a = Integer.parseInt(birbir.getText().toString().trim());
                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(biruc.getText().toString().trim());
                        int d = Integer.parseInt(ikibir.getText().toString().trim());
                        int e = Integer.parseInt(ikiiki.getText().toString().trim());
                        int f = Integer.parseInt(ikiuc.getText().toString().trim());

                        biruc.setVisibility(View.INVISIBLE);
                        ikiuc.setVisibility(View.INVISIBLE);

                        ucbir.setVisibility(View.VISIBLE);
                        uciki.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(d));
                        ikibir.setText(String.valueOf(b));
                        ikiiki.setText(String.valueOf(e));
                        ucbir.setText(String.valueOf(c));
                        uciki.setText(String.valueOf(f));

                    } else if (str3 == 2 && stn3 == 4) {

                        int a = Integer.parseInt(birbir.getText().toString().trim());
                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(biruc.getText().toString().trim());
                        int d = Integer.parseInt(birdort.getText().toString().trim());
                        int e = Integer.parseInt(ikibir.getText().toString().trim());
                        int f = Integer.parseInt(ikiiki.getText().toString().trim());
                        int g = Integer.parseInt(ikiuc.getText().toString().trim());
                        int h = Integer.parseInt(ikidort.getText().toString().trim());

                        biruc.setVisibility(View.INVISIBLE);
                        ikiuc.setVisibility(View.INVISIBLE);
                        birdort.setVisibility(View.INVISIBLE);
                        ikidort.setVisibility(View.INVISIBLE);

                        ucbir.setVisibility(View.VISIBLE);
                        uciki.setVisibility(View.VISIBLE);
                        dortbir.setVisibility(View.VISIBLE);
                        dortiki.setVisibility(View.VISIBLE);


                        biriki.setText(String.valueOf(e));
                        ikibir.setText(String.valueOf(b));
                        ikiiki.setText(String.valueOf(f));
                        ucbir.setText(String.valueOf(c));
                        uciki.setText(String.valueOf(g));
                        dortbir.setText(String.valueOf(d));
                        dortiki.setText(String.valueOf(h));

                    } else if (str3 == 2 && stn3 == 5) {

                        int a = Integer.parseInt(birbir.getText().toString().trim());
                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(biruc.getText().toString().trim());
                        int d = Integer.parseInt(birdort.getText().toString().trim());
                        int e = Integer.parseInt(birbes.getText().toString().trim());
                        int f = Integer.parseInt(ikibir.getText().toString().trim());
                        int g = Integer.parseInt(ikiiki.getText().toString().trim());
                        int h = Integer.parseInt(ikiuc.getText().toString().trim());
                        int i = Integer.parseInt(ikidort.getText().toString().trim());
                        int j = Integer.parseInt(ikibes.getText().toString().trim());

                        biruc.setVisibility(View.INVISIBLE);
                        ikiuc.setVisibility(View.INVISIBLE);
                        birdort.setVisibility(View.INVISIBLE);
                        ikidort.setVisibility(View.INVISIBLE);
                        birbes.setVisibility(View.INVISIBLE);
                        ikibes.setVisibility(View.INVISIBLE);

                        ucbir.setVisibility(View.VISIBLE);
                        uciki.setVisibility(View.VISIBLE);
                        dortbir.setVisibility(View.VISIBLE);
                        dortiki.setVisibility(View.VISIBLE);
                        besbir.setVisibility(View.VISIBLE);
                        besiki.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(f));
                        ikibir.setText(String.valueOf(b));
                        ikiiki.setText(String.valueOf(g));
                        ucbir.setText(String.valueOf(c));
                        uciki.setText(String.valueOf(h));
                        dortbir.setText(String.valueOf(d));
                        dortiki.setText(String.valueOf(i));
                        besbir.setText(String.valueOf(e));
                        besiki.setText(String.valueOf(j));

                    } else if (str3 == 3 && stn3 == 1) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());

                        ikibir.setVisibility(View.INVISIBLE);
                        ucbir.setVisibility(View.INVISIBLE);


                        biriki.setVisibility(View.VISIBLE);
                        biruc.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));

                    } else if (str3 == 3 && stn3 == 2) {

                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(ikibir.getText().toString().trim());
                        int d = Integer.parseInt(ikiiki.getText().toString().trim());
                        int e = Integer.parseInt(ucbir.getText().toString().trim());
                        int f = Integer.parseInt(uciki.getText().toString().trim());


                        ucbir.setVisibility(View.INVISIBLE);
                        uciki.setVisibility(View.INVISIBLE);


                        biruc.setVisibility(View.VISIBLE);
                        ikiuc.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(c));
                        biruc.setText(String.valueOf(e));
                        ikibir.setText(String.valueOf(b));
                        ikiiki.setText(String.valueOf(d));
                        ikiuc.setText(String.valueOf(f));

                    } else if (str3 == 3 && stn3 == 3) {

                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(biruc.getText().toString().trim());
                        int d = Integer.parseInt(ikibir.getText().toString().trim());
                        int e = Integer.parseInt(ikiiki.getText().toString().trim());
                        int f = Integer.parseInt(ikiuc.getText().toString().trim());
                        int g = Integer.parseInt(ucbir.getText().toString().trim());
                        int h = Integer.parseInt(uciki.getText().toString().trim());
                        int i = Integer.parseInt(ucuc.getText().toString().trim());

                        biriki.setText(String.valueOf(d));
                        biruc.setText(String.valueOf(g));
                        ikibir.setText(String.valueOf(b));
                        ikiiki.setText(String.valueOf(e));
                        ikiuc.setText(String.valueOf(h));
                        ucbir.setText(String.valueOf(c));
                        uciki.setText(String.valueOf(f));
                        ucuc.setText(String.valueOf(i));

                    } else if (str3 == 3 && stn3 == 4) {

                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(biruc.getText().toString().trim());
                        int d = Integer.parseInt(birdort.getText().toString().trim());
                        int e = Integer.parseInt(ikibir.getText().toString().trim());
                        int f = Integer.parseInt(ikiiki.getText().toString().trim());
                        int g = Integer.parseInt(ikiuc.getText().toString().trim());
                        int h = Integer.parseInt(ikidort.getText().toString().trim());
                        int i = Integer.parseInt(ucbir.getText().toString().trim());
                        int j = Integer.parseInt(uciki.getText().toString().trim());
                        int k = Integer.parseInt(ucuc.getText().toString().trim());
                        int l = Integer.parseInt(ucdort.getText().toString().trim());

                        birdort.setVisibility(View.INVISIBLE);
                        ikidort.setVisibility(View.INVISIBLE);
                        ucdort.setVisibility(View.INVISIBLE);

                        dortbir.setVisibility(View.VISIBLE);
                        dortiki.setVisibility(View.VISIBLE);
                        dortuc.setVisibility(View.VISIBLE);


                        biriki.setText(String.valueOf(e));
                        biruc.setText(String.valueOf(i));
                        ikibir.setText(String.valueOf(b));
                        ikiiki.setText(String.valueOf(f));
                        ikiuc.setText(String.valueOf(j));
                        ucbir.setText(String.valueOf(c));
                        uciki.setText(String.valueOf(g));
                        ucuc.setText(String.valueOf(k));
                        dortbir.setText(String.valueOf(d));
                        dortiki.setText(String.valueOf(h));
                        dortuc.setText(String.valueOf(l));

                    } else if (str3 == 3 && stn3 == 5) {

                        int b = Integer.parseInt(biriki.getText().toString().trim());
                        int c = Integer.parseInt(biruc.getText().toString().trim());
                        int d = Integer.parseInt(birdort.getText().toString().trim());
                        int e = Integer.parseInt(ikibir.getText().toString().trim());
                        int f = Integer.parseInt(ikiiki.getText().toString().trim());
                        int g = Integer.parseInt(ikiuc.getText().toString().trim());
                        int h = Integer.parseInt(ikidort.getText().toString().trim());
                        int i = Integer.parseInt(ucbir.getText().toString().trim());
                        int j = Integer.parseInt(uciki.getText().toString().trim());
                        int k = Integer.parseInt(ucuc.getText().toString().trim());
                        int l = Integer.parseInt(ucdort.getText().toString().trim());
                        int m = Integer.parseInt(uciki.getText().toString().trim());
                        int n = Integer.parseInt(ucuc.getText().toString().trim());
                        int o = Integer.parseInt(ucdort.getText().toString().trim());

                        birbes.setVisibility(View.INVISIBLE);
                        ikibes.setVisibility(View.INVISIBLE);
                        ucbes.setVisibility(View.INVISIBLE);
                        birdort.setVisibility(View.INVISIBLE);
                        ikidort.setVisibility(View.INVISIBLE);
                        ucdort.setVisibility(View.INVISIBLE);

                        besbir.setVisibility(View.VISIBLE);
                        besiki.setVisibility(View.VISIBLE);
                        besuc.setVisibility(View.VISIBLE);
                        dortbir.setVisibility(View.VISIBLE);
                        dortiki.setVisibility(View.VISIBLE);
                        dortuc.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(f));
                        biruc.setText(String.valueOf(k));
                        ikibir.setText(String.valueOf(b));
                        ikiiki.setText(String.valueOf(g));
                        ikiuc.setText(String.valueOf(l));
                        ucbir.setText(String.valueOf(c));
                        uciki.setText(String.valueOf(h));
                        ucuc.setText(String.valueOf(m));
                        dortbir.setText(String.valueOf(d));
                        dortiki.setText(String.valueOf(i));
                        dortuc.setText(String.valueOf(n));
                        besbir.setText(String.valueOf(e));
                        besiki.setText(String.valueOf(j));
                        besuc.setText(String.valueOf(o));

                    }

                    if (str3 == 4 && stn3 == 1) {

                        int a = Integer.parseInt(ikibir.getText().toString().trim());
                        int b = Integer.parseInt(ucbir.getText().toString().trim());
                        int c = Integer.parseInt(dortbir.getText().toString().trim());

                        ikibir.setVisibility(View.INVISIBLE);
                        ucbir.setVisibility(View.INVISIBLE);
                        dortbir.setVisibility(View.INVISIBLE);

                        biriki.setVisibility(View.VISIBLE);
                        biruc.setVisibility(View.VISIBLE);
                        birdort.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(a));
                        biruc.setText(String.valueOf(b));
                        birdort.setText(String.valueOf(c));


                    }

                    if (str3 == 4 && stn3 == 2) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());
                        int d = Integer.parseInt(dortbir.getText().toString().trim());

                        int e = Integer.parseInt(biriki.getText().toString().trim());
                        int f = Integer.parseInt(ikiiki.getText().toString().trim());
                        int g = Integer.parseInt(uciki.getText().toString().trim());
                        int h = Integer.parseInt(dortiki.getText().toString().trim());

                        ucbir.setVisibility(View.INVISIBLE);
                        uciki.setVisibility(View.INVISIBLE);
                        dortbir.setVisibility(View.INVISIBLE);
                        dortiki.setVisibility(View.INVISIBLE);

                        ikiuc.setVisibility(View.VISIBLE);
                        ikidort.setVisibility(View.VISIBLE);
                        biruc.setVisibility(View.VISIBLE);
                        birdort.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));
                        birdort.setText(String.valueOf(d));
                        ikibir.setText(String.valueOf(e));
                        ikiiki.setText(String.valueOf(f));
                        ikiuc.setText(String.valueOf(g));
                        ikidort.setText(String.valueOf(h));


                    }

                    if (str3 == 4 && stn3 == 3) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());
                        int d = Integer.parseInt(dortbir.getText().toString().trim());

                        int e = Integer.parseInt(biriki.getText().toString().trim());
                        int f = Integer.parseInt(ikiiki.getText().toString().trim());
                        int g = Integer.parseInt(uciki.getText().toString().trim());
                        int h = Integer.parseInt(dortiki.getText().toString().trim());

                        int i = Integer.parseInt(biruc.getText().toString().trim());
                        int j = Integer.parseInt(ikiuc.getText().toString().trim());
                        int k = Integer.parseInt(ucuc.getText().toString().trim());
                        int l = Integer.parseInt(dortuc.getText().toString().trim());

                        dortbir.setVisibility(View.INVISIBLE);
                        dortiki.setVisibility(View.INVISIBLE);
                        dortuc.setVisibility(View.INVISIBLE);

                        ikidort.setVisibility(View.VISIBLE);
                        ucdort.setVisibility(View.VISIBLE);
                        birdort.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));
                        birdort.setText(String.valueOf(d));
                        ikibir.setText(String.valueOf(e));
                        ikiiki.setText(String.valueOf(f));
                        ikiuc.setText(String.valueOf(g));
                        ikidort.setText(String.valueOf(h));
                        ucbir.setText(String.valueOf(i));
                        uciki.setText(String.valueOf(j));
                        ucuc.setText(String.valueOf(k));
                        ucdort.setText(String.valueOf(l));


                    } else if (str3 == 4 && stn3 == 4) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());
                        int d = Integer.parseInt(dortbir.getText().toString().trim());

                        int e = Integer.parseInt(biriki.getText().toString().trim());
                        int f = Integer.parseInt(ikiiki.getText().toString().trim());
                        int g = Integer.parseInt(uciki.getText().toString().trim());
                        int h = Integer.parseInt(dortiki.getText().toString().trim());

                        int i = Integer.parseInt(biruc.getText().toString().trim());
                        int j = Integer.parseInt(ikiuc.getText().toString().trim());
                        int k = Integer.parseInt(ucuc.getText().toString().trim());
                        int l = Integer.parseInt(dortuc.getText().toString().trim());

                        int m = Integer.parseInt(birdort.getText().toString().trim());
                        int n = Integer.parseInt(ikidort.getText().toString().trim());
                        int o = Integer.parseInt(ucdort.getText().toString().trim());
                        int p = Integer.parseInt(dortdort.getText().toString().trim());

                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));
                        birdort.setText(String.valueOf(d));
                        ikibir.setText(String.valueOf(e));
                        ikiiki.setText(String.valueOf(f));
                        ikiuc.setText(String.valueOf(g));
                        ikidort.setText(String.valueOf(h));
                        ucbir.setText(String.valueOf(i));
                        uciki.setText(String.valueOf(j));
                        ucuc.setText(String.valueOf(k));
                        ucdort.setText(String.valueOf(l));
                        dortbir.setText(String.valueOf(m));
                        dortiki.setText(String.valueOf(n));
                        dortuc.setText(String.valueOf(o));
                        dortdort.setText(String.valueOf(p));


                    } else if (str3 == 4 && stn3 == 5) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());
                        int d = Integer.parseInt(dortbir.getText().toString().trim());

                        int e = Integer.parseInt(biriki.getText().toString().trim());
                        int f = Integer.parseInt(ikiiki.getText().toString().trim());
                        int g = Integer.parseInt(uciki.getText().toString().trim());
                        int h = Integer.parseInt(dortiki.getText().toString().trim());

                        int i = Integer.parseInt(biruc.getText().toString().trim());
                        int j = Integer.parseInt(ikiuc.getText().toString().trim());
                        int k = Integer.parseInt(ucuc.getText().toString().trim());
                        int l = Integer.parseInt(dortuc.getText().toString().trim());

                        int m = Integer.parseInt(birdort.getText().toString().trim());
                        int n = Integer.parseInt(ikidort.getText().toString().trim());
                        int o = Integer.parseInt(ucdort.getText().toString().trim());
                        int p = Integer.parseInt(dortdort.getText().toString().trim());


                        int r = Integer.parseInt(birbes.getText().toString().trim());
                        int s = Integer.parseInt(ikibes.getText().toString().trim());
                        int t = Integer.parseInt(ucbes.getText().toString().trim());
                        int u = Integer.parseInt(dortbes.getText().toString().trim());

                        birbes.setVisibility(View.INVISIBLE);
                        ikibes.setVisibility(View.INVISIBLE);
                        ucbes.setVisibility(View.INVISIBLE);
                        dortbes.setVisibility(View.INVISIBLE);

                        besbir.setVisibility(View.VISIBLE);
                        besiki.setVisibility(View.VISIBLE);
                        besuc.setVisibility(View.VISIBLE);
                        besdort.setVisibility(View.VISIBLE);


                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));
                        birdort.setText(String.valueOf(d));
                        ikibir.setText(String.valueOf(e));
                        ikiiki.setText(String.valueOf(f));
                        ikiuc.setText(String.valueOf(g));
                        ikidort.setText(String.valueOf(h));
                        ucbir.setText(String.valueOf(i));
                        uciki.setText(String.valueOf(j));
                        ucuc.setText(String.valueOf(k));
                        ucdort.setText(String.valueOf(l));
                        dortbir.setText(String.valueOf(m));
                        dortiki.setText(String.valueOf(n));
                        dortuc.setText(String.valueOf(o));
                        dortdort.setText(String.valueOf(p));

                        besbir.setText(String.valueOf(r));
                        besiki.setText(String.valueOf(s));
                        besuc.setText(String.valueOf(t));
                        besdort.setText(String.valueOf(u));

                    } else if (str3 == 5 && stn3 == 1) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());
                        int d = Integer.parseInt(dortbir.getText().toString().trim());
                        int e = Integer.parseInt(besbir.getText().toString().trim());

                        ikibir.setVisibility(View.INVISIBLE);
                        ucbir.setVisibility(View.INVISIBLE);
                        dortbir.setVisibility(View.INVISIBLE);
                        besbir.setVisibility(View.INVISIBLE);

                        biriki.setVisibility(View.VISIBLE);
                        biruc.setVisibility(View.VISIBLE);
                        birdort.setVisibility(View.VISIBLE);
                        birbes.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));
                        birdort.setText(String.valueOf(d));
                        birbes.setText(String.valueOf(e));


                    } else if (str3 == 5 && stn3 == 2) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());
                        int d = Integer.parseInt(dortbir.getText().toString().trim());
                        int e = Integer.parseInt(besbir.getText().toString().trim());

                        int f = Integer.parseInt(biriki.getText().toString().trim());
                        int g = Integer.parseInt(ikiiki.getText().toString().trim());
                        int h = Integer.parseInt(uciki.getText().toString().trim());
                        int i = Integer.parseInt(dortiki.getText().toString().trim());
                        int j = Integer.parseInt(besiki.getText().toString().trim());


                        ucbir.setVisibility(View.INVISIBLE);
                        uciki.setVisibility(View.INVISIBLE);
                        dortbir.setVisibility(View.INVISIBLE);
                        dortiki.setVisibility(View.INVISIBLE);
                        besbir.setVisibility(View.INVISIBLE);
                        besiki.setVisibility(View.INVISIBLE);

                        biruc.setVisibility(View.VISIBLE);
                        birdort.setVisibility(View.VISIBLE);
                        birbes.setVisibility(View.VISIBLE);
                        ikiuc.setVisibility(View.VISIBLE);
                        ikidort.setVisibility(View.VISIBLE);
                        ikibes.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));
                        birdort.setText(String.valueOf(d));
                        birbes.setText(String.valueOf(e));

                        ikibir.setText(String.valueOf(f));
                        ikiiki.setText(String.valueOf(g));
                        ikiuc.setText(String.valueOf(h));
                        ikidort.setText(String.valueOf(i));
                        ikibes.setText(String.valueOf(j));


                    } else if (str3 == 5 && stn3 == 3) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());
                        int d = Integer.parseInt(dortbir.getText().toString().trim());
                        int e = Integer.parseInt(besbir.getText().toString().trim());

                        int f = Integer.parseInt(biriki.getText().toString().trim());
                        int g = Integer.parseInt(ikiiki.getText().toString().trim());
                        int h = Integer.parseInt(uciki.getText().toString().trim());
                        int i = Integer.parseInt(dortiki.getText().toString().trim());
                        int j = Integer.parseInt(besiki.getText().toString().trim());


                        int k = Integer.parseInt(biruc.getText().toString().trim());
                        int l = Integer.parseInt(ikiuc.getText().toString().trim());
                        int m = Integer.parseInt(ucuc.getText().toString().trim());
                        int n = Integer.parseInt(dortuc.getText().toString().trim());
                        int o = Integer.parseInt(besuc.getText().toString().trim());


                        dortuc.setVisibility(View.INVISIBLE);
                        besuc.setVisibility(View.INVISIBLE);
                        dortbir.setVisibility(View.INVISIBLE);
                        dortiki.setVisibility(View.INVISIBLE);
                        besbir.setVisibility(View.INVISIBLE);
                        besiki.setVisibility(View.INVISIBLE);

                        birdort.setVisibility(View.VISIBLE);
                        birbes.setVisibility(View.VISIBLE);
                        ikidort.setVisibility(View.VISIBLE);
                        ikibes.setVisibility(View.VISIBLE);
                        ucdort.setVisibility(View.VISIBLE);
                        ucbes.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));
                        birdort.setText(String.valueOf(d));
                        birbes.setText(String.valueOf(e));

                        ikibir.setText(String.valueOf(f));
                        ikiiki.setText(String.valueOf(g));
                        ikiuc.setText(String.valueOf(h));
                        ikidort.setText(String.valueOf(i));
                        ikibes.setText(String.valueOf(j));

                        ucbir.setText(String.valueOf(k));
                        uciki.setText(String.valueOf(l));
                        ucuc.setText(String.valueOf(m));
                        ucdort.setText(String.valueOf(n));
                        ucbes.setText(String.valueOf(o));

                    } else if (str3 == 5 && stn3 == 4) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());
                        int d = Integer.parseInt(dortbir.getText().toString().trim());
                        int e = Integer.parseInt(besbir.getText().toString().trim());

                        int f = Integer.parseInt(biriki.getText().toString().trim());
                        int g = Integer.parseInt(ikiiki.getText().toString().trim());
                        int h = Integer.parseInt(uciki.getText().toString().trim());
                        int i = Integer.parseInt(dortiki.getText().toString().trim());
                        int j = Integer.parseInt(besiki.getText().toString().trim());


                        int k = Integer.parseInt(biruc.getText().toString().trim());
                        int l = Integer.parseInt(ikiuc.getText().toString().trim());
                        int m = Integer.parseInt(ucuc.getText().toString().trim());
                        int n = Integer.parseInt(dortuc.getText().toString().trim());
                        int o = Integer.parseInt(besuc.getText().toString().trim());

                        int p = Integer.parseInt(birdort.getText().toString().trim());
                        int r = Integer.parseInt(ikidort.getText().toString().trim());
                        int s = Integer.parseInt(ucdort.getText().toString().trim());
                        int t = Integer.parseInt(dortdort.getText().toString().trim());
                        int u = Integer.parseInt(besdort.getText().toString().trim());

                        besuc.setVisibility(View.INVISIBLE);
                        besbir.setVisibility(View.INVISIBLE);
                        besiki.setVisibility(View.INVISIBLE);
                        besdort.setVisibility(View.INVISIBLE);

                        birbes.setVisibility(View.VISIBLE);
                        ikibes.setVisibility(View.VISIBLE);
                        ucbes.setVisibility(View.VISIBLE);
                        dortbes.setVisibility(View.VISIBLE);

                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));
                        birdort.setText(String.valueOf(d));
                        birbes.setText(String.valueOf(e));

                        ikibir.setText(String.valueOf(f));
                        ikiiki.setText(String.valueOf(g));
                        ikiuc.setText(String.valueOf(h));
                        ikidort.setText(String.valueOf(i));
                        ikibes.setText(String.valueOf(j));

                        ucbir.setText(String.valueOf(k));
                        uciki.setText(String.valueOf(l));
                        ucuc.setText(String.valueOf(m));
                        ucdort.setText(String.valueOf(n));
                        ucbes.setText(String.valueOf(o));

                        dortbir.setText(String.valueOf(p));
                        dortiki.setText(String.valueOf(r));
                        dortuc.setText(String.valueOf(s));
                        dortdort.setText(String.valueOf(t));
                        dortbes.setText(String.valueOf(u));

                    } else if (str3 == 5 && stn3 == 5) {

                        int b = Integer.parseInt(ikibir.getText().toString().trim());
                        int c = Integer.parseInt(ucbir.getText().toString().trim());
                        int d = Integer.parseInt(dortbir.getText().toString().trim());
                        int e = Integer.parseInt(besbir.getText().toString().trim());

                        int f = Integer.parseInt(biriki.getText().toString().trim());
                        int g = Integer.parseInt(ikiiki.getText().toString().trim());
                        int h = Integer.parseInt(uciki.getText().toString().trim());
                        int i = Integer.parseInt(dortiki.getText().toString().trim());
                        int j = Integer.parseInt(besiki.getText().toString().trim());

                        int k = Integer.parseInt(biruc.getText().toString().trim());
                        int l = Integer.parseInt(ikiuc.getText().toString().trim());
                        int m = Integer.parseInt(ucuc.getText().toString().trim());
                        int n = Integer.parseInt(dortuc.getText().toString().trim());
                        int o = Integer.parseInt(besuc.getText().toString().trim());

                        int p = Integer.parseInt(birdort.getText().toString().trim());
                        int r = Integer.parseInt(ikidort.getText().toString().trim());
                        int s = Integer.parseInt(ucdort.getText().toString().trim());
                        int t = Integer.parseInt(dortdort.getText().toString().trim());
                        int u = Integer.parseInt(besdort.getText().toString().trim());

                        int w = Integer.parseInt(birbes.getText().toString().trim());
                        int y = Integer.parseInt(ikibes.getText().toString().trim());
                        int z = Integer.parseInt(ucbes.getText().toString().trim());
                        int x = Integer.parseInt(dortbes.getText().toString().trim());
                        int q = Integer.parseInt(besbes.getText().toString().trim());

                        biriki.setText(String.valueOf(b));
                        biruc.setText(String.valueOf(c));
                        birdort.setText(String.valueOf(d));
                        birbes.setText(String.valueOf(e));

                        ikibir.setText(String.valueOf(f));
                        ikiiki.setText(String.valueOf(g));
                        ikiuc.setText(String.valueOf(h));
                        ikidort.setText(String.valueOf(i));
                        ikibes.setText(String.valueOf(j));

                        ucbir.setText(String.valueOf(k));
                        uciki.setText(String.valueOf(l));
                        ucuc.setText(String.valueOf(m));
                        ucdort.setText(String.valueOf(n));
                        ucbes.setText(String.valueOf(o));

                        dortbir.setText(String.valueOf(p));
                        dortiki.setText(String.valueOf(r));
                        dortuc.setText(String.valueOf(s));
                        dortdort.setText(String.valueOf(t));
                        dortbes.setText(String.valueOf(u));

                        besbir.setText(String.valueOf(w));
                        besiki.setText(String.valueOf(y));
                        besuc.setText(String.valueOf(z));
                        besdort.setText(String.valueOf(x));
                        besbes.setText(String.valueOf(q));


                    }


                    // commit please


                } catch (Exception e) {

                    Toast.makeText(AnaEkran.this, "İşlemi Konrol Ediniz", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
    public void islemler(View view){


        strTemp=satir.getText().toString();
        stnTemp=sutun.getText().toString();

        birbirTemp=birbir.getText().toString();
        birikiTemp=biriki.getText().toString();
        birucTemp=biruc.getText().toString();
        birdortTemp=birdort.getText().toString();
        birbesTemp=birbes.getText().toString();

        ikibirTemp=ikibir.getText().toString();
        ikiikiTemp=ikiiki.getText().toString();
        ikiucTemp=ikiuc.getText().toString();
        ikidortTemp=ikidort.getText().toString();
        ikibesTemp=ikibes.getText().toString();

        ucbirTemp=ucbir.getText().toString();
        ucikiTemp=uciki.getText().toString();
        ucucTemp=ucuc.getText().toString();
        ucdortTemp=ucdort.getText().toString();
        ucbesTemp=ucbes.getText().toString();

        dortbesTemp=dortbes.getText().toString();
        dortbirTemp=dortbir.getText().toString();
        dortikiTemp=dortiki.getText().toString();
        dortucTemp=dortuc.getText().toString();
        dortdortTemp=dortdort.getText().toString();

        besbirTemp=besbir.getText().toString();
        besikiTemp=besiki.getText().toString();
        besucTemp=besuc.getText().toString();
        besdortTemp=besdort.getText().toString();
        besbesTemp=besbes.getText().toString();

     Intent intent =new Intent(AnaEkran.this,activity2.class);
        intent.putExtra("11",birbirTemp);
        intent.putExtra("12",birikiTemp);
        intent.putExtra("13",birucTemp);
        intent.putExtra("14",birdortTemp);
        intent.putExtra("15",birbesTemp);

        intent.putExtra("ikibir",ikibirTemp);
        intent.putExtra("ikiiki",ikiikiTemp);
        intent.putExtra("ikiuc",ikiucTemp);
        intent.putExtra("ikidort",ikidortTemp);
        intent.putExtra("ikibes",ikibesTemp);

        intent.putExtra("31",ucbirTemp);
        intent.putExtra("32",ucikiTemp);
        intent.putExtra("33",ucucTemp);
        intent.putExtra("34",ucdortTemp);
        intent.putExtra("35",ucbesTemp);

        intent.putExtra("41",dortbirTemp);
        intent.putExtra("42",dortikiTemp);
        intent.putExtra("43",dortucTemp);
        intent.putExtra("44",dortdortTemp);
        intent.putExtra("45",dortbesTemp);

        intent.putExtra("51",besbirTemp);
        intent.putExtra("52",besikiTemp);
        intent.putExtra("53",besucTemp);
        intent.putExtra("54",besdortTemp);
        intent.putExtra("55",besbesTemp);

        intent.putExtra("str",strTemp);
        intent.putExtra("stn",stnTemp);

     startActivity(intent);


    }

}
