package com.example.akluv.firebasesampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;
    TextView profileTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        auth = FirebaseAuth.getInstance();
        profileTxt = (TextView)findViewById(R.id.textView);

        user = auth.getCurrentUser();
        profileTxt.setText(user.getEmail());
    }

    public void signOut(View v)
    {
        auth.signOut();
        finish();
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void mapAd(View v)
    {
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void resList(View v)
    {
        Intent i = new Intent(this, FormActivity.class);
        startActivity(i);
    }

}
