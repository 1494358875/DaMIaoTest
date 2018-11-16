package com.dm.myraandroid_test.activity

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dm.myraandroid_test.R
import com.dm.myraandroid_test.bean.User
import com.dm.myraandroid_test.databinding.ActivityDmLoginBinding
import kotlinx.android.synthetic.main.activity_dm__login.*

class DM_LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dm__login)
    }
    fun setView(){
        val ActivityDmLoginBinding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_dm__login)
        val user = User("小王", "19874653210")
    }
}
