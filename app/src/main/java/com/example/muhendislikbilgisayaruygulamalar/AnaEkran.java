package com.example.muhendislikbilgisayaruygulamalar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.math.MathUtils;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnaEkran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);


        //***---Satir ve sutun textfieldlari---***

        final EditText satir = (EditText) findViewById(R.id.satirText);
        final EditText sutun = (EditText) findViewById(R.id.sutunText);

        //***---Kutulari programin basinda kapatir---***

        final EditText birbir = (EditText) findViewById(R.id.editText14);
        birbir.setVisibility(View.INVISIBLE);

        final EditText biriki = (EditText) findViewById(R.id.editText);
        biriki.setVisibility(View.INVISIBLE);

        final EditText biruc = (EditText) findViewById(R.id.editText2);
        biruc.setVisibility(View.INVISIBLE);

        final EditText birdort = (EditText) findViewById(R.id.editText4);
        birdort.setVisibility(View.INVISIBLE);

        final EditText birbes = (EditText) findViewById(R.id.editText5);
        birbes.setVisibility(View.INVISIBLE);

        final EditText ikibir = (EditText) findViewById(R.id.editText6);
        ikibir.setVisibility(View.INVISIBLE);

        final EditText ikiiki = (EditText) findViewById(R.id.editText7);
        ikiiki.setVisibility(View.INVISIBLE);

        final EditText ikiuc = (EditText) findViewById(R.id.editText8);
        ikiuc.setVisibility(View.INVISIBLE);

        final EditText ikidort = (EditText) findViewById(R.id.editText9);
        ikidort.setVisibility(View.INVISIBLE);

        final EditText ikibes = (EditText) findViewById(R.id.editText10);
        ikibes.setVisibility(View.INVISIBLE);

        final EditText ucbir = (EditText) findViewById(R.id.editText11);
        ucbir.setVisibility(View.INVISIBLE);

        final EditText uciki = (EditText) findViewById(R.id.editText12);
        uciki.setVisibility(View.INVISIBLE);

        final EditText ucuc = (EditText) findViewById(R.id.editText13);
        ucuc.setVisibility(View.INVISIBLE);

        final EditText ucdort = (EditText) findViewById(R.id.editText3);
        ucdort.setVisibility(View.INVISIBLE);

        final EditText ucbes = (EditText) findViewById(R.id.editText15);
        ucbes.setVisibility(View.INVISIBLE);

        final EditText dortbir = (EditText) findViewById(R.id.editText16);
        dortbir.setVisibility(View.INVISIBLE);

        final EditText dortiki = (EditText) findViewById(R.id.editText17);
        dortiki.setVisibility(View.INVISIBLE);

        final EditText dortuc = (EditText) findViewById(R.id.editText18);
        dortuc.setVisibility(View.INVISIBLE);

        final EditText dortdort = (EditText) findViewById(R.id.editText19);
        dortdort.setVisibility(View.INVISIBLE);

        final EditText dortbes = (EditText) findViewById(R.id.editText20);
        dortbes.setVisibility(View.INVISIBLE);

        final EditText besbir = (EditText) findViewById(R.id.editText21);
        besbir.setVisibility(View.INVISIBLE);

        final EditText besiki = (EditText) findViewById(R.id.editText22);
        besiki.setVisibility(View.INVISIBLE);

        final EditText besuc = (EditText) findViewById(R.id.editText23);
        besuc.setVisibility(View.INVISIBLE);

        final EditText besdort = (EditText) findViewById(R.id.editText24);
        besdort.setVisibility(View.INVISIBLE);

        final EditText besbes = (EditText) findViewById(R.id.editText25);
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

                final int str = Integer.parseInt(satir.getText().toString().trim());
                final int stn = Integer.parseInt(sutun.getText().toString().trim());

                if(str > 5 || stn > 5) {

                    Toast.makeText(AnaEkran.this, "Satir veya sutun 5'den buyuk olamaz!", Toast.LENGTH_SHORT).show();

                }

                else {

                    if(a1 <= str && a2 <= stn) {
                        birbir.setVisibility(View.VISIBLE);
                    }
                    else {
                        birbir.setVisibility(View.INVISIBLE);
                    }

                    if(b1 <= str && b2 <= stn) {
                        biriki.setVisibility(View.VISIBLE);
                    }
                    else {
                        biriki.setVisibility(View.INVISIBLE);
                    }

                    if(c1 <= str && c2 <= stn) {
                        biruc.setVisibility(View.VISIBLE);
                    }
                    else {
                        biruc.setVisibility(View.INVISIBLE);
                    }

                    if(d1 <= str && d2 <= stn) {
                        birdort.setVisibility(View.VISIBLE);
                    }
                    else {
                        birdort.setVisibility(View.INVISIBLE);
                    }

                    if(e1 <= str && e2 <= stn) {
                        birbes.setVisibility(View.VISIBLE);
                    }
                    else {
                        birbes.setVisibility(View.INVISIBLE);
                    }

                    if(f1 <= str && f2 <= stn) {
                        ikibir.setVisibility(View.VISIBLE);
                    }
                    else {
                        ikibir.setVisibility(View.INVISIBLE);
                    }

                    if(g1 <= str && g2 <= stn) {
                        ikiiki.setVisibility(View.VISIBLE);
                    }
                    else {
                        ikiiki.setVisibility(View.INVISIBLE);
                    }

                    if(i1 <= str && i2 <= stn) {
                        ikiuc.setVisibility(View.VISIBLE);
                    }
                    else {
                        ikiuc.setVisibility(View.INVISIBLE);
                    }

                    if(j1 <= str && j2 <= stn) {
                        ikidort.setVisibility(View.VISIBLE);
                    }
                    else {
                        ikidort.setVisibility(View.INVISIBLE);
                    }

                    if(k1 <= str && k2 <= stn) {
                        ikibes.setVisibility(View.VISIBLE);
                    }
                    else {
                        ikibes.setVisibility(View.INVISIBLE);
                    }

                    if(l1 <= str && l2 <= stn) {
                        ucbir.setVisibility(View.VISIBLE);
                    }
                    else {
                        ucbir.setVisibility(View.INVISIBLE);
                    }

                    if(m1 <= str && m2 <= stn) {
                        uciki.setVisibility(View.VISIBLE);
                    }
                    else {
                        uciki.setVisibility(View.INVISIBLE);
                    }

                    if(n1 <= str && n2 <= stn) {
                        ucuc.setVisibility(View.VISIBLE);
                    }
                    else {
                        ucuc.setVisibility(View.INVISIBLE);
                    }

                    if(o1 <= str && o2 <= stn) {
                        ucdort.setVisibility(View.VISIBLE);
                    }
                    else {
                        ucdort.setVisibility(View.INVISIBLE);
                    }

                    if(p1 <= str && p2 <= stn) {
                        ucbes.setVisibility(View.VISIBLE);
                    }
                    else {
                        ucbes.setVisibility(View.INVISIBLE);
                    }

                    if(r1 <= str && r2 <= stn) {
                        dortbir.setVisibility(View.VISIBLE);
                    }
                    else {
                        dortbir.setVisibility(View.INVISIBLE);
                    }

                    if(s1 <= str && s2 <= stn) {
                        dortiki.setVisibility(View.VISIBLE);
                    }
                    else {
                        dortiki.setVisibility(View.INVISIBLE);
                    }

                    if(t1 <= str && t2 <= stn) {
                        dortuc.setVisibility(View.VISIBLE);
                    }
                    else {
                        dortuc.setVisibility(View.INVISIBLE);
                    }

                    if(u1 <= str && u2 <= stn) {
                        dortdort.setVisibility(View.VISIBLE);
                    }
                    else {
                        dortdort.setVisibility(View.INVISIBLE);
                    }

                    if(z1 <= str && z2 <= stn) {
                        dortbes.setVisibility(View.VISIBLE);
                    }
                    else {
                        dortbes.setVisibility(View.INVISIBLE);
                    }

                    if(x1 <= str && x2 <= stn) {
                        besbir.setVisibility(View.VISIBLE);
                    }
                    else {
                        besbir.setVisibility(View.INVISIBLE);
                    }

                    if(q1 <= str && q2 <= stn) {
                        besiki.setVisibility(View.VISIBLE);
                    }
                    else {
                        besiki.setVisibility(View.INVISIBLE);
                    }

                    if(w1 <= str && w2 <= stn) {
                        besuc.setVisibility(View.VISIBLE);
                    }
                    else {
                        besuc.setVisibility(View.INVISIBLE);
                    }

                    if(v1 <= str && v2 <= stn) {
                        besdort.setVisibility(View.VISIBLE);
                    }
                    else {
                        besdort.setVisibility(View.INVISIBLE);
                    }

                    if(mer1 <= str && mer2 <= stn) {
                        besbes.setVisibility(View.VISIBLE);
                    }
                    else {
                        besbes.setVisibility(View.INVISIBLE);
                    }

                }


            }
        });


        final List<Integer> integerList = new ArrayList<Integer>();

        final Button hesapla = (Button) findViewById(R.id.hesapla);
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(birbir.getText()) == false) { //bos mu dolu mu kontrolu
                    integerList.add(Integer.parseInt(birbir.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(biriki.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(biruc.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(birdort.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(birbes.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(ikibir.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(ikiiki.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(ikiuc.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(ikidort.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(ikibes.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(ucbir.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(uciki.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(ucuc.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(ucdort.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(ucbes.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(dortbir.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(dortiki.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(dortuc.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(dortdort.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(dortbes.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(besbir.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(besiki.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(besuc.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(besdort.getText().toString()));
                }

                if(TextUtils.isEmpty(birbir.getText()) == false) {
                    integerList.add(Integer.parseInt(besbes.getText().toString()));
                }

                /*
                int sum = 0;
                for(int sayac = 0; sayac < integerList.size(); sayac++) {
                    sum += integerList.get(sayac);
                } */

                Toast.makeText(AnaEkran.this, Arrays.toString(integerList.toArray()), Toast.LENGTH_SHORT).show();

            }
        });




    }
}
