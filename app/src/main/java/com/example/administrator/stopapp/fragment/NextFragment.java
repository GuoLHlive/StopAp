package com.example.administrator.stopapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.stopapp.R;
import com.example.administrator.stopapp.databinding.NextfragmentLayoutBinding;

/**
 * Created by Administrator on 2016/12/5.
 */
public class NextFragment extends BaseFragment{


    private NextfragmentLayoutBinding binding;
    private NextFragment nextFragment;
    private FirstFragment firstFragment;


    @Override
    public int getLayoutId() {
        return R.layout.nextfragment_layout;
    }

    @Override
    public void initView() {
        binding = (NextfragmentLayoutBinding) view;
        binding.setTxt("NextFragment");
        firstFragment = new FirstFragment();
        nextFragment = this;
        binding.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchContent(nextFragment,firstFragment);
            }
        });
    }
}
