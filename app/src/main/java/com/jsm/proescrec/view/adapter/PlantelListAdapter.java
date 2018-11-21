package com.jsm.proescrec.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jsm.proescrec.R;
import com.jsm.proescrec.model.Planteles;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class PlantelListAdapter extends RecyclerView.Adapter<PlantelListAdapter.ViewHolder> {
    private List<Planteles> listaPlanteles;

    public PlantelListAdapter(List<Planteles> listaPlanteles) {
        this.listaPlanteles = listaPlanteles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View offerView = inflater.inflate(R.layout.plantel_card, parent, false);
        return new ViewHolder(offerView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final int index = holder.getAdapterPosition();
        holder.nombrePlantel.setText(listaPlanteles.get(index).getNombre());
        holder.direccionPlantel.setText(getDireccion(index));
    }

    private String getDireccion(int index) {
        final StringBuilder direccion = new StringBuilder();
        direccion.append(listaPlanteles.get(index).getDomicilio()).append(", ");
        direccion.append(listaPlanteles.get(index).getCveAsentamiento().getTipoAsentamiento()).append(" ");
        direccion.append(listaPlanteles.get(index).getCveAsentamiento().getAsentamiento()).append(", ");
        direccion.append(listaPlanteles.get(index).getCveAsentamiento().getCveMunicipio().getMunicipio()).append(", ");
        direccion.append(listaPlanteles.get(index).getCveAsentamiento().getCveMunicipio().getCveEntidad().getEntidad()).append(", ");
        direccion.append(listaPlanteles.get(index).getCveAsentamiento().getCodigoPostal());
        return direccion.toString();
    }

    @Override
    public int getItemCount() {
        return listaPlanteles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.nombre_plantel)
        TextView nombrePlantel;
        @BindView(R.id.direccion_plantel)
        TextView direccionPlantel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
