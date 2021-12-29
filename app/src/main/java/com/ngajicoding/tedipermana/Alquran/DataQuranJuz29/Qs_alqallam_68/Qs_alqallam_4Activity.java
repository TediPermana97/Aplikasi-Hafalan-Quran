package com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_alqallam_68;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ngajicoding.tedipermana.R;

import java.io.IOException;

public class Qs_alqallam_4Activity extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qs_alqallam_4);

        btn1 = (Button)findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Qs_alqallam_4Activity.this, Qs_alqallam_5Activity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
    }

    public void play_song31(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam31.mp3?alt=media&token=c6979a08-1f9b-49eb-9633-d10ddc681499");
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

    public void play_song32(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam32.mp3?alt=media&token=ff206770-dbd4-42d2-95dc-3f5c7aca7ee5");
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

    public void play_song33(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam33.mp3?alt=media&token=83436b35-ed64-4b56-96a8-619909f6205f");
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

    public void play_song34(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam34.mp3?alt=media&token=7dfd7986-84ad-4e33-8b20-77963cb5ea05");
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

    public void play_song35(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam35.mp3?alt=media&token=af0f754d-8063-45ae-a7c7-c722fedb6db6");
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

    public void play_song36(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam36.mp3?alt=media&token=5508edb1-d9a1-4ccd-933b-0e7357f7abf5");
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

    public void play_song37(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam37.mp3?alt=media&token=81e41137-401c-44ab-8122-741932afbf52");
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

    public void play_song38(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam38.mp3?alt=media&token=177a462d-5869-4eb8-88f3-ed87fc5f7a3c");
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

    public void play_song39(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam39.mp3?alt=media&token=dcedd93b-fbc7-4db2-9b33-1bf95e66fcb4");
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

    public void play_song40(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/68_alqallam%2F68_surah_alqalam40.mp3?alt=media&token=e060241f-f192-4492-8f93-8119a954b3a6");
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
