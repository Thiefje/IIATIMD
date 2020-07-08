package com.example.iiatimd;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Module.class, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ModuleDAO ModuleDAO();

    private static AppDatabase instance;

    static synchronized AppDatabase getInstance(Context context){
        if(instance == null){
            instance = create(context);
        }
        return instance;
    }

    private static AppDatabase create(final Context context){
        return Room.databaseBuilder(context, AppDatabase.class, "modulen").fallbackToDestructiveMigration().build();
    }
}