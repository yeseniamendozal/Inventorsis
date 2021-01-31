package pe.com.inventorsis.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.google.android.material.card.MaterialCardView;

import pe.com.inventorsis.ui.MenuActivity;
import pe.com.inventorsis.R;

public class InicioFragment extends Fragment {

    MaterialCardView cv_guias;
    MaterialCardView cv_productos;
    MaterialCardView cv_cotizacion;
    MaterialCardView cv_ventas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        ((MenuActivity) getActivity()).ic_appBar_filtrar.setVisibility(View.GONE);
        ((MenuActivity) getActivity()).ic_appBar_buscar.setVisibility(View.GONE);

        cv_guias = view.findViewById(R.id.cv_guias);
        cv_productos = view.findViewById(R.id.cv_productos);
        cv_cotizacion = view.findViewById(R.id.cv_cotizacion);
        cv_ventas = view.findViewById(R.id.cv_ventas);

        cv_guias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_host_fragment_main).navigate(R.id.nav_guias);
            }
        });

        cv_productos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_host_fragment_main).navigate(R.id.nav_productos);
            }
        });

        cv_cotizacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_host_fragment_main).navigate(R.id.nav_cotizacion_lista);
            }
        });

        cv_ventas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_host_fragment_main).navigate(R.id.nav_ventas);
            }
        });

        return view;
    }
}