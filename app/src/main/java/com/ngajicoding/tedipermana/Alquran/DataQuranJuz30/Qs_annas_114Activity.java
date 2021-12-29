package com.ngajicoding.tedipermana.Alquran.DataQuranJuz30;

import android.app.assist.AssistStructure;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaExtractor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ngajicoding.tedipermana.DataQuiz.QuizJuz30.AnnasQuizActivity;
import com.ngajicoding.tedipermana.Alquran.DataQuranJuz29.Qs_almuddasir_74Activity;
import com.ngajicoding.tedipermana.R;

import java.io.IOException;
import java.text.BreakIterator;
import java.util.HashMap;
import java.util.Scanner;


public class Qs_annas_114Activity extends AppCompatActivity{

    private Button ply;
    private Button btn1, btn2, btn3, btn4, btn5, btn6;
    private Button btn11, btn22, btn33, btn44, btn55, btn66;
    private CheckBox s1,s2,s3,s4,s5,s6,s7;
    private MediaPlayer mp;
    private EditText word;
    BreakIterator txt;
    private HashMap<String, String> dict;

    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qs_annas_114);

        TextView txt = (TextView) findViewById(R.id.fileTxt);
        word = (EditText) findViewById(R.id.word);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);

        btn11 = (Button)findViewById(R.id.btn11);
        btn22 = (Button)findViewById(R.id.btn22);
        btn33 = (Button)findViewById(R.id.btn33);
        btn44 = (Button)findViewById(R.id.btn44);
        btn55 = (Button)findViewById(R.id.btn55);
        btn66 = (Button)findViewById(R.id.btn66);

        s1 = (CheckBox) findViewById(R.id.s1);
        s2 = (CheckBox) findViewById(R.id.s2);
        s3 = (CheckBox) findViewById(R.id.s3);
        s4 = (CheckBox) findViewById(R.id.s4);
        s5 = (CheckBox) findViewById(R.id.s5);
        s6 = (CheckBox) findViewById(R.id.s6);

        mp = MediaPlayer.create(this,R.raw.annasf);

        dict = new HashMap<>();
        fileRead();
    }

    public void playSound(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.s1:
                mp = null;
                //uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/114_annas%2F114_annas1.mp3?alt=media&token=4372726f-6210-4c58-97b8-04fc15a57646");
                mp = MediaPlayer.create(this, R.raw.annasa);
                s1.setChecked(true);
                break;
            case R.id.s2:
                mp = null;
                mp = MediaPlayer.create(this, R.raw.annasb);
               // uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/114_annas%2F114_annas2.mp3?alt=media&token=a646c935-d1be-4055-bfe8-67493317a1a1");
               // mp = MediaPlayer.create(this, setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/114_annas%2F114_annas2.mp3?alt=media&token=a646c935-d1be-4055-bfe8-67493317a1a1"));
                s2.setChecked(true);
                break;

            case R.id.s3:
                mp = null;
                mp = MediaPlayer.create(this, R.raw.annasc);
                //uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/114_annas%2F114_annas3.mp3?alt=media&token=2b14dcbc-5360-4d83-b1cf-2318383ac7a7");
               // mp = MediaPlayer.create(this, setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/114_annas%2F114_annas3.mp3?alt=media&token=2b14dcbc-5360-4d83-b1cf-2318383ac7a7"));
                s3.setChecked(true);
                break;

            case R.id.s4:
                mp = null;
                mp = MediaPlayer.create(this, R.raw.annasd);
               // uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/114_annas%2F114_annas4.mp3?alt=media&token=f3230d13-5e5d-4eae-be36-0c85e1607c38");
              //  mp = MediaPlayer.create(this, setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/114_annas%2F114_annas4.mp3?alt=media&token=f3230d13-5e5d-4eae-be36-0c85e1607c38"));
                s4.setChecked(true);
                break;

            case R.id.s5:
                mp = null;
                mp = MediaPlayer.create(this, R.raw.annase);
                //Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/114_annas%2F114_annas5.mp3?alt=media&token=692e608e-57a5-4707-a3ea-e9d88b887581");
               // mp = MediaPlayer.create(this, setDataSource("https://firebasestorage.googleapis.com/v0/b/sekripsi-84598.appspot.com/o/114_annas%2F114_annas5.mp3?alt=media&token=692e608e-57a5-4707-a3ea-e9d88b887581"));
                s5.setChecked(true);
                break;
            case R.id.s6:
                break;
            case R.id.btnPlay:
                mp.start();
                break;
            default:
                String w = word.getText().toString();
                String res = dict.get(w);
                if (res != null) {
                    txt.setText(res);
                } else {
                    txt.setText("Not found!!!");
                }
        }
    }

    private int setDataSource(String s) {
        return 0;
    }

    private void fileRead() {
        Scanner scan = new Scanner(getResources().openRawResource(R.raw.dict));
        while(scan.hasNext()){
            String line = scan.nextLine();
            String[] pieces =line.split("\t") ;
            dict.put(pieces[0], pieces[1]);
        }

    }
}
