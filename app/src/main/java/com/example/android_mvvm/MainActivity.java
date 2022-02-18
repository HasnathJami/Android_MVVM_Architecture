package com.example.android_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.android_mvvm.databinding.ActivityMainBinding;
import com.example.android_mvvm.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainxml= DataBindingUtil.setContentView(this,R.layout.activity_main);

       // Product p=new Product("Jishan");
        mainViewModel= ViewModelProviders.of(this).get(MainViewModel.class);
        mainxml.setCustomer(mainViewModel.getCustomer());
    }
}