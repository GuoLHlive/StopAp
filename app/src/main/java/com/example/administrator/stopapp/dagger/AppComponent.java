package com.example.administrator.stopapp.dagger;

import android.support.v4.app.Fragment;

import com.example.administrator.stopapp.app.MyApp;
import com.example.administrator.stopapp.fragment.BaseFragment;
import com.example.administrator.stopapp.fragment.FirstFragment;
import com.example.administrator.stopapp.fragment.NextFragment;

import java.util.ArrayList;
import java.util.HashMap;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2016/12/5.
 */


@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MyApp app);

    ArrayList<BaseFragment> getFragmentList();


}
