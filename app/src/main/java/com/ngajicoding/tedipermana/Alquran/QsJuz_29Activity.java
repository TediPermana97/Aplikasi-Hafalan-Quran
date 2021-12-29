package com.ngajicoding.tedipermana.Alquran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_alhaqah_69Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_alinsan_76Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_aljin_72Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almaarij_70Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almuddasir_74Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almulk_67Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almursalat_77Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almuzzammil_73Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_alqallam_68Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_alqiyamah_75Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_nuh_71Activity;
import com.ngajicoding.tedipermana.R;

public class QsJuz_29Activity extends AppCompatActivity {

    Button btn1,btn2, btn3, btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qs_juz_29);

      btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_almulk_67Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn2 = (Button)findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_alqallam_68Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn3 = (Button)findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_alhaqah_69Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn4 = (Button)findViewById(R.id.btn4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_almaarij_70Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn5 = (Button)findViewById(R.id.btn5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_nuh_71Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn6 = (Button)findViewById(R.id.btn6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_aljin_72Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn7 = (Button)findViewById(R.id.btn7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_almuzzammil_73Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn8 = (Button)findViewById(R.id.btn8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_almuddasir_74Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn9 = (Button)findViewById(R.id.btn9);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_alqiyamah_75Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn10 = (Button)findViewById(R.id.btn10);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_alinsan_76Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn11 = (Button)findViewById(R.id.btn11);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_29Activity.this, Qs_almursalat_77Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
    }
}
