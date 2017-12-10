package com.example.ljl.mvpdemo.model;

import com.example.ljl.mvpdemo.bean.Student;

import java.util.List;

/**
 * Created by Ljl on 2017/12/10.
 */

public interface IStudentModer {
    void loadStudentInfo(onStudentLisetener infoLiser);

    interface onStudentLisetener {
        void onSucess(List<Student> students);
        void onFail(String error);
    }
}
