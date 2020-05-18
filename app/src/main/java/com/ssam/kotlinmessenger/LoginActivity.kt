package com.ssam.kotlinmessenger

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin_login.setOnClickListener {
            val email = etEmail_login.text.toString()
            val password = etPassword_login.text.toString()

            Log.d("Login", "Attempt login with email/pw : $email/***")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener {

                }

        }

        tvBack_registration.setOnClickListener {
            finish()
        }

    }

}