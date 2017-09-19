package com.example.dell.entregable_3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 18/09/2017.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderIconos> {
    ArrayList<IconosVo> listaiconos;

    public Adaptador(ArrayList<IconosVo> listaiconos) {
        this.listaiconos = listaiconos;
    }

    @Override
    public ViewHolderIconos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iconos_fragments, null, false);

        return new ViewHolderIconos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderIconos holder, int position) {
        holder.EtiNombre.setText(listaiconos.get(position).getNombre());
        holder.EtiDescripcion.setText(listaiconos.get(position).getDescripcion());
        holder.icono.setImageResource(listaiconos.get(position).getIcono());

    }

    @Override
    public int getItemCount() {
        return listaiconos.size();
    }

    public class ViewHolderIconos extends RecyclerView.ViewHolder {
        TextView EtiNombre, EtiDescripcion;
        ImageView icono;

        public ViewHolderIconos(View itemView) {
            super(itemView);

            EtiNombre = (TextView) itemView.findViewById(R.id.nombre);
            EtiDescripcion = (TextView) itemView.findViewById(R.id.descripcion);
            icono = (ImageView)itemView.findViewById(R.id.icono);
        }
    }
}
