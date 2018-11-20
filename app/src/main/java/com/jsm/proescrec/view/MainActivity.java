package com.jsm.proescrec.view;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.OnClick;

import android.os.Bundle;
import android.view.View;

import com.jsm.proescrec.R;

import static com.jsm.proescrec.view.Home.getHomeIntent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.ingresar)
    public void onIngresar(View view) {
        startActivity(getHomeIntent(this));
    }
}
