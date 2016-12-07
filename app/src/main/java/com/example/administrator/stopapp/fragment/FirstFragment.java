package com.example.administrator.stopapp.fragment;

import android.view.View;


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
