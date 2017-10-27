package ar.edu.utn.fra.lab5.a1erparcial;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lkdml on 03/10/2017.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    LayoutInflater mLInflater;
    List<Modelo> contactos;
    ItemClickListener listener;

    public Adapter(List<Modelo> modelo,  ItemClickListener listener) {
//  public Adapter(Context context, List<Modelo> modelo, ItemClickListener listener) {
        this.contactos = modelo;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        imageView = (NetworkImageView) itemView.findViewById(R.id.image);
//        priceView = (TextView) itemView.findViewById(R.id.price);
//        itemView.setOnClickListener(clickListener);

        this.mLInflater = LayoutInflater.from(parent.getContext());
        View v = (View) this.mLInflater.inflate(R.layout.holder, parent, false);
        ViewHolder vh = new ViewHolder(v, listener);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Modelo m = contactos.get(position);

        holder.getNombre().setText(m.getNombre());
        holder.getApellido().setText(m.getApellido());
        holder.getTelefono().setText(m.getTelefono());
        holder.setPosicion(position);
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }
}
