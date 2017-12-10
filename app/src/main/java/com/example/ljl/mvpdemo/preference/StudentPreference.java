package com.example.ljl.mvpdemo.preference;

import android.content.Context;

import com.example.ljl.mvpdemo.bean.Student;
import com.example.ljl.mvpdemo.model.IStudentModer;
import com.example.ljl.mvpdemo.model.SrudentModer;
import com.example.ljl.mvpdemo.view.IView;

import java.util.List;

/**
 * Created by Ljl on 2017/12/10.
 */

public class StudentPreference {
    private IView view;
    private IStudentModer studentModer;

    public StudentPreference(Context context){
        view = (IView) context;
        studentModer = new SrudentModer();
    }

    public void showData(){
        studentModer.loadStudentInfo(new IStudentModer.onStudentInfoLiser() {
            @Override
            public void loadInfo(List<Student> students) {
                view.showData(students);
            }
        });
    }
}
