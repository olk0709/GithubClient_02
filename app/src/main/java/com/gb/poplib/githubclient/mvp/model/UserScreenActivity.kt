package com.gb.poplib.githubclient.mvp.model

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gb.poplib.githubclient.R


class UserScreenActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USER_LOGIN = "extra_user_login"
    }

    private lateinit var userLoginTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_screen)

        userLoginTextView = findViewById(R.id.user_login)

        val userLogin = intent.getStringExtra(EXTRA_USER_LOGIN)
        userLoginTextView.text = userLogin
    }
}