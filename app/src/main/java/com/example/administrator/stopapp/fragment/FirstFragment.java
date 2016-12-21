package com.example.administrator.stopapp.fragment;

import android.view.View;


import com.example.administrator.stopapp.R;
import com.example.administrator.stopapp.databinding.FirstfragmentLayoutBinding;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/5.
 */
public class FirstFragment extends BaseFragment {

    private FirstfragmentLayoutBinding binding;
    private NextFragment nextFragment;
    private FirstFragment firstFragment;
    @Override
    public int getLayoutId() {
        return R.layout.firstfragment_layout;
    }

    @Override
    public void initView() {
        binding = (FirstfragmentLayoutBinding) view;
        binding.setTxt("FirstFragment");
        nextFragment = new NextFragment();
        firstFragment = this;
        binding.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               switchContent(firstFragment,nextFragment);
            }
        });
    }
}
