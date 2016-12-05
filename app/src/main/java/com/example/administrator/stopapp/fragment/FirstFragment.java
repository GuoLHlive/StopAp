package com.example.administrator.stopapp.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.stopapp.R;
import com.example.administrator.stopapp.databinding.FirstfragmentLayoutBinding;

/**
 * Created by Administrator on 2016/12/5.
 */
public class FirstFragment extends BaseFragment {

    private FirstfragmentLayoutBinding binding;


    @Override
    public int getLayoutId() {
        return R.layout.firstfragment_layout;
    }

    @Override
    public void initView() {
        binding = (FirstfragmentLayoutBinding) view;
        binding.setTxt("FirstFragment");
        binding.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               switchContent(appComponent.getFirstFragment(),appComponent.getNextFragment());
            }
        });
    }
}
