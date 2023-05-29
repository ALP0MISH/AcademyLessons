package com.example.academylessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.academylessons.databinding.ActivityLoginBinding
import com.example.academylessons.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivitySignUpBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tvLogin.setOnClickListener {
            val intent =Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        val NameText = binding.loginNameEditText.text.toString()
        val LastNameText = binding.loginLastNameText
        binding.CreateAccaunt.setOnClickListener {
            val loginText = binding.loginNameEditText.text.toString()
            when {
                loginText.isEmpty() -> showToast("вы нажали на кнопку")

                !loginText.contains("@gmail.com") -> {
                    showToast("неправельный код логина")
                }

                else -> {
                    navigateToMusicListActivity()


                }
            }


        }

    }
        private fun navigateToMusicListActivity() {
            val intent = Intent(this, Music_List_Activity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)

            startActivity(intent)
        }


        private fun showToast(massege: String) {
            Toast.makeText(this, massege, Toast.LENGTH_SHORT)


        }
    }
