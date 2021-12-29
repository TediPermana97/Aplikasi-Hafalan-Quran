package com.ngajicoding.tedipermana.Login.Login_HomeUser;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.ngajicoding.tedipermana.Dasboard.HomeUser.HomeUserActivity;
import com.ngajicoding.tedipermana.R;
import com.squareup.picasso.Picasso;

public class RegisterSantriTwoActivity extends AppCompatActivity {
    Button btn_continue, btn_add_photo;
    LinearLayout btn_back;
    ImageView pic_photo_register;
    EditText pekerjaan, nama_lengkap, no_hp;

    Uri photo_location;
    Integer photo_max = 1;

    DatabaseReference reference;
    StorageReference storage;

    String USERNAME_KEY = "usernamekey";
    String username_key = "";
    String username_key_new = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_santri_two);

        getUsernameLocal();

        btn_continue = findViewById(R.id.btn_continue);
        btn_back = findViewById(R.id.btn_back);
        btn_add_photo = findViewById(R.id.btn_add_photo);
        pic_photo_register = findViewById(R.id.pic_photo_register);
        pekerjaan = findViewById(R.id.pekerjaan);
        nama_lengkap = findViewById(R.id.nama_lengkap);
        no_hp = findViewById(R.id.no_hp);


        btn_add_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findphoto();

            }
        });

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //state menjadi loading
                btn_continue.setEnabled(false);
                btn_continue.setText("Loading...");

                //menyimpan kepada database
                reference = FirebaseDatabase.getInstance().getReference().
                        child("User").child(username_key_new);
                storage = FirebaseStorage.getInstance().getReference().child("photouser").child(username_key_new);

                //validasi poto
                /*if(photo_location !=null){
                    StorageReference storageReference = storage.child(System.currentTimeMillis()+"."+ getFileExtension(photo_location));
                    storageReference .putFile(photo_location).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                            //String uri_photo = taskSnapshot.getMetadata().getReference().getDownloadUrl().toString();
                            String uri_photo = taskSnapshot.getUploadSessionUri().toString();
                            reference.getRef().child("url_profil_poto").setValue(uri_photo);
                            reference.getRef().child("nama_lengkap").setValue(nama_lengkap.getText().toString());
                            reference.getRef().child("pekerjaan").setValue(pekerjaan.getText().toString());
                            reference.getRef().child("no_handphone").setValue(no_hp.getText().toString());
                        }
                    }).addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                            Intent gotosucces = new Intent(RegistrasiTwoAct.this,SussesRegisterAct.class);
                            startActivity(gotosucces);
                        }
                    });
                }*/
                final StorageReference filePath= storage.child(System.currentTimeMillis()+"."+ getFileExtension(photo_location));
                filePath.putFile(photo_location).addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                        if(task.isSuccessful()){
                            //getting storage string
                            reference.getRef().child("nama_lengkap").setValue(nama_lengkap.getText().toString());
                            reference.getRef().child("pekerjaan").setValue(pekerjaan.getText().toString());
                            reference.getRef().child("no_handphone").setValue(no_hp.getText().toString());

                            // String DownloadUrl= task.getResult().getDownloadUrl().toString();

                            String DownloadUrl= task.getResult().getStorage().getDownloadUrl().toString();

                            filePath.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                    String downloadUrl = uri.toString();

                                    reference.child("url_profil_poto").setValue(downloadUrl).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if(task.isSuccessful()){
                                                //progressDialog.dismiss();
                                                Toast.makeText(RegisterSantriTwoActivity.this,"Your picture Saved successfully",Toast.LENGTH_SHORT) .show();
                                                Intent gotomyprofil = new Intent(RegisterSantriTwoActivity.this,HomeUserActivity.class);
                                                startActivity(gotomyprofil);
                                            }else{
                                                Toast.makeText(RegisterSantriTwoActivity.this,"Problem occurred while tryng to save your picture..",Toast.LENGTH_SHORT) .show();
                                            }
                                        }
                                    });
                                }
                            });
                            reference.getRef().child("url_profil_poto").setValue(DownloadUrl);

                            //uploading into database

                        }else{
                            Toast.makeText(RegisterSantriTwoActivity.this,"Your picture did NOT saved",Toast.LENGTH_SHORT) .show();
                            //progressDialog.dismiss();
                        }
                    }
                });



            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoback = new Intent(RegisterSantriTwoActivity.this,RegisterSantriOneActivity.class);
                startActivity(gotoback);
            }
        });

    }

    String getFileExtension (Uri uri){
        ContentResolver contentResolver = getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));

    }

    public void findphoto()
    {
        Intent pic = new Intent();
        pic.setType("image/*");
        pic.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(pic,photo_max);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == photo_max && resultCode == RESULT_OK && data != null && data.getData() !=null)
        {
            photo_location = data.getData();
            Picasso.with(this).load(photo_location).centerCrop().fit().into(pic_photo_register);
        }
    }

    public void getUsernameLocal(){
        SharedPreferences sharedPreferences = getSharedPreferences(USERNAME_KEY, MODE_PRIVATE);
        username_key_new = sharedPreferences.getString(username_key,"");
    }
}
