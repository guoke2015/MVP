package com.example.ljl.mvpdemo.presenter;

import com.example.ljl.mvpdemo.base.BasePresenter;
import com.example.ljl.mvpdemo.bean.Student;
import com.example.ljl.mvpdemo.model.IStudentModer;
import com.example.ljl.mvpdemo.model.SrudentModerImpl;
import com.example.ljl.mvpdemo.view.IView;

import java.util.List;

/**
 * Created by Ljl on 2017/12/10.
 */

public class StudentPresenter<V extends IView> extends BasePresenter<V> {

    //model层的引用
    private IStudentModer studentModer = new SrudentModerImpl();

    //构造方法
    public StudentPresenter() {

    }

    //执行操作
    public void fetch() {
        if (mViewRef.get() != null) {
            mViewRef.get().showLoad();
            if (studentModer != null) {
                studentModer.loadStudentInfo(new IStudentModer.onStudentLisetener() {
                    @Override
                    public void onSucess(List<Student> students) {
                        mViewRef.get().showSuccess(students);
                    }

                    @Override
                    public void onFail(String error) {
                        mViewRef.get().showFail(error);
                    }
                });
                mViewRef.get().hideLoad();
            } else {
                mViewRef.get().hideLoad();
            }
        }
    }
}
