package com.example.tugasppab8


import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import com.example.tablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object {
        @StringRes
        private val tabName = intArrayOf(
            com.example.tablayout.R.string.tab_text_1, // Use your app's R file
            com.example.tablayout.R.string.tab_text_2
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            setSupportActionBar(toolbar);
            viewPager.adapter = SectionsPagerAdapter(this@MainActivity)
            TabLayoutMediator(tabLayout,viewPager){ tab, position ->
                //berikut merupakan nama tabnya
                tab.text = resources.getString(tabName[position])
            }.attach()

        }
    }
}