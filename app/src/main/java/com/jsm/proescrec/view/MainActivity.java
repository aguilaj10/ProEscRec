package com.jsm.proescrec.view;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hugo.weaving.DebugLog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jsm.proescrec.R;

import static com.jsm.proescrec.view.HomeActivity.getHomeIntent;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.ingresar)
    Button botonIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.ingresar)
    @DebugLog
    public void onIngresar(View button) {
        startActivity(getHomeIntent(this));
    }
}
