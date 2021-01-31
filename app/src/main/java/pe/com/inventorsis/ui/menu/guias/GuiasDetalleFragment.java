package pe.com.inventorsis.ui.menu.guias;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.com.inventorsis.R;
import pe.com.inventorsis.ui.MenuActivity;

public class GuiasDetalleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_guias_detalle, container, false);

        ((MenuActivity) getActivity()).ic_appBar_filtrar.setVisibility(View.GONE);
        ((MenuActivity) getActivity()).ic_appBar_buscar.setVisibility(View.GONE);

        return view;
    }
}