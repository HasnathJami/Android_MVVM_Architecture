package com.example.android_mvvm.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.android_mvvm.models.Customer;

public class MainViewModel extends AndroidViewModel {

    Customer customer;


    public MainViewModel(@NonNull Application application) {
        super(application);
        customer=new Customer("Hasnath Jami Chowdhury");
    }

    public Customer getCustomer()
    {
        return this.customer;
    }
}
