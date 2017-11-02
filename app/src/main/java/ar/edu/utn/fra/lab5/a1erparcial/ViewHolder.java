package ar.edu.utn.fra.lab5.a1erparcial;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lkdml on 03/10/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView nombre;
    private TextView apellido;
    private TextView telefono;
    private ImageView img;
    private ItemClickListener listener;
    private int posicion;

//    public ViewHolder(View itemView, ItemClickListener listener) {
//        super(itemView);
//        //TODO: Completar lo que falta acceder a los elementos view y setear el listener
//
//    }

    public ViewHolder(View itemView, ItemClickListener listener) {
        super(itemView);

        this.nombre = (TextView) itemView.findViewById(R.id.vh_nombre);
        this.apellido = (TextView) itemView.findViewById(R.id.vh_apellido);
        this.telefono = (TextView) itemView.findViewById(R.id.vh_telefono);
        this.listener = listener;
        itemView.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        this.listener.onItemClick(v,getAdapterPosition());
//    }

    @Override
    public void onClick(View v) {
        listener.onItemClick(this.getPosicion());
    }

    public TextView getNombre() {
        return nombre;
    }

    public TextView getApellido() {
        return apellido;
    }

    public TextView getTelefono() {
        return telefono;
    }

    public ImageView getImg() {
        return img;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
