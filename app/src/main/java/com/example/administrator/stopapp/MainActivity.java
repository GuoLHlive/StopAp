package com.example.administrator.stopapp;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.administrator.stopapp.app.MyApp;
import com.example.administrator.stopapp.dagger.AppComponent;
import com.example.administrator.stopapp.dagger.DaggerAppComponent;
import com.example.administrator.stopapp.databinding.ActivityMainBinding;

import com.example.administrator.stopapp.fragment.BaseFragment;
import com.example.administrator.stopapp.fragment.FirstFragment;

import java.util.ArrayList;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {


    private AppComponent appComponent;
    public FirstFragment firstFragment;
    private ActivityMainBinding binding;
    private ArrayList<BaseFragment> fragmentlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        appComponent = MyApp.getApp(getApplicationContext()).component();
        fragmentlist = appComponent.getFragmentList();
        firstFragment = new FirstFragment();
        fragmentlist.add(firstFragment);
        getSupportFragmentManager().beginTransaction().replace(R.id.mfragment,firstFragment).commit();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MactivityFragment","del");
        if (fragmentlist!=null){
            fragmentlist.clear();
            fragmentlist = null;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MactivityFragment","onResume");
    }
}
