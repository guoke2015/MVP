package com.example.ljl.mvpdemo.view;

import com.example.ljl.mvpdemo.bean.Student;

import java.util.List;

/**
 * Created by Ljl on 2017/12/10.
 */

public interface IStudentView {
    void showLoad();

    void hideLoad();

    void showSuccess(List<Student> students);

    void showFail(String error);
}
