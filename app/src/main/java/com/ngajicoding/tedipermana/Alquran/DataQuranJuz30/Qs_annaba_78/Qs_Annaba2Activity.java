package com.ngajicoding.tedipermana.Alquran.DataQuranJuz30.Qs_annaba_78;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ngajicoding.tedipermana.R;

import java.io.IOException;

public class Qs_Annaba2Activity extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qs__annaba2);

        btn1 = (Button)findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Qs_Annaba2Activity.this, Qs_Annaba3Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
    }
    public void play_song11(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba11.mp3?alt=media&token=de4edac4-dd2e-4115-ba43-3f1fcfa32c97");
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

    public void play_song12(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba12.mp3?alt=media&token=03750665-9ea4-41cd-9392-dace64d54628");
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

    public void play_song13(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba13.mp3?alt=media&token=1ae07dce-9c38-449d-adcd-c51d4eba578a");
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

    public void play_song14(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba14.mp3?alt=media&token=a303f29a-47d0-4250-acf0-a9426acb34d8");
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

    public void play_song15(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba15.mp3?alt=media&token=c7c4d189-28f7-4407-afa1-9db272cfd986");
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

    public void play_song16(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba16.mp3?alt=media&token=428cc36d-d807-4fc0-a7c4-5e1cedbd9340");
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

    public void play_song17(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba17.mp3?alt=media&token=3599f31a-e92d-45c1-bd95-710a844b6704");
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

    public void play_song18(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba18.mp3?alt=media&token=904c88ee-1816-49f1-8308-b1841f15a44a");
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

    public void play_song19(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba19.mp3?alt=media&token=c18b3ce0-36d8-4151-a070-ce94a217d6a0");
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

    public void play_song20(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/78_annaba%2F78_annaba20.mp3?alt=media&token=ac8542ff-ed99-4bb5-a5c9-2a2ed520caae");
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

}
