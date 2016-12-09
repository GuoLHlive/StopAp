package com.example.administrator.stopapp.fragment;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.stopapp.R;
import com.example.administrator.stopapp.app.MyApp;
import com.example.administrator.stopapp.dagger.AppComponent;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/5.
 */
public abstract class BaseFragment extends Fragment {

    protected AppComponent appComponent;
    protected ViewDataBinding view;

    @Inject
    protected ArrayList<BaseFragment> fragmentlist;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null){
            view =  DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
            appComponent = MyApp.getApp(getContext()).component();
            fragmentlist = appComponent.getFragmentList();
            initView();
        }
        return view.getRoot();
    }


    public abstract int getLayoutId();
    public abstract void initView();

    protected void switchContent(BaseFragment from,BaseFragment to){
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.push_left_in,
                R.anim.push_left_out,
                R.anim.push_left_in,
                R.anim.push_left_out);
        if (!to.isAdded()){
//            fragmentlist.add(to);
            transaction.hide(from).add(R.id.mfragment,to).commit();
        }else {
            transaction.hide(from).show(to).commit();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
//        getFocus();

    }

    public void getFocus() {
        View view = getView();
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if (keyEvent.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    // 监听到返回按钮点击事件
                    int size = fragmentlist.size();
                    Log.i("Mainacitvity",size+"");
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.setCustomAnimations(R.anim.push_left_in,
                            R.anim.push_left_out,
                            R.anim.push_left_in,
                            R.anim.push_left_out);
//                    if (size==0){
//                        getActivity().finish();
//                   }else if(size==1){
//                        transaction.remove(fragmentlist.get(0)).show(appComponent.getFirstFragment()).commit();
//                        fragmentlist.clear();
//                   }else {
//                        transaction.remove(fragmentlist.get(size-1)).show(fragmentlist.get(size-2)).commit();
//                        fragmentlist.remove(fragmentlist.get(size-1));
//                    }
                    return true;
                }
                return false;
            }
        });
    }
}
