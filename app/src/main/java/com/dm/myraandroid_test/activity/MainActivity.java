package com.dm.myraandroid_test.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dm.myraandroid_test.R;
import com.dm.myraandroid_test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        此活动的布局是数据绑定布局，因此需要使用它进行膨胀
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        返回的绑定引用具有ID的所有视图。
        activityMainBinding.buttonKotlintRecommend.setOnClickListener((view) -> {
            startActivity(new Intent(this, DM_LoginActivity.class));
        });
        activityMainBinding.buttonJavaRecommend.setOnClickListener((view) -> {
            startActivity(new Intent(this, JLoginActivity.class));
        });
    }
}
