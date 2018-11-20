package com.jsm.proescrec.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.jsm.proescrec.R;

public class Home extends AppCompatActivity {

    public static Intent getHomeIntent(Context ctx) {
        return new Intent(ctx, Home.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
