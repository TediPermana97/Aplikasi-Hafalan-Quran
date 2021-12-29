package com.ngajicoding.tedipermana.Setoran.SetoranSabqi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ngajicoding.tedipermana.ModelCrud.MainActivity;
import com.ngajicoding.tedipermana.Qs_Alhaqqah_2Activity;
import com.ngajicoding.tedipermana.R;
import com.ngajicoding.tedipermana.Setoran_HafalanActivity;
import com.ngajicoding.tedipermana.VideoChatViewActivity;

public class SabqiActivity extends AppCompatActivity {

    Button crud,video,setoran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabqi);

        Button crud = (Button)findViewById(R.id.crud);
        Button video = (Button)findViewById(R.id.video);

        crud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(SabqiActivity.this, MainActivity.class);
                startActivity(pindah);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(SabqiActivity.this, VideoChatViewActivity.class);
                startActivity(pindah);
            }
        });

        setoran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(SabqiActivity.this, Setoran_HafalanActivity.class);
                startActivity(pindah);
            }
        });
    }
}
