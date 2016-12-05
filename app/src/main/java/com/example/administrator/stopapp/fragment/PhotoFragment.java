package com.example.administrator.stopapp.fragment;

import com.example.administrator.stopapp.R;
import com.example.administrator.stopapp.databinding.PhotofragmentLayoutBinding;

/**
 * Created by Administrator on 2016/12/5.
 */
public class PhotoFragment extends BaseFragment {

    private PhotofragmentLayoutBinding binding;

    @Override
    public int getLayoutId() {
        return R.layout.photofragment_layout;
    }

    @Override
    public void initView() {
        binding = (PhotofragmentLayoutBinding) view;
        binding.setTxt("PhotoFragment");
    }
}
