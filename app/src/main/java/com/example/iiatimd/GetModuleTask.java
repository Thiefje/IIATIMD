package com.example.iiatimd;

public class GetModuleTask implements Runnable{
    AppDatabase db;

    public GetModuleTask(AppDatabase db){
        this.db = db;
    }

    @Override
    public void run(){
        String moduleCode = db.ModuleDAO().getAll().get(0).getModuleCode();
    }
}
