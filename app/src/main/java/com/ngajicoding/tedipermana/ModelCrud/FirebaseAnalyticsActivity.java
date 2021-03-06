package com.ngajicoding.tedipermana.ModelCrud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ngajicoding.tedipermana.R;

public class FirebaseAnalyticsActivity extends AppCompatActivity {

    private FirebaseAnalytics firebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytics);


        firebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "789876");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "TWOH Firebase");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "tutorial");
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
