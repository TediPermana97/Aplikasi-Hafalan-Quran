package com.ngajicoding.tedipermana.Alquran.DataQuranJuz30;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ngajicoding.tedipermana.DataQuiz.QuizJuz30.AlzalzalahQuizActivity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almuddasir_74Activity;
import com.ngajicoding.tedipermana.R;

import java.io.IOException;

public class Qs_alzalzalah_99Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qs_alzalzalah_99);
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/99_alzalzalah%2F99_surah_azzalzalah_1.mp3?alt=media&token=eef7e2a3-70fd-49a0-9840-be4664fb79be");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/99_alzalzalah%2F99_surah_azzalzalah_2.mp3?alt=media&token=fa264ed8-dbcd-4e6c-90c6-04ce4ae65fc4");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/99_alzalzalah%2F99_surah_azzalzalah_3.mp3?alt=media&token=9c670e95-6e15-48ce-a1af-06a56cf29646");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/99_alzalzalah%2F99_surah_azzalzalah_4.mp3?alt=media&token=fcd31b2b-bd08-46bf-b5ab-d319ffd1a68a");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/99_alzalzalah%2F99_surah_azzalzalah_5.mp3?alt=media&token=135b73d4-d8ac-4fdc-9125-d1100ed08d8f");
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

    public void play_song6(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/99_alzalzalah%2F99_surah_azzalzalah_6.mp3?alt=media&token=3ae650e0-88f5-4e71-9bbc-7bd8ffc8d7de");
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

    public void play_song7(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/99_alzalzalah%2F99_surah_azzalzalah_7.mp3?alt=media&token=33af5c6f-e212-44de-8a86-5bd5ac882c3d");
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

    public void play_song8(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/99_alzalzalah%2F99_surah_azzalzalah_8.mp3?alt=media&token=2de950f8-c401-4ede-b8ad-89888e59b097");
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

    public void play_song9(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/99_alzalzalah%2F99_surah_azzalzalah.mp3?alt=media&token=367235e7-f1ab-42b8-9c5a-6231aef0cc8b");
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
                Intent pindah = new Intent(Qs_alzalzalah_99Activity.this, AlzalzalahQuizActivity.class);
                startActivity(pindah);
            }
        });
        alertDialogBuilder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Qs_alzalzalah_99Activity.this, "Anda Menekan Tombol No", Toast.LENGTH_SHORT).show();
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
