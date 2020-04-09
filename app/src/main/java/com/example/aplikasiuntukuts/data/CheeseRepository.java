package com.example.aplikasiuntukuts.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class CheeseRepository {
    private CheeseDao dao;
    private LiveData<List<Cheese>> cheeseLiveData;

    public CheeseRepository(Application application){
        SampleDatabase db = SampleDatabase.getInstance(application);
        dao = db.cheeseDao();
        cheeseLiveData= dao.getAlphabetizedTasks();
    }

    LiveData<List<Cheese>> getAllCheese(){ return  cheeseLiveData; }
}
