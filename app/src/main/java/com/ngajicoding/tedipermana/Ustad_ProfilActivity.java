package com.ngajicoding.tedipermana;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Ustad_ProfilActivity extends AppCompatActivity {

    public Button v_call_Button1, v_call_Button2, v_call_Button3, v_call_Button4;
    public Intent myIntent;
    public String type, text, toNumber, nama_ustad;

    public RadioButton rb_sabqi, rb_sabaq, rb_manzil;

    public RadioGroup setoranhafalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ustad__profil);

        v_call_Button2 = (Button) findViewById(R.id.friend_2);
        v_call_Button1 = (Button) findViewById(R.id.friend_1);
        v_call_Button3 = (Button) findViewById(R.id.friend_3);
        v_call_Button4 = (Button) findViewById(R.id.friend_4);

        v_call_Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSupportChat ();
                nama_ustad = "Musthofa Ahmad";
                toNumber = "6281294401871";
            }

            private void startSupportChat() {
                try {
                    String headerReceiver = "";// Replace with your message.
                    String bodyMessageFormal = "";// Replace with your message.
                    String whatsappContain = headerReceiver + bodyMessageFormal;
                    String trimToNumner = "6281294401871"; //10 digit number
                    Intent intent = new Intent ( Intent.ACTION_VIEW );
                    intent.setData ( Uri.parse ( "https://wa.me/" + trimToNumner + "/?text=" + "" ) );
                    startActivity ( intent );
                } catch (Exception e) {
                    e.printStackTrace ();
                }
            }
        });

        v_call_Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSupportChat ();
                nama_ustad = "Zakaria";
                toNumber = "6285708997189";
            }

            private void startSupportChat() {
                try {
                    String headerReceiver = "";// Replace with your message.
                    String bodyMessageFormal = "";// Replace with your message.
                    String whatsappContain = headerReceiver + bodyMessageFormal;
                    String trimToNumner = "6285708997189"; //10 digit number
                    Intent intent = new Intent ( Intent.ACTION_VIEW );
                    intent.setData ( Uri.parse ( "https://wa.me/" + trimToNumner + "/?text=" + "" ) );
                    startActivity ( intent );
                } catch (Exception e) {
                    e.printStackTrace ();
                }
            }
        });

        v_call_Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSupportChat ();
                nama_ustad = "Syafi'udin";
                toNumber = "628127915346";
            }

            private void startSupportChat() {
                try {
                    String headerReceiver = "";// Replace with your message.
                    String bodyMessageFormal = "";// Replace with your message.
                    String whatsappContain = headerReceiver + bodyMessageFormal;
                    String trimToNumner = "628127915346"; //10 digit number
                    Intent intent = new Intent ( Intent.ACTION_VIEW );
                    intent.setData ( Uri.parse ( "https://wa.me/" + trimToNumner + "/?text=" + "" ) );
                    startActivity ( intent );
                } catch (Exception e) {
                    e.printStackTrace ();
                }
            }
        });

        v_call_Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSupportChat ();
                nama_ustad = "Musthofa Ahmad";
                toNumber = "6281294401871";
            }

            private void startSupportChat() {
                try {
                    String headerReceiver = "";// Replace with your message.
                    String bodyMessageFormal = "";// Replace with your message.
                    String whatsappContain = headerReceiver + bodyMessageFormal;
                    String trimToNumner = "6281294401871"; //10 digit number
                    Intent intent = new Intent ( Intent.ACTION_VIEW );
                    intent.setData ( Uri.parse ( "https://wa.me/" + trimToNumner + "/?text=" + "" ) );
                    startActivity ( intent );
                } catch (Exception e) {
                    e.printStackTrace ();
                }
            }
        });

    }
}
