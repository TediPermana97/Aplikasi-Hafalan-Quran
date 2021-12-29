package com.ngajicoding.tedipermana.Aktipitas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ngajicoding.tedipermana.R;

public class InfaqActivity extends AppCompatActivity {
    public Button v_call_Button1;
    public Intent myIntent;
    public String type, text, toNumber, nama_ustad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infaq);

        v_call_Button1 = (Button)findViewById(R.id.friend_1);

        v_call_Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama_ustad = "";
                text       = "Pesan dari goTahfidz (Donasi) \n\nAssalamualaikum Wr.Wb"+nama_ustad+", Nama :                             " + "Alamat :                                      " + "Jenis Kelamin :                             " + "Jumlah Infaq  :                             " + "Keterangan :                             " + "Wassalamualaikum Wr.Wb";
                toNumber   = "6285269428612";
                openWhatsApp(text, toNumber);
            }
        });

    }

    // Open Whatsap to specific Number
    public void openWhatsApp(String text, String toNumber){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text+type));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
