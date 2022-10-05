package com.example.daftarmenumakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class holder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView txtnama, txtdesc, txtprice;

    public holder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.imageMakanan);
        txtnama = itemView.findViewById(R.id.txtnama);
        txtdesc = itemView.findViewById(R.id.txtdesc);
        txtprice = itemView.findViewById(R.id.txtprice);

    }
}

public class Adapter extends RecyclerView.Adapter<holder> {
    Context context;
    ArrayList<Makanan> listMakanan;

    public Adapter(Context context, ArrayList<Makanan> listMakanan) {
        this.context = context;
        this.listMakanan = listMakanan;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Makanan makanan = listMakanan.get(position);
        holder.img.setImageResource(makanan.getImage());
        holder.txtnama.setText(makanan.getNama());
        holder.txtdesc.setText(makanan.getDescription());
        holder.txtprice.setText("Rp." + makanan.getPrice());
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }
}
