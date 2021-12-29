package com.ngajicoding.tedipermana.Dasboard.HomeUstad;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.ngajicoding.tedipermana.AboutActivity;
import com.ngajicoding.tedipermana.Aktipitas.AktifitasActivity;
import com.ngajicoding.tedipermana.Alquran.AlquranActivity;
import com.ngajicoding.tedipermana.Profile.MyProfileUstad.MyProfileActivity;
import com.ngajicoding.tedipermana.Setoran.Hafalan.HafalanActivity;
import com.ngajicoding.tedipermana.Musyawarah.KontakActivity;
import com.ngajicoding.tedipermana.Musyawarah.ObrolanActivity;
import com.ngajicoding.tedipermana.Profile.ProfilActivity;
import com.ngajicoding.tedipermana.R;
import com.ngajicoding.tedipermana.Setoran_HafalanActivity;


public class Home_UstadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__ustad);
    }
    public void onClickProfil(View v){
        Intent i = new Intent(this,MyProfileActivity.class);
        startActivity(i); // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickPesan
    }

    public void onClickAlquran(View v){
        Intent i = new Intent(this,AlquranActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClickInputSetoran(View v){
        Intent i = new Intent(this,Setoran_HafalanActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClickObrolan(View v){
        Intent i = new Intent(this,AktifitasActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClickKontak(View v){
        Intent i = new Intent(this,KontakActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClickAbout(View v){
        Intent i = new Intent(this,AboutActivity.class);
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
            case R.id.about: //Jika yang diklik about maka ke profil activity About
                Intent about = new Intent(this,ProfilActivity.class);
                startActivity(about);
                break;
            case R.id.order: //Jika yang diklik order maka ke profil activity order
                Intent order = new Intent(this,AktifitasActivity.class);
                startActivity(order);
                break;
            case R.id.topMenu:
                Intent menu = new Intent(this,HafalanActivity.class);
                startActivity(menu);
                break;
            case R.id.quit: //apabila yg dipilih quit maka ia akan keluar dr apk
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Anda yakin ingin keluar ?"); // memunculkan pilihan
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
        builder.setTitle("Anda yakin ingin keluar ?");
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
