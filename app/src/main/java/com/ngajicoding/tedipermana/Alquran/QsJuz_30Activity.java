package com.ngajicoding.tedipermana.Alquran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_abasa_80Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_adhuha_93Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_aladiyat_100Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alala_87Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alalaq_96Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alasr_103Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_albalad_90Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_albayinah_98Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alburuj_85Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alfajr_89Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alfalaq_113Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alfil_105Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_algasyiyah_88Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_aliklas_112Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alinfitar_82Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alinsyiqaq_84Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alinsyirah_94Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alkautsar_108Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alkqfirun_109Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_allahab_111Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_allail_92Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_almaun_107Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_almuthafifin_83Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alqadr_97Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alqariah_101Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alqurais_106Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_alzalzalah_99Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_annaba_78Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_annas_114Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_annasr_110Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_annaziat_79Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_asysyams_91Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_attakwir_81Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_attariq_86Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_attin_95Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_attkasur_102Activity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_qlhumazah_104Activity;
import com.ngajicoding.tedipermana.R;

public class QsJuz_30Activity extends AppCompatActivity {
    Button btn1,btn2,btn3, btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21;
    Button btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qs_juz_30);

        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_annaba_78Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn2 = (Button)findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_annaziat_79Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn3 = (Button)findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_abasa_80Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn4 = (Button)findViewById(R.id.btn4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_attakwir_81Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn5 = (Button)findViewById(R.id.btn5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alinfitar_82Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn6 = (Button)findViewById(R.id.btn6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_almuthafifin_83Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn7 = (Button)findViewById(R.id.btn7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alinsyiqaq_84Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn8 = (Button)findViewById(R.id.btn8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alburuj_85Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn9 = (Button)findViewById(R.id.btn9);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_attariq_86Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn10 = (Button)findViewById(R.id.btn10);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alala_87Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn11 = (Button)findViewById(R.id.btn11);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_algasyiyah_88Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn12 = (Button)findViewById(R.id.btn12);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alfajr_89Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn13 = (Button)findViewById(R.id.btn13);

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_albalad_90Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn14 = (Button)findViewById(R.id.btn14);

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_asysyams_91Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn15 = (Button)findViewById(R.id.btn15);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_allail_92Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn16 = (Button)findViewById(R.id.btn16);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_adhuha_93Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn17 = (Button)findViewById(R.id.btn17);

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alinsyirah_94Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn18 = (Button)findViewById(R.id.btn18);

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_attin_95Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn19 = (Button)findViewById(R.id.btn19);

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alalaq_96Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn20 = (Button)findViewById(R.id.btn20);

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alqadr_97Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn21 = (Button)findViewById(R.id.btn21);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_albayinah_98Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn22 = (Button)findViewById(R.id.btn22);

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alzalzalah_99Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn23 = (Button)findViewById(R.id.btn23);

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_aladiyat_100Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn24 = (Button)findViewById(R.id.btn24);

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alqariah_101Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn25 = (Button)findViewById(R.id.btn25);

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_attkasur_102Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn26 = (Button)findViewById(R.id.btn26);

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alasr_103Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn27 = (Button)findViewById(R.id.btn27);

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_qlhumazah_104Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn28 = (Button)findViewById(R.id.btn28);

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alfil_105Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn29 = (Button)findViewById(R.id.btn29);

        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alqurais_106Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn30 = (Button)findViewById(R.id.btn30);

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_almaun_107Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn31 = (Button)findViewById(R.id.btn31);

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alkautsar_108Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn32 = (Button)findViewById(R.id.btn32);

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alkqfirun_109Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn33 = (Button)findViewById(R.id.btn33);

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_annasr_110Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn34 = (Button)findViewById(R.id.btn34);

        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_allahab_111Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn35 = (Button)findViewById(R.id.btn35);

        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_aliklas_112Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn36 = (Button)findViewById(R.id.btn36);

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_alfalaq_113Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn37 = (Button)findViewById(R.id.btn37);

        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(QsJuz_30Activity.this, Qs_annas_114Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
































    }
}
