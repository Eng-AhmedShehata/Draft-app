package com.ashehata.draftapp.ui.addUser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ashehata.draftapp.R
import com.ashehata.draftapp.data.local.room.AppDatabase
import com.ashehata.draftapp.data.local.room.User
import kotlinx.android.synthetic.main.activity_add_user.*

class AddUserActivity : AppCompatActivity() {

    lateinit var viewModel: AddUserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)

        viewModel = ViewModelProviders.of(this).get(AddUserViewModel::class.java)
        viewModel.isValid.observe(this, Observer {

            Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
        })
        setAddBtnClicked()

    }

    private fun setAddBtnClicked() {
        btn_add.setOnClickListener {

            // Get entered data from ETs
            val name = et_userName.text.toString()
            val salary = et_userSalary.text.toString().toIntOrNull()
            // Passing data to viewModel class
            viewModel.setUserData(User(null, name, salary))
        }
    }
}
