package com.ngajicoding.tedipermana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ngajicoding.tedipermana.Login.PilihLogin.PilihanLoginActivity;

public class SplashschreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashschreen);

        Thread splash = new Thread(){
            public void run(){
                try                {
                    sleep(2000);
                }
                catch (InterruptedException a)
                {
                    a.printStackTrace();
                }
                finally {
                    startActivity(new Intent(SplashschreenActivity.this,PilihanLoginActivity.class));
                    finish();
                }
            }
        };
        splash.start();
    }
}
