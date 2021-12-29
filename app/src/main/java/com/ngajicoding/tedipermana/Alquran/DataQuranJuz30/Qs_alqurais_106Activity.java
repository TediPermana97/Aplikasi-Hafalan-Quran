package com.ngajicoding.tedipermana.Alquran.DataQuranJuz30;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ngajicoding.tedipermana.DataQuiz.QuizJuz30.AlquraishQuizActivity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almuddasir_74Activity;
import com.ngajicoding.tedipermana.R;

import java.io.IOException;

public class Qs_alqurais_106Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qs_alqurais_106);
    }
    public void openRegister(View view) {
        Intent i = new Intent(this, Qs_almuddasir_74Activity.class);
        startActivity(i);
    }

    public void openLogin(View view) {
        Intent i = new Intent(this, Qs_almuddasir_74Activity.class);
        startActivity(i);
    }

    public void play_song1(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/106_quraish%2F106_surah_quraisi1.mp3?alt=media&token=ffaf2116-b330-49f3-8d80-9dfb131a9396");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });

            mediaPlayer.prepare();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void play_song2(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/106_quraish%2F106_surah_quraisi2.mp3?alt=media&token=342d2a72-f228-4aab-bf7f-0025174d1214");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });

            mediaPlayer.prepare();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void play_song3(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/106_quraish%2F106_surah_quraisi3.mp3?alt=media&token=3b892835-d9ce-4856-af1c-49e383e8f3ec");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });

            mediaPlayer.prepare();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void play_song4(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/106_quraish%2F106_surah_quraisi4.mp3?alt=media&token=e0e1dc94-f6cf-4d15-a3fb-f8c3c0b0b0f9");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });

            mediaPlayer.prepare();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void play_song5(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/106_quraish%2F106_surahquraisi.mp3?alt=media&token=a9cfd09e-7cee-4c9c-a614-5a1735b2b875");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });

            mediaPlayer.prepare();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    //untuk menampilkan alerdialog

    public void next(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        //Setting Alert Dialog Judul
        alertDialogBuilder.setTitle("Confirmasi Evaluasi Hafalan Al-Qur'an..!!!");
        // Setting Alert Dialog Pesan
        alertDialogBuilder.setMessage("Apakah Anda Yakin, Ingin Evaluasi Hafalan Al-Qur'an ..??");

        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                finish();
                Intent pindah = new Intent(Qs_alqurais_106Activity.this, AlquraishQuizActivity.class);
                startActivity(pindah);
            }
        });
        alertDialogBuilder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Qs_alqurais_106Activity.this, "Anda Menekan Tombol No", Toast.LENGTH_SHORT).show();
            }

        });
        alertDialogBuilder.setNeutralButton("Kembali", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol Cancel", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
}
}
