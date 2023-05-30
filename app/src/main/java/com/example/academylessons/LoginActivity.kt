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

        showToast(getString(R.string.you_clicked_on_the_button))

        binding.enterButton.setOnClickListener {
            showToast(getString(R.string.you_clicked_on_the_button))
            val loginText = binding.loginEditText.text.toString()
            val passwordText = binding.loginEditText.text.toString()
            when {
                loginText.isEmpty() -> {
                    showToast(getString(R.string.Fill_in_the_login_input_field))
                }

                !loginText.contains("@gmail.com") -> {
                    showToast(getString(R.string.Incorrect_login_entry))
                }

                passwordText.isEmpty() -> {
                    showToast(getString(R.string.Fill_in_the_text))
                }

                passwordText.length <= 8 -> {
                    showToast(getString(R.string.The_threshold_must_contain_at_least_8_characters))
                }

                else -> {
                    showToast(getString(R.string.everything_is_correct))
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