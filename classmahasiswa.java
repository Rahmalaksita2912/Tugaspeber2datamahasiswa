package com.example.datamahasiswa;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class classmahasiswa extends RecyclerView.Adapter<mahasiswa>{
    Context context;
    List<dataclass> items;

    public classmahasiswa(Context context, List<dataclass> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public mahasiswa onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new mahasiswa(LayoutInflater.from(context).inflate(R.layout.viewmahasiswa,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  mahasiswa holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.nimView.setText(items.get(position).getNim());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}