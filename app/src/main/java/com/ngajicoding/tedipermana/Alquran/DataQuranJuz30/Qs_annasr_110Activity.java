package com.ngajicoding.tedipermana.Alquran.DataQuranJuz30;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ngajicoding.tedipermana.DataQuiz.QuizJuz30.AnnasrQuizActivity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almuddasir_74Activity;
import com.ngajicoding.tedipermana.R;

import java.io.IOException;

public class Qs_annasr_110Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qs_annasr_110);
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/110_annashr%2F110_surahannasr_1.mp3?alt=media&token=e4cb5225-e417-40c1-9b89-888f124c1cf6");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/110_annashr%2F110_surahannasr_2.mp3?alt=media&token=36d975af-b043-4c16-9f66-34036fa939aa");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/110_annashr%2F110_surahannasr_3.mp3?alt=media&token=3409d05c-3c45-47ff-948f-1410db0570d8");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/110_annashr%2F110_surahannasr.mp3?alt=media&token=97fbcf82-98e0-49c1-96f9-643e455c5bda");
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

    public void next(View view) {
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
                Intent pindah = new Intent(Qs_annasr_110Activity.this, AnnasrQuizActivity.class);
                startActivity(pindah);
            }
        });
        alertDialogBuilder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Qs_annasr_110Activity.this, "Anda Menekan Tombol No", Toast.LENGTH_SHORT).show();
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
