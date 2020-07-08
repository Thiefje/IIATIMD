package com.example.iiatimd;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

public class Jaar1Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaar1);

        recyclerView = findViewById(R.id.recyclerViewJ1);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.hasFixedSize();

        Module[] modulen = new Module[3];

        modulen[0] = new Module("IPMEDT1", 6, "propedeuse", "6,9", 0);
        modulen[1] = new Module("IMHTB", 3, "propedeuse", "7,5", 1);
        modulen[2] = new Module("IOPR1", 4, "propedeuse", "8,6", 2);

        recyclerViewAdapter = new ModuleAdapter(modulen);
        recyclerView.setAdapter(recyclerViewAdapter);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "ModuleDB").build();

    }
}