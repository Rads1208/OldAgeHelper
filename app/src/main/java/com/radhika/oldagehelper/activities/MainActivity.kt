package com.radhika.oldagehelper.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import com.radhika.oldagehelper.R
import com.radhika.oldagehelper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.white)

        //Bottom Navigation Bar
        val popupMenu = PopupMenu(this, null)
        popupMenu.inflate(R.menu.bottom_menu)
        val menu = popupMenu.menu
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_controller) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomBar.setupWithNavController(menu, navController)
    }
}