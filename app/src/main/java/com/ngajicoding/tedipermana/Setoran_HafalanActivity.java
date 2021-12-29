package com.ngajicoding.tedipermana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.ngajicoding.tedipermana.Dasboard.HomeUser.HomeUserActivity;
import com.ngajicoding.tedipermana.DataQuiz.QuizActivity;
import com.ngajicoding.tedipermana.DataQuiz.Score.HighestScoreActivity;

public class Setoran_HafalanActivity extends AppCompatActivity {

    WebView view;
    WebView WebView;
    Button back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setoran__hafalan);

        //kembali

        /* WebView */
        view = (WebView) this.findViewById(R.id.webview);

        WebSettings webSettings = view.getSettings();
        webSettings.setJavaScriptEnabled(true);

        view.setWebViewClient(new Setoran_HafalanActivity.MyBrowser());
        view.loadUrl("http://ted.darmajaya.ac.id");   // load ke internet
        //view.loadUrl("file:///android_asset/74245735157/" + v_namafile);    // load ke local file
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(Setoran_HafalanActivity.this, HomeUserActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:

                    if (view.canGoBack()) {
                        view.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}
