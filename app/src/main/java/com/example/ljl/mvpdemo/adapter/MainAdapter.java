package com.example.ljl.mvpdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ljl.mvpdemo.R;
import com.example.ljl.mvpdemo.bean.Student;

import java.util.List;

/**
 * Created by Ljl on 2017/12/10.
 */

public class MainAdapter extends BaseAdapter {
    private Context context;
    private List<Student> students;

    public MainAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int positoin) {
        return null;
    }

    @Override
    public long getItemId(int positoin) {
        return positoin;
    }

    @Override
    public View getView(int positoin, View view, ViewGroup viewGroup) {
        Student student = students.get(positoin);
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.activity_main_list, null);
            viewHolder.tv_name = view.findViewById(R.id.tv_name);
            viewHolder.tv_age = view.findViewById(R.id.tv_age);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv_name.setText(student.getName());
        viewHolder.tv_age.setText(Integer.toString(student.getAge()));
        return view;
    }

    class ViewHolder {
        TextView tv_name;
        TextView tv_age;
    }
}
