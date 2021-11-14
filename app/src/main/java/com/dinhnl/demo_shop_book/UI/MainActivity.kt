package com.dinhnl.demo_shop_book.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.dinhnl.demo_shop_book.R
import com.dinhnl.demo_shop_book.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setFragment()
    }

    private fun setFragment() {
        val navControler = findNavController(R.id.fragmentContainerView)
        binding.bottomNavigation.apply {
            itemIconTintList = null
            setupWithNavController(navControler)
        }
    }

}