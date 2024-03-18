package com.example.datamahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.datamahasiswa.R;
import com.example.datamahasiswa.classmahasiswa;
import com.example.datamahasiswa.dataclass;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<dataclass> items = new ArrayList<dataclass>();
        items.add(new dataclass("Nama: Abmi Sukma Edri","Nim: 1205012o0341",R.drawable.abmi));
        items.add(new dataclass("Nama: Ahmad Kurniawan","Nim: 12250111514",R.drawable.ahmad));
        items.add(new dataclass("Nama: Aufa Hajati","Nim: 12250120338",R.drawable.aufa));
        items.add(new dataclass("Nama: Daffa Finanda","Nim: 12250111603",R.drawable.dafin));
        items.add(new dataclass("Nama: Daffa Ikhwan Nurfauzan","Nim: 12250110979",R.drawable.daffa));
        items.add(new dataclass("Nama: Dwi Jelita Adhliyah","Nim: 12250120331",R.drawable.jelita));
        items.add(new dataclass("Nama: Dwi Mahdini","Nim: 12250111298",R.drawable.mahdi));
        items.add(new dataclass("Nama: Fajri ","Nim: 12250110382",R.drawable.fajri));
        items.add(new dataclass("Nama: Fakhri","Nim: 12250111381",R.drawable.fakhri));
        items.add(new dataclass("Nama: Farras Lathief","Nim: 12250111328",R.drawable.faras));
        items.add(new dataclass("Nama: Gilang Ramadhan Indra","Nim: 12250111323",R.drawable.gilang));
        items.add(new dataclass("Nama: Hafidz Alhadid Rahman","Nim: 12250111794",R.drawable.hafiz));
        items.add(new dataclass("Nama: Haritsah Naufaldy","Nim: 12250110361",R.drawable.aldy));
        items.add(new dataclass("Nama: M. Nabil Dawami ","Nim: 12250111527",R.drawable.nabil));
        items.add(new dataclass("Nama: Muh. Zaki Erbai Syas","Nim: 12250111134",R.drawable.zaki));
        items.add(new dataclass("Nama: Muhammad Aditya Rinaldi ","Nim: 12250111048",R.drawable.adit));
        items.add(new dataclass("Nama: Muhammad Dhimas Hadid Fahrezi","Nim: 12250111231",R.drawable.dimas));
        items.add(new dataclass("Nama: Muhammad Faruq","Nim: 12250111791",R.drawable.faruq));
        items.add(new dataclass("Nama: Muhammad Rafly Wirayudha","Nim: 12250111489",R.drawable.rafly));
        items.add(new dataclass("Nama: Nurika Dwi Wahyuni","Nim: 12250120360",R.drawable.nurika));
        items.add(new dataclass("Nama: Ogya Secio Noegroho.s ","Nim: 12250111346\n",R.drawable.ogik));
        items.add(new dataclass("Nama: Rahma Laksita","Nim: 12250124357",R.drawable.rahma));
        items.add(new dataclass("Nama: Surya Hidayatullah Firdaus","Nim: 12250111759",R.drawable.surya));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new classmahasiswa(getApplicationContext(),items));

    }
}