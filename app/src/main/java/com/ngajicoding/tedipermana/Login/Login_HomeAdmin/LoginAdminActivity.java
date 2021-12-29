package com.ngajicoding.tedipermana.Login.Login_HomeAdmin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ngajicoding.tedipermana.Dasboard.HomeAdmin.Home_AdminActivity;
import com.ngajicoding.tedipermana.Dasboard.HomeUstad.Home_UstadActivity;
import com.ngajicoding.tedipermana.Login.Login_HomeUstad.LoginUstadActivity;
import com.ngajicoding.tedipermana.R;

public class LoginAdminActivity extends AppCompatActivity {

    TextView btn_new_account;
    Button btn_sign_in;
    EditText xusername, xpassword;

    DatabaseReference reference;

    String USERNAME_KEY = "usernamekey";
    String username_key = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        btn_new_account = findViewById(R.id.btn_new_account);
        btn_sign_in = findViewById(R.id.btn_sign_in);
        xusername = findViewById(R.id.xusername);
        xpassword = findViewById(R.id.xpassword);


        //btn_new_account.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Intent gotoregisterone = new Intent(LoginAdminActivity.this,Home_AdminActivity.class);
        //        startActivity(gotoregisterone);
        //    }
        //});

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //state menjadi loading
                btn_sign_in.setEnabled(false);
                btn_sign_in.setText("Loading...");

                String username = xusername.getText().toString();
                final String password = xpassword.getText().toString();


                reference = FirebaseDatabase.getInstance().getReference()
                        .child("User").child(username);
                reference.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()){
                            //ambil password dari firebase
                            String passwordFromFirebase = dataSnapshot.child("password").getValue().toString();

                            //validasi password dengan password firebase
                            if(password.equals(passwordFromFirebase)){
                                Toast.makeText(getApplicationContext(), "Username ada :)", Toast.LENGTH_SHORT).show();


                                //simpan username (key) kepada local
                                SharedPreferences sharedPreferences = getSharedPreferences(USERNAME_KEY, MODE_PRIVATE);
                                SharedPreferences.Editor editor= sharedPreferences.edit();
                                editor.putString(username_key, xusername.getText().toString());
                                editor.apply();

                                //berpindah activity
                                Intent gotohome = new Intent(LoginAdminActivity.this,Home_UstadActivity.class);
                                startActivity(gotohome);

                            }
                            else {
                                Toast.makeText(getApplicationContext(), "Password Salah!", Toast.LENGTH_SHORT).show();
                            }

                        }
                        else{
                            Toast.makeText(getApplicationContext(), "Username Tidak ada!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


            }
        });

    }
}
