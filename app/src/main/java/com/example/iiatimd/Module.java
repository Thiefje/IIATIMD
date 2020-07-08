package com.example.iiatimd;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Module {

    @ColumnInfo
    private String moduleCode;
    @ColumnInfo
    private int ec;
    @ColumnInfo
    private String cijfer;
    @ColumnInfo
    private String onderdeel;
    @PrimaryKey
    private int uuid;

    public Module(String moduleCode, int ec, String onderdeel, String cijfer, int uuid)
    {
        this.moduleCode = moduleCode;
        this.ec = ec;
        this.onderdeel = onderdeel;
        this.cijfer = cijfer;
        this.uuid = uuid;
    }

    public String getModuleCode(){
        return this.moduleCode;
    }

    public int getEc() {
        return this.ec;
    }

    public String getOnderdeel() {
        return this.onderdeel;
    }

    public String getCijfer() {
        return this.cijfer;
    }

    public int getUuid(){
        return this.uuid;
    }
}
