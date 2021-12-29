package com.ngajicoding.tedipermana.Profile.MyProfileSantri;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ngajicoding.tedipermana.Dasboard.HomeUser.HomeUserActivity;
import com.ngajicoding.tedipermana.Dasboard.HomeUstad.Home_UstadActivity;
import com.ngajicoding.tedipermana.Login.Login_HomeUser.LoginActivity;
import com.ngajicoding.tedipermana.Login.Login_HomeUstad.LoginUstadActivity;
import com.ngajicoding.tedipermana.Profile.MyProfileUstad.EditProfileActivity;
import com.ngajicoding.tedipermana.Profile.MyProfileUstad.MyProfileActivity;
import com.ngajicoding.tedipermana.R;
import com.squareup.picasso.Picasso;

public class MyProfileSantriActivity extends AppCompatActivity {
    LinearLayout btn_home;
    Button btn_keluar;
    Button btn_editprofile;
    ImageView photo_profil;
    TextView nama_lengkap, pekerjaan, label_username, label_nomer;

    DatabaseReference reference;

    String USERNAME_KEY = "usernamekey";
    String username_key = "";
    String username_key_new = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile_santri);


        getUsernameLocal();

        btn_home = findViewById(R.id.btn_home);
        btn_keluar = findViewById(R.id.btn_keluar);
        btn_editprofile =findViewById(R.id.btn_editprofile);

        nama_lengkap =findViewById(R.id.nama_lengkap);
        pekerjaan =findViewById(R.id.pekerjaan);
        photo_profil =findViewById(R.id.photo_profil);
        label_username = findViewById(R.id.label_username);
        label_nomer = findViewById(R.id.label_nomer);

        reference =FirebaseDatabase.getInstance().getReference().child("User").child(username_key_new);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                nama_lengkap.setText(dataSnapshot.child("nama_lengkap").getValue().toString());
                pekerjaan.setText(dataSnapshot.child("pekerjaan").getValue().toString());
                label_username.setText(dataSnapshot.child("username").getValue().toString());
                label_nomer.setText(dataSnapshot.child("no_handphone").getValue().toString());

                Picasso.with(MyProfileSantriActivity.this)
                        .load(dataSnapshot.child("url_profil_poto")
                                .getValue().toString()).centerCrop().fit()
                        .into(photo_profil);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(MyProfileSantriActivity.this,HomeUserActivity.class);
                startActivity(gotohome);
            }
        });


        btn_editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoeditprofil= new Intent(MyProfileSantriActivity.this,EditProfileSantriActivity.class);
                startActivity(gotoeditprofil);
            }
        });

        btn_keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menghapus isi user lokal
                SharedPreferences sharedPreferences = getSharedPreferences(USERNAME_KEY, MODE_PRIVATE);
                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.putString(username_key, null);
                editor.apply();

                //berpindah activity
                Intent gotosigin = new Intent(MyProfileSantriActivity.this,LoginActivity.class);
                startActivity(gotosigin);
            }

        });
    }

    public void getUsernameLocal(){
        SharedPreferences sharedPreferences = getSharedPreferences(USERNAME_KEY, MODE_PRIVATE);
        username_key_new = sharedPreferences.getString(username_key, "");
    }
}
