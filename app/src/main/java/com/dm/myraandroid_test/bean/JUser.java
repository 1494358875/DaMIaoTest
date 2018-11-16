package com.dm.myraandroid_test.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.dm.myraandroid_test.BR;

public class JUser extends BaseObservable {
    private String name;
    private String password;
    private int count;
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //只更新本字段
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        //更新所有字段
        //notifyChange();
        notifyPropertyChanged(BR.password);
    }
    @Bindable
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        notifyPropertyChanged(BR.count);
    }
}
