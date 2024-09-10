package com.example.tugaspertemuan4

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugaspertemuan4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)


        with(binding)
        {
            buttonSignup.setOnClickListener {
                val email =inputEmail.text.toString()
                val fullName =inputFullname.text.toString()
                val username = inputUsername.text.toString()
                val password = inputPassword.text.toString()

                val userData = mapOf(
                    "Email" to email,
                    "Full Name" to fullName,
                    "Username" to username,
                    "Password" to password
                )

                userData.forEach { key, value ->
                    var displayValue = value
                    if (value.length == 0) {
                        displayValue = "Tidak diisi"
                    }
                    Toast.makeText(this@MainActivity, key + ": " + displayValue, Toast.LENGTH_SHORT).show()
                }

            }
        }

    }
}