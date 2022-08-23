package com.example.myapplication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.jetbrains.annotations.NotNull;

public class MianViewModel extends AndroidViewModel {
    Product product;
    public MianViewModel(@NonNull @NotNull Application application) {
        super(application);
        product =new Product("Product 1");

    }
    public Product getProduct(){
        return this.product;
    }

}
