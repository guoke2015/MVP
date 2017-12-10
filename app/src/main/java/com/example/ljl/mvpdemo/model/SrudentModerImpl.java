package com.example.ljl.mvpdemo.model;

import com.example.ljl.mvpdemo.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ljl on 2017/12/10.
 */
public class SrudentModerImpl implements IStudentModer {
    @Override
    public void loadStudentInfo(onStudentLisetener infoLiser) {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(15);
        students.add(student);

        Student student2 = new Student();
        student2.setName("lisi");
        student2.setAge(16);
        students.add(student2);

        Student student3 = new Student();
        student3.setName("wangwu");
        student3.setAge(17);
        students.add(student3);

        Student student4 = new Student();
        student4.setName("wangmazi");
        student4.setAge(18);
        students.add(student4);

        infoLiser.onSucess(students);
    }
}
