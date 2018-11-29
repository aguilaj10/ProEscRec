package com.jsm.proescrec.view;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hugo.weaving.DebugLog;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.jsm.proescrec.R;

public class Form1Activity extends AppCompatActivity implements OnMapReadyCallback, LocationListener {
    private static final long MIN_TIME = 400;
    private static final float MIN_DISTANCE = 1000;

    @BindView(R.id.map_croquis)
    MapView croquis;

    private GoogleMap googleMap;


    public static Intent getForm1Intent(Context ctx) {
        return new Intent(ctx, Form1Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);
        ButterKnife.bind(this);
        croquis.getMapAsync(this);
    }

    @Override
    @DebugLog
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        googleMap.setMinZoomPreference(12);
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME, MIN_DISTANCE, this);

    }

    @Override
    @DebugLog
    public void onLocationChanged(Location location) {
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }

    @OnClick (R.id.siguiente)
    @DebugLog
    public void onSiguiente(View button) {
        startActivity(Form2Activity.getForm2Intent(this));
    }
}
