package com.example.tugasppab8

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.tablayout.R
import com.example.tablayout.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("Username")
        val usernameHtml = "Welcome back, <font color='#525BFF'>$username</font>"
        username?.let {
            binding.tvOutput.text = Html.fromHtml(usernameHtml)
        }

        setSupportActionBar(binding.toolbar)
    }
}
