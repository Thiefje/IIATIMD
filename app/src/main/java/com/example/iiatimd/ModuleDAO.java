package com.example.iiatimd;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface ModuleDAO {

    @Query("SELECT * FROM module")
    List<Module> getAll();

    @Insert
    void insertModule(Module module);

    @Delete
    void delete(Module module);
}
