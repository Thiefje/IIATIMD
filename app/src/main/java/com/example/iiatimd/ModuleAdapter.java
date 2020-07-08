package com.example.iiatimd;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.ModuleViewHolder> {
    private Module[] modulen;

    public ModuleAdapter(Module[] modulen){
        this.modulen = modulen;
    }

    public static class ModuleViewHolder extends RecyclerView.ViewHolder{
        public TextView moduleView;

        public ModuleViewHolder(View v){
            super(v);
            moduleView = v.findViewById(R.id.moduleView);
        }
    }

    @NonNull
    @Override
    public ModuleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.module_card, parent,false);
        ModuleViewHolder moduleViewHolder = new ModuleViewHolder(v);
        return moduleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ModuleViewHolder holder, int position) {
        holder.moduleView.setText("Module: " + modulen[position].getModuleCode() + "   " + "Cijfer: " + modulen[position].getCijfer());
    }

    @Override
    public int getItemCount() {
        return modulen.length;
    }
}
