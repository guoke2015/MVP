package com.example.ljl.mvpdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ljl.mvpdemo.R;
import com.example.ljl.mvpdemo.adapter.MainAdapter;
import com.example.ljl.mvpdemo.bean.Student;
import com.example.ljl.mvpdemo.preference.StudentPreference;
import com.example.ljl.mvpdemo.view.IView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IView {
    private ListView list;
    private MainAdapter mainAdapter;
    private StudentPreference studentPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        studentPreference = new StudentPreference(this);
        studentPreference.showData();
    }

    private void initView() {
        list = findViewById(R.id.list);
    }

    @Override
    public void showData(List<Student> students) {
        mainAdapter = new MainAdapter(this, students);
        list.setAdapter(mainAdapter);
    }
}
