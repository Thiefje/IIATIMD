package com.example.iiatimd;

public class InsertModuleTask implements Runnable {

    AppDatabase db;
    Module modulen;

    public InsertModuleTask(AppDatabase db){
        this.db = db;
        this.modulen = modulen;
    }

    @Override
    public void run(){
        db.ModuleDAO().insertModule(this.modulen);
    }

}
