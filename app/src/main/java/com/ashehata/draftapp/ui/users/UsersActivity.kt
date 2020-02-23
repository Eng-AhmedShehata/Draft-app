package com.ashehata.draftapp.ui.users

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ashehata.draftapp.R
import com.ashehata.draftapp.ui.addUser.AddUserActivity
import kotlinx.android.synthetic.main.activity_users.*

class UsersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
        setFabClicked()

    }

    private fun setFabClicked() {
        fab_add.setOnClickListener{
            startActivity(Intent(this, AddUserActivity::class.java).apply {
                // Here, you can add any fields to intent
            })
        }

    }
}
