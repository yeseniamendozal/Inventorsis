package pe.com.inventorsis.ui.adapter.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import pe.com.inventorsis.R;
import pe.com.inventorsis.models.Guias;
import pe.com.inventorsis.ui.ItemListener;

public class GuiaViewHolder extends RecyclerView.ViewHolder {

    private TextView item_guia_correlativo_rspta;
    private TextView item_guia_descripcion_rspta;
    private TextView item_guia_tipo_rspta;
    private TextView item_guia_fecha_rspta;
    private TextView item_guia_estado_rspta;

    public GuiaViewHolder(@NonNull View itemView, final ItemListener itemListener) {
        super(itemView);
        item_guia_correlativo_rspta = itemView.findViewById(R.id.item_guia_correlativo_rspta);
        item_guia_descripcion_rspta = itemView.findViewById(R.id.item_guia_descripcion_rspta);
        item_guia_tipo_rspta = itemView.findViewById(R.id.item_guia_tipo_rspta);
        item_guia_fecha_rspta = itemView.findViewById(R.id.item_guia_fecha_rspta);
        item_guia_estado_rspta = itemView.findViewById(R.id.item_guia_estado_rspta);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemListener.onClick(getAdapterPosition());
            }
        });
    }

    public void bindData(Guias guias) {
        item_guia_correlativo_rspta.setText(guias.getCorrelativo());
        item_guia_descripcion_rspta.setText(guias.getDescripcion());
        item_guia_tipo_rspta.setText(guias.getTipo());
        item_guia_fecha_rspta.setText(guias.getFecha());
        item_guia_estado_rspta.setText(guias.getEstado());
    }
}
