package com.jsm.proescrec.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jsm.proescrec.R;
import com.jsm.proescrec.model.Planteles;
import com.jsm.proescrec.view.Form1Activity;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import hugo.weaving.DebugLog;

public class PlantelListAdapter extends RecyclerView.Adapter<PlantelListAdapter.ViewHolder> {
    private List<Planteles> listaPlanteles;
    private Context ctx;

    public PlantelListAdapter(Context ctx, List<Planteles> listaPlanteles) {
        this.listaPlanteles = listaPlanteles;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View offerView = inflater.inflate(R.layout.plantel_card, parent, false);
        offerView.setOnClickListener(clickListener);
        return new ViewHolder(offerView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final int index = holder.getAdapterPosition();
        holder.nombrePlantel.setText(listaPlanteles.get(index).getNombre());
        holder.direccionPlantel.setText(getDireccion(index));
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        @DebugLog
        public void onClick(View view) {
            ctx.startActivity(Form1Activity.getForm1Intent(ctx));
        }
    };

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

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.nombre_plantel)
        TextView nombrePlantel;
        @BindView(R.id.direccion_plantel)
        TextView direccionPlantel;
        @BindView(R.id.fila_plantel)
        ConstraintLayout filaPlantel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
