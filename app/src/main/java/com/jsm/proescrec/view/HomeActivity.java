package com.jsm.proescrec.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.jsm.proescrec.R;
import com.jsm.proescrec.model.CatAsentamientos;
import com.jsm.proescrec.model.CatEntidades;
import com.jsm.proescrec.model.CatMunicipios;
import com.jsm.proescrec.model.Planteles;
import com.jsm.proescrec.view.adapter.PlantelListAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.lista_plateles)
    RecyclerView recyclerPlanteles;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private SearchView searchView;

    public static Intent getHomeIntent(Context ctx) {
        return new Intent(ctx, HomeActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu);

        PlantelListAdapter adapter = new PlantelListAdapter(getPlanteles());
        DividerItemDecoration dividerItemDecoration
                = new DividerItemDecoration(recyclerPlanteles.getContext(),
                RecyclerView.VERTICAL);
        recyclerPlanteles.setLayoutManager(
                new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerPlanteles.addItemDecoration(dividerItemDecoration);
        recyclerPlanteles.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) menu.findItem(R.id.action_search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        // listening to search query text change
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                // filter recycler view when query submitted
//                mAdapter.getFilter().filter(query);
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String query) {
//                // filter recycler view when text is changed
//                mAdapter.getFilter().filter(query);
//                return false;
//            }
//        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<Planteles> getPlanteles() {
        List<Planteles> listaPlanteles = new ArrayList<>();
        Planteles plantel = new Planteles();
        CatEntidades entidad = new CatEntidades();
        CatMunicipios municipio = new CatMunicipios();
        CatAsentamientos asentamiento = new CatAsentamientos();
        entidad.setEntidad("Esatdo de México");
        municipio.setCveEntidad(entidad);
        municipio.setMunicipio("Nezahualcoyotl");
        asentamiento.setCveMunicipio(municipio);
        asentamiento.setAsentamiento("Metropolitana 3ra sección");
        asentamiento.setTipoAsentamiento("Colonia");
        asentamiento.setCodigoPostal("57750");
        plantel.setCveAsentamiento(asentamiento);
        plantel.setDomicilio("Calle Coyoacan S/N, entre Mixcoac y San Ángel");
        plantel.setNombre("Preescolar Gustavo Baz Prada AEP");
        listaPlanteles.add(plantel);
        listaPlanteles.add(plantel);
        listaPlanteles.add(plantel);
        listaPlanteles.add(plantel);
        listaPlanteles.add(plantel);
        listaPlanteles.add(plantel);
        return listaPlanteles;
    }
}