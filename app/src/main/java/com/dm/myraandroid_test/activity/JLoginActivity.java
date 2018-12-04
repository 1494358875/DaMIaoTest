package com.dm.myraandroid_test.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dm.myraandroid_test.R;
import com.dm.myraandroid_test.bean.JUser;
import com.dm.myraandroid_test.databinding.DMMBinding;

public class JLoginActivity extends AppCompatActivity {

    private JUser jUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_jlogin);
        DMMBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_jlogin);
        jUser = new JUser();
        jUser.setName("小王啊");
        jUser.setPassword("adasgqwg");
        jUser.setEdit("dd");
        viewDataBinding.setJuserj(jUser);
        JBtHandler jBtHandler = new JBtHandler();
        viewDataBinding.setJbtj(jBtHandler);
    }


    public class JBtHandler {
        public void JAddcount() {
            jUser.setCount(jUser.getCount() + 1);
        }

        public void JRomovecount() {
            jUser.setCount(jUser.getCount() - 1);
        }

        public void JAddEdit() {
            jUser.setCount(jUser.getCount() + 1);
            jUser.setEdit(jUser.getEdit() + 1);
        }

        public void JRemoveEdit() {
            jUser.setCount(jUser.getCount() - 1);
            jUser.setEdit(jUser.getEdit().substring(0, jUser.getEdit().length() - 1));
        }
    }

}
