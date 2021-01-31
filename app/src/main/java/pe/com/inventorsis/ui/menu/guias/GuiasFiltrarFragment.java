package pe.com.inventorsis.ui.menu.guias;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import pe.com.inventorsis.ui.MenuActivity;
import pe.com.inventorsis.R;
import pe.com.inventorsis.ui.resources.DatePickerFragment;

public class GuiasFiltrarFragment extends Fragment {

    TextInputEditText filtrar_guia_fecha;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_guias_filtrar, container, false);

        ((MenuActivity) getActivity()).ic_appBar_filtrar.setVisibility(View.GONE);
        ((MenuActivity) getActivity()).ic_appBar_buscar.setVisibility(View.GONE);

        filtrar_guia_fecha = view.findViewById(R.id.filtrar_guia_fecha);
        filtrar_guia_fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerFragment();
            }
        });

        return view;
    }

    private void showDatePickerFragment() {
        DatePickerFragment newFragment = DatePickerFragment.newInstance(
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        Calendar mCalendar = Calendar.getInstance();
                        mCalendar.set(Calendar.YEAR, year);
                        mCalendar.set(Calendar.MONTH, month);
                        mCalendar.set(Calendar.DAY_OF_MONTH, day);

                        String patter = "dd/MM/yyyy";
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patter);
                        filtrar_guia_fecha.setText(simpleDateFormat.format(mCalendar.getTime()));
                    }
                }
        );

        newFragment.show(getActivity().getSupportFragmentManager(), "date picker");
    }

}