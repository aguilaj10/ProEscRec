package com.jsm.proescrec.view;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.jsm.proescrec.R;

public class SincronizarActivity extends AppCompatActivity {

    public static Intent getSincronizarIntent(Context ctx) {
        return new Intent(ctx, SincronizarActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sincronizar);
        ButterKnife.bind(this);
    }
}
