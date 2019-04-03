package com.example.akluv.firebasesampleapp;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle b = getIntent().getExtras();
        TextView addr = (TextView) findViewById(R.id.addressValue);
        TextView location = (TextView) findViewById(R.id.locValue);
        TextView nott = (TextView) findViewById(R.id.notValue);
        TextView maxx = (TextView) findViewById(R.id.maxtValue);
        TextView tmgg = (TextView) findViewById(R.id.tmgValue);




        addr.setText(b.getCharSequence("addr"));
        location.setText(b.getCharSequence("age"));
        nott.setText(b.getCharSequence("not"));
        maxx.setText(b.getCharSequence("max"));
        tmgg.setText(b.getCharSequence("tmg"));

    }
}