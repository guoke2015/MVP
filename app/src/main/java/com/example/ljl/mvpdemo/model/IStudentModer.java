package com.example.ljl.mvpdemo.model;

import com.example.ljl.mvpdemo.bean.Student;

import java.util.List;

/**
 * Created by Ljl on 2017/12/10.
 */

public interface IStudentModer {
    void loadStudentInfo(onStudentInfoLiser infoLiser);

    interface onStudentInfoLiser{
        void loadInfo(List<Student> students);
    }
}
