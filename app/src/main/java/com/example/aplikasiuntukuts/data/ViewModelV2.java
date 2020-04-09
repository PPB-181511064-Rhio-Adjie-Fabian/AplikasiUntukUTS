package com.example.aplikasiuntukuts.data;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ViewModelV2 extends AndroidViewModel {
    private CheeseRepository cheeseRepository;
    private LiveData<List<Cheese>> listLiveData;
    public ViewModelV2(Application application){
        super(application);
        cheeseRepository = new CheeseRepository(application);
        listLiveData = cheeseRepository.getAllCheese();
    }
    public LiveData<List<Cheese>> getAllCheese(){ return this.listLiveData; }
}
