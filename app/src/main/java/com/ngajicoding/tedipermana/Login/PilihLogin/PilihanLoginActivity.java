package com.ngajicoding.tedipermana.Login.PilihLogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ngajicoding.tedipermana.Login.Login_HomeUser.LoginActivity;
import com.ngajicoding.tedipermana.Login.Login_HomeAdmin.LoginAdminActivity;
import com.ngajicoding.tedipermana.Login.Login_HomeUstad.LoginUstadActivity;
import com.ngajicoding.tedipermana.R;

public class PilihanLoginActivity extends AppCompatActivity {
    Button btn1, btn2, btn3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_login);

        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(PilihanLoginActivity.this, LoginActivity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(PilihanLoginActivity.this, LoginUstadActivity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(PilihanLoginActivity.this, LoginAdminActivity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
    }
}
