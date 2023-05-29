package com.example.academylessons.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.academylessons.Music_List_Activity
import com.example.academylessons.R
import com.example.academylessons.SignUpActivity
import com.example.academylessons.databinding.ActivityLoginBinding
import com.example.academylessons.models.User

class Splash_Activity : AppCompatActivity() {

    private  val userCache: UserCacheManager by lazy {
        UserCacheManager(this)
    }

    private val user: User by lazy {
        userCache.getUser() ?: User.unknown()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var intent = if (user.isAuth) {
            Intent(this, Music_List_Activity::class.java)
        }else{
            Intent(this,SignUpActivity::class.java)
        }
        startActivity(intent)
    }
}