package com.example.administrator.stopapp.dagger;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.example.administrator.stopapp.fragment.BaseFragment;
import com.example.administrator.stopapp.fragment.FirstFragment;
import com.example.administrator.stopapp.fragment.NextFragment;

import java.util.ArrayList;
import java.util.HashMap;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/12/5.
 */


@Module
public class AppModule {
    @Singleton
    @Provides
    public FirstFragment providesFirstFragment(){
        return new FirstFragment();
    }
    @Singleton
    @Provides
    public NextFragment providesNextFragment(){
        return new NextFragment();
    }


    @Provides
    public ArrayList<BaseFragment> providesArrayList(){
        return new ArrayList<>();
    }

}
