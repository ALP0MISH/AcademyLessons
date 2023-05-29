package com.example.academylessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import com.example.academylessons.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        showToast("кнопку")

        binding.enterButton.setOnClickListener {
            showToast("вы нажали на кнопку")
            val loginText = binding.loginEditText.text.toString()
            val passwordText = binding.loginEditText.text.toString()
            when {
                loginText.isEmpty() -> {
                    showToast("Заполните поле ввода для логина")
                }

                !loginText.contains("@gmail.com") -> {
                    showToast("Не правелбный ввод логина")
                }

                passwordText.isEmpty() -> {
                    showToast("Заполните текст")
                }

                passwordText.length <= 8 -> {
                    showToast("Пороль должен содержать не менее 8 символов ")
                }

                else -> {
                    showToast("все правельно")
                    val intent = Intent(this, Music_List_Activity::class.java)
                    startActivity(intent)

                }
            }

            binding.tvRegistration.setOnClickListener {
                val intent = Intent(this,SignUpActivity::class.java)
                startActivity(intent)
            }
        }

        
    }


    private fun showToast(message: String) {
        Toast.makeText(
            this,
            "вы нажали на кнопку",
            Toast.LENGTH_SHORT
        ).show()
    }


}