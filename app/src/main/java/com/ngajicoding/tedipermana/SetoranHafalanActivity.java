package com.ngajicoding.tedipermana;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



public class SetoranHafalanActivity extends AppCompatActivity {

    public Button v_call_Button1, v_call_Button2, v_call_Button3, v_call_Button4;
    public Intent myIntent;
    public String type, text, toNumber, nama_ustad;

    public RadioButton rb_sabqi, rb_sabaq, rb_manzil;

    public RadioGroup setoranhafalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setoran_hafalan);

        rb_sabaq  = (RadioButton) findViewById(R.id.rb_sabaq);
        rb_sabqi  = (RadioButton) findViewById(R.id.rb_sabqi);
        rb_manzil = (RadioButton) findViewById(R.id.rb_manzil);

        v_call_Button1 = (Button)findViewById(R.id.friend_1);
        v_call_Button2 = (Button)findViewById(R.id.friend_2);
        v_call_Button3 = (Button)findViewById(R.id.friend_3);
        v_call_Button4 = (Button)findViewById(R.id.friend_4);

        v_call_Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama_ustad = "Suratno";
                text       = "Pesan dari goTahfidz\n\nAssalamualaikum Ustad "+nama_ustad+", saya ingin setoran hafalan saat ini. Apakah saya bisa setoran melalui video call sekarang? Wassalamualaikum";
                toNumber   = "6281279450924";
                openWhatsApp(text, toNumber);
            }
        });

        v_call_Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama_ustad = "Zakaria";
                text       = "Pesan dari goTahfidz\n\nAssalamualaikum Ustad "+nama_ustad+", saya ingin setoran hafalan saat ini. Apakah saya bisa setoran melalui video call sekarang? Wassalamualaikum";
                toNumber   = "6285708997189";
                openWhatsApp(text, toNumber);
            }
        });

        v_call_Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama_ustad = "Syafi'udin";
                text       = "Pesan dari goTahfidz\n\nAssalamualaikum Ustad "+nama_ustad+", saya ingin setoran hafalan saat ini. Apakah saya bisa setoran melalui video call sekarang? Wassalamualaikum";
                toNumber   = "628127915346";
                openWhatsApp(text, toNumber);
            }
        });

        v_call_Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama_ustad = "Musthofa Ahmad";
                text       = "Pesan dari goTahfidz\n\nAssalamualaikum Ustad "+nama_ustad+", saya ingin setoran hafalan saat ini. Apakah saya bisa setoran melalui video call sekarang? Wassalamualaikum";
                toNumber   = "6281294401871";
                openWhatsApp(text, toNumber);
            }
        });

        addListenerOnButton();

    }

    public void addListenerOnButton() {

        setoranhafalan = (RadioGroup) findViewById(R.id.setoranhafalan);
        int selectedId = setoranhafalan.getCheckedRadioButtonId();

    }

    // Open Whatsap to specific Number
    public void openWhatsApp(String text, String toNumber){
        try {

            if (rb_sabaq.isChecked()){
                Toast.makeText(this, "Sabaq", Toast.LENGTH_SHORT).show();
                type = "\n\n*Setoran Hafalan Sabaq*";
            }else if (rb_sabqi.isChecked()){
                Toast.makeText(this, "Sabqi", Toast.LENGTH_SHORT).show();
                type = "\n\n*Setoran Hafalan Sabqi*";
            }else if (rb_manzil.isChecked()){
                Toast.makeText(this, "Manzil", Toast.LENGTH_SHORT).show();
                type = "\n\n*Setoran Hafalan Manzil*";
            }

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text+type));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
