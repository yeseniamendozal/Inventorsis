package pe.com.inventorsis.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pe.com.inventorsis.R;
import pe.com.inventorsis.ui.ItemListener;
import pe.com.inventorsis.ui.adapter.viewholder.GuiaViewHolder;
import pe.com.inventorsis.models.Guias;

public class GuiaAdapter extends RecyclerView.Adapter {

    List<Guias> guias;
    ItemListener itemListener;

    public GuiaAdapter(List<Guias> guias, ItemListener itemListener) {
        this.guias = guias;
        this.itemListener = itemListener;
    }

    public void addGuias(List<Guias> guias) {
        this.guias.clear();
        this.guias.addAll(guias);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new GuiaViewHolder(view, itemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((GuiaViewHolder)holder).bindData(guias.get(position));
    }

    @Override
    public int getItemCount() {
        return guias.size();
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.item_guias;
    }

}
