package com.ngajicoding.tedipermana.JadwalSholat;

import android.os.AsyncTask;
import android.provider.DocumentsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.ngajicoding.tedipermana.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class MainSholatActivity extends AppCompatActivity {

    private ArrayList<Sholat> arrSholat;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sholat);

        arrSholat = new ArrayList<Sholat>();
        mAdapter = new ListAdapter(this, arrSholat);
        ListView lvMain = findViewById(R.id.lv_main);
        lvMain.setAdapter(mAdapter);

        new loadData().execute();
    }

    private class loadData extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... voids) {
            try {
                // contoh: Ambil kota id=13 (Kota Bandar lampung)
                String url = "https://jadwalsholat.org/adzan/monthly.php?id=13";
                Document doc = Jsoup.connect(url).get();
                Log.d("LogScrape",doc.title());

                Elements currents = doc.select(".table_highlight");
                Log.d("CurrentScrape", currents.text());

                return currents.text();

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            String[] data = result.split(" ");
            String[] keys = {"Imsyak", "Shubuh", "Terbit", "Dhuha", "Dzuhur", "Ashr", "Maghrib", "Isya"};
            int i = 1;
            for (String label : keys) {
                arrSholat.add(new Sholat(label, data[i++]));
            }

            mAdapter.notifyDataSetChanged();
        }
    }
}
