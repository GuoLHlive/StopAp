package com.example.administrator.stopapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/12/9.
 */
public class FragmentRecyclerAdapter extends RecyclerView.Adapter<FragmentRecyclerAdapter.MyAdapter> {
    @Override
    public MyAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyAdapter extends RecyclerView.ViewHolder {
        public MyAdapter(View itemView) {
            super(itemView);
        }
    }
}
