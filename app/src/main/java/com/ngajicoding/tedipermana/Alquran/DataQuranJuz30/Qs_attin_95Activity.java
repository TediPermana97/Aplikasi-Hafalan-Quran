package com.ngajicoding.tedipermana.Alquran.DataQuranJuz30;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ngajicoding.tedipermana.DataQuiz.QuizJuz30.AttinQuizActivity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almuddasir_74Activity;
import com.ngajicoding.tedipermana.R;

import java.io.IOException;

public class Qs_attin_95Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qs_attin_95);
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/95_attin%2F95_surah_attin_1.mp3?alt=media&token=1a69ba10-db12-4fb5-add0-6cefc5fe0ff0");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/95_attin%2F95_surah_attin_2.mp3?alt=media&token=1c226a13-3578-4e1b-b09b-463666ac397e");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/95_attin%2F95_surah_attin_3.mp3?alt=media&token=8fb822f5-a910-4f48-a243-a68f0a5e7ed2");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/95_attin%2F95_surah_attin_4.mp3?alt=media&token=5035a781-dbf2-4daf-abbb-892a4a20192b");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/95_attin%2F95_surah_attin_5.mp3?alt=media&token=6bd61409-aa08-4427-90ae-050fe08f86bc");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/95_attin%2F95_surah_attin_6.mp3?alt=media&token=357a07fb-0471-4f28-9823-28829241aace");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/95_attin%2F95_surah_attin_7.mp3?alt=media&token=44ae962a-061c-44b3-891a-c686a2892892");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/95_attin%2F95_surah_attin_8.mp3?alt=media&token=c1dcb276-4d68-4e93-93d2-c93df1b9d863");
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
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/95_attin%2F95%20surah%20at%20tin.mp3?alt=media&token=e5cd8fc9-4f53-4308-98e6-e2f828189ff0");
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
                Intent pindah = new Intent(Qs_attin_95Activity.this, AttinQuizActivity.class);
                startActivity(pindah);
            }
        });
        alertDialogBuilder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Qs_attin_95Activity.this, "Anda Menekan Tombol No", Toast.LENGTH_SHORT).show();
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
