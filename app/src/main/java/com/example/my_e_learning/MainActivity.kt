package com.example.my_e_learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.my_e_learning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniView()
    }
    private fun iniView(){
        val navController = binding.fcvNavigation.getFragment<NavHostFragment>().navController
        binding.bottomNavigationView.setupWithNavController(navController)

    }

}