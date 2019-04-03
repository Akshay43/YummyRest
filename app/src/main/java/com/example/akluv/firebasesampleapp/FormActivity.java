package com.example.akluv.firebasesampleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FormActivity extends Activity implements OnClickListener {
    Button button;
    RadioGroup genderRadioGroup;
    EditText addr;
    EditText location;
    EditText nott;
    EditText maxx;
    EditText tmgg;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //Get the ids of view objects
        findAllViewsId();

        button.setOnClickListener(this);
    }

    private void findAllViewsId() {
        button = (Button) findViewById(R.id.submit);
        addr = (EditText) findViewById(R.id.addr);
        location = (EditText) findViewById(R.id.location);
        nott = (EditText) findViewById(R.id.nott);
        maxx = (EditText) findViewById(R.id.maxx);
        tmgg = (EditText) findViewById(R.id.tmgg);
        }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), DisplayActivity.class);
        //Create a bundle object
        Bundle b = new Bundle();

        //Inserts a String value into the mapping of this Bundle
        b.putString("name", addr.getText().toString());
        b.putString("locatiom", location.getText().toString());
        b.putString("nott", nott.getText().toString());
        b.putString("maxx", maxx.getText().toString());
        b.putString("tmgg", tmgg.getText().toString());


        //Add the bundle to the intent.
        intent.putExtras(b);

        //start the DisplayActivity
        startActivity(intent);
    }
}