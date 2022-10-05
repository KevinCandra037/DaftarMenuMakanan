package com.example.daftarmenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rMakanan;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Makanan> listMakanan;

    void dataDummy(){
        listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Nasi Komplit","Nasi lengkap dengan rendang, ayam goreng dan bumbunya",45000,R.drawable.padangkomplit));
        listMakanan.add(new Makanan("Nasi Kikil","Nasi dengan kikil dan bumbunya",32000,R.drawable.nasikikil));
        listMakanan.add(new Makanan("Nasi Rendang","Nasi dengan rendang dan bumbunya",35000,R.drawable.nasirendang));
    }
    void data(){
        rMakanan = findViewById(R.id.reMenu);
        adapter = new Adapter(this, listMakanan);
        layoutManager = new LinearLayoutManager(this);
        rMakanan.setLayoutManager(layoutManager);
        rMakanan.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataDummy();data();
    }
}