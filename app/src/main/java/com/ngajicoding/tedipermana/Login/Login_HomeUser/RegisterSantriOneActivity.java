package com.ngajicoding.tedipermana.Login.Login_HomeUser;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ngajicoding.tedipermana.Login.Login_HomeUstad.LoginUstadActivity;
import com.ngajicoding.tedipermana.Login.Login_HomeUstad.RegisterUstadOneActivity;
import com.ngajicoding.tedipermana.Login.Login_HomeUstad.RegisterUstadTwoActivity;
import com.ngajicoding.tedipermana.R;


public class RegisterSantriOneActivity extends AppCompatActivity {

    Button btn_continue;
    LinearLayout btn_back;
    EditText username, password, email_address;
    DatabaseReference reference;

    String USERNAME_KEY = "usernamekey";
    String username_key = "";
    String username_key_new = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_santri_one);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email_address = findViewById(R.id.email_address);

        btn_continue = findViewById(R.id.btn_continue);
        btn_continue. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //state menjadi loading
                btn_continue.setEnabled(false);
                btn_continue.setText("Loading...");

                SharedPreferences sharedPreferences = getSharedPreferences(USERNAME_KEY, MODE_PRIVATE);
                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.putString(username_key, username.getText().toString());
                editor.apply();


                reference = FirebaseDatabase.getInstance().getReference().child("User").child(username.getText().toString());
                reference.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        dataSnapshot.getRef().child("username").setValue(username.getText().toString());
                        dataSnapshot.getRef().child("password").setValue(password.getText().toString());
                        dataSnapshot.getRef().child("email_address").setValue(email_address.getText().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                Intent gotonexregister = new Intent(RegisterSantriOneActivity.this,RegisterSantriTwoActivity.class);
                startActivity(gotonexregister);

            }
        });

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtosignin = new Intent(RegisterSantriOneActivity.this,LoginActivity.class);
                startActivity(backtosignin);
            }
        });


    }
}
