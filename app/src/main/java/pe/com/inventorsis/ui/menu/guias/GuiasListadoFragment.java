package pe.com.inventorsis.ui.menu.guias;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pe.com.inventorsis.ui.ItemListener;
import pe.com.inventorsis.ui.MenuActivity;
import pe.com.inventorsis.R;
import pe.com.inventorsis.ui.adapter.GuiaAdapter;
import pe.com.inventorsis.models.Guias;

public class GuiasListadoFragment extends Fragment implements ItemListener {

    private RecyclerView recyclerView;
    private GuiaAdapter guiaAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_guias_listado, container, false);

        ((MenuActivity) getActivity()).ic_appBar_filtrar.setVisibility(View.VISIBLE);
        ((MenuActivity) getActivity()).ic_appBar_filtrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_host_fragment_main).navigate(R.id.nav_guias_filtrar);
            }
        });

        ((MenuActivity) getActivity()).ic_appBar_buscar.setVisibility(View.VISIBLE);
        ((MenuActivity) getActivity()).ic_appBar_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_host_fragment_main).navigate(R.id.nav_guias_buscar);
            }
        });

        recyclerView = (RecyclerView) view.findViewById(R.id.recy_guias);
        initRecicler();

        return view;
    }

    private void initRecicler() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        guiaAdapter = new GuiaAdapter(obtenerGuias(), this);
        recyclerView.setAdapter(guiaAdapter);
    }

    public List<Guias> obtenerGuias() {
        List<Guias> guias = new ArrayList<>();
        guias.add(new Guias("G00546", "All in ones de reparación", "I", "25/01/2020", "Registrado"));
        guias.add(new Guias("G00545", "Comidas Dulces S.A.C", "S", "24/01/2020", "Enviando"));
        guias.add(new Guias("G00544", "Tablets de reparación", "I", "23/01/2020", "Enviando"));
        guias.add(new Guias("G00547", "Ticketeteras reparadas", "I", "22/01/2020", "Enviando"));
        guias.add(new Guias("G00548", "Tablets reparadas", "I", "23/01/2020", "Entregado"));

        return guias;
    }

    @Override
    public void onClick(int position) {
        Navigation.findNavController(getActivity(), R.id.nav_host_fragment_main).navigate(R.id.nav_guias_detalle);
    }
}