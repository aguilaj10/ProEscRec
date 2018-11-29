package com.jsm.proescrec.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.jsm.proescrec.R;

public class Form2Activity extends AppCompatActivity {

    public static Intent getForm2Intent(Context ctx) {
        return new Intent(ctx, Form2Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);
    }
}
