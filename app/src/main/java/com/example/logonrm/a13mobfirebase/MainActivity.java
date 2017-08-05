package com.example.logonrm.a13mobfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalics = FirebaseAnalytics.getInstance(this);

        FirebaseMessaging.getInstance().subscribeToTopic("mob");
    }

    public void clickMe(View v){
        Bundle params = new Bundle();
        params.putString("NOME","Lua");
        mFirebaseAnalics.logEvent("clickMe",params);

    }

    public void forcarCrash(View v){
        int r = 2/0;

    }

}
