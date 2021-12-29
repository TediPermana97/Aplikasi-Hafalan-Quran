package com.ngajicoding.tedipermana.Musyawarah;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.ngajicoding.tedipermana.Musyawarah.ChatActivity;
import com.ngajicoding.tedipermana.Musyawarah.KontakActivity;
import com.ngajicoding.tedipermana.Musyawarah.Pesan.PesanWhatsAppActivity;
import com.ngajicoding.tedipermana.R;
import com.ngajicoding.tedipermana.Ustad_ProfilActivity;

public class ObrolanActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrolan);

    }
    public void onClickAlarm(View v){
        Intent i = new Intent(this,PesanWhatsAppActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClickJdwlsolat(View v){
        Intent i = new Intent(this,Ustad_ProfilActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true; //Membuat fungsi menu
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //Disini baru membuat menu inflatternya
        switch (item.getItemId()){
            case R.id.quit: //apabila yg dipilih quit maka ia akan keluar dr apk
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Anda yakin ingin kembali ?"); // memunculkan pilihan
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog quit = builder.create();
                quit.show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() { //membuat fungsi klik back,maka akan keluar
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Anda yakin ingin Kembali ?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog quit = builder.create();
        quit.show();
    }
}
