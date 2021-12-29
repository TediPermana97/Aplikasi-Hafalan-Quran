package com.ngajicoding.tedipermana.Edukasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.util.TypedValue;

import com.ngajicoding.tedipermana.R;

public class TipsActivity extends AppCompatActivity {

    private AppCompatTextView mJTv, mJTv2, mJTv3,mJTv4,mJTv5,mJTv6,mJTv7,mJTv8,mJTv9,mJTv10,mJTv11,mJTv12,mJTv13,mJTv14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        mJTv=(AppCompatTextView)findViewById(R.id.a);
        mJTv.setText(getResources().getString(R.string.justify1));
        mJTv.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv2=(AppCompatTextView)findViewById(R.id.dua);
        mJTv2.setText(getResources().getString(R.string.justify2));
        mJTv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv3=(AppCompatTextView)findViewById(R.id.tiga);
        mJTv3.setText(getResources().getString(R.string.justify3));
        mJTv3.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv4=(AppCompatTextView)findViewById(R.id.empat);
        mJTv4.setText(getResources().getString(R.string.justify4));
        mJTv4.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv5=(AppCompatTextView)findViewById(R.id.lima);
        mJTv5.setText(getResources().getString(R.string.justify5));
        mJTv5.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv6=(AppCompatTextView)findViewById(R.id.enam);
        mJTv6.setText(getResources().getString(R.string.justify6));
        mJTv6.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv7=(AppCompatTextView)findViewById(R.id.tujuh);
        mJTv7.setText(getResources().getString(R.string.justify7));
        mJTv7.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv8=(AppCompatTextView)findViewById(R.id.lapan);
        mJTv8.setText(getResources().getString(R.string.justify8));
        mJTv8.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv9=(AppCompatTextView)findViewById(R.id.sembilan);
        mJTv9.setText(getResources().getString(R.string.justify9));
        mJTv9.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv10=(AppCompatTextView)findViewById(R.id.sepuluh);
        mJTv10.setText(getResources().getString(R.string.justify10));
        mJTv10.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv11=(AppCompatTextView)findViewById(R.id.sebelas);
        mJTv11.setText(getResources().getString(R.string.justify11));
        mJTv11.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv12=(AppCompatTextView)findViewById(R.id.duabelas);
        mJTv12.setText(getResources().getString(R.string.justify12));
        mJTv12.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv13=(AppCompatTextView)findViewById(R.id.tigabelas);
        mJTv13.setText(getResources().getString(R.string.justify13));
        mJTv13.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

        mJTv14=(AppCompatTextView)findViewById(R.id.empatbelas);
        mJTv14.setText(getResources().getString(R.string.justify14));
        mJTv14.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
    }
}
