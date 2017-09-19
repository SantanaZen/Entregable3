package com.example.dell.entregable_3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Dell on 15/09/2017.
 */

public  class IconosFragments extends Fragment {
    ArrayList<IconosVo> listaiconos;
    RecyclerView reciclericonos;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate (R.layout.recycler_fragment, container, false);

        listaiconos = new ArrayList<>();
        reciclericonos = (RecyclerView) view.findViewById(R.id.rec);
        LinearLayoutManager llm=new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        reciclericonos.setLayoutManager(llm);
        llenar();
        Adaptador adapter = new Adaptador(listaiconos);
        reciclericonos.setAdapter(adapter);

        return view;
    }

    private void llenar() {
        listaiconos.add(new IconosVo("La nube","Muestra al usuario la opcion de mover algún archivo a su nube personal",R.drawable.collections_cloud));
        listaiconos.add(new IconosVo("Papelera","Da al usuario la opcion de eliminar cualquier archivo ",R.drawable.content_discard));
        listaiconos.add(new IconosVo("Ayuda","Signo universal para pedir ayuda en el funcionamiento de un programa o pagina web",R.drawable.help));
        listaiconos.add(new IconosVo("Favoritos","Icono relevante en tumblr para denotar el interes o gusto por uno o varios port hechos en dicha pagina ",R.drawable.rating_favorite));
        listaiconos.add(new IconosVo("Me gusta(Like)","El icono más conocido en facebook, denota la aprobacion por un post",R.drawable.rating_good));
        listaiconos.add(new IconosVo("Importante","Generalmente utilizada para guardar los marcadores en navegadores web",R.drawable.rating_important));
    }
}

