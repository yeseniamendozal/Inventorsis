package pe.com.inventorsis.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import pe.com.inventorsis.ui.MenuActivity;
import pe.com.inventorsis.R;

public class ProductosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_productos, container, false);

        ((MenuActivity) getActivity()).ic_appBar_filtrar.setVisibility(View.GONE);
        ((MenuActivity) getActivity()).ic_appBar_buscar.setVisibility(View.GONE);

        return view;
    }
}