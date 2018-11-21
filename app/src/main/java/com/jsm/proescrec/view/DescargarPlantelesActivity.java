package com.jsm.proescrec.view;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.jsm.proescrec.R;

public class DescargarPlantelesActivity extends AppCompatActivity {
    @BindView(R.id.spinner_entidad)
    Spinner spinnerEntidad;
    @BindView(R.id.spinner_municipio)
    Spinner spinnerMunicipio;
    @BindView(R.id.spinner_asentamiento)
    Spinner spinnerAsentamiento;

    public static Intent getDescargarIntent(Context ctx) {
        return new Intent(ctx, DescargarPlantelesActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descargar_planteles);
        ButterKnife.bind(this);

        String[] myItems= getResources().getStringArray(R.array.spinner1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.select_dialog_item, myItems);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEntidad.setAdapter(arrayAdapter);

        myItems= getResources().getStringArray(R.array.spinner2);
        arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.select_dialog_item, myItems);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMunicipio.setAdapter(arrayAdapter);

        myItems= getResources().getStringArray(R.array.spinner3);
        arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.select_dialog_item, myItems);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAsentamiento.setAdapter(arrayAdapter);

    }
}
