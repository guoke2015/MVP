package com.example.ljl.mvpdemo.activity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ljl.mvpdemo.R;
import com.example.ljl.mvpdemo.adapter.MainAdapter;
import com.example.ljl.mvpdemo.base.BaseActivity;
import com.example.ljl.mvpdemo.bean.Student;
import com.example.ljl.mvpdemo.presenter.StudentPresenter;
import com.example.ljl.mvpdemo.view.IView;

import java.util.List;

public class MainActivity extends BaseActivity<IView,StudentPresenter<IView>> implements IView {
    private ListView list;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mPresenter.fetch();
    }

    @Override
    protected StudentPresenter<IView> creatPresenter() {
        return new StudentPresenter();
    }

    private void initView() {
        list = findViewById(R.id.list);
    }

    @Override
    public void showLoad() {

    }

    @Override
    public void hideLoad() {

    }

    @Override
    public void showSuccess(List<Student> students) {
        mainAdapter = new MainAdapter(this, students);
        list.setAdapter(mainAdapter);
    }

    @Override
    public void showFail(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
