package com.example.administrator.stopapp;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.stopapp.app.MyApp;
import com.example.administrator.stopapp.dagger.AppComponent;
import com.example.administrator.stopapp.databinding.ActivityMainBinding;

import com.example.administrator.stopapp.fragment.BaseFragment;
import com.example.administrator.stopapp.fragment.FirstFragment;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {


    private AppComponent appComponent;
    @Inject
    public FirstFragment firstFragment;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        appComponent = MyApp.getApp(getApplicationContext()).component();
        firstFragment =appComponent.getFirstFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.mfragment,firstFragment).commit();

    }
}
