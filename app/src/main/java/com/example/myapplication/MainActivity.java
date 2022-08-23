package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    MianViewModel mianViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding mainxml= DataBindingUtil.setContentView(this,R.layout.activity_main);
       // Product p=new Product("Product 1");
        mianViewModel= ViewModelProviders.of(this).get(MianViewModel.class);

        mainxml.setProduct(mianViewModel.getProduct());

    }
}