package com.example.semana18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Ver.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }

        setupViewPager2()
    }

    private fun setupViewPager2() {
        val list: MutableList<String> = ArrayList()
        list.add("LUNA ACOSTA, KEVIN ALEXANDER")
        list.add("Google Maps es" +
                " una herramienta de búsqueda de ubicaciones" +
                " que permite geolocalizar un punto concreto," +
                " calcular rutas, encontrar los lugares de interés" +
                " más cercanos o ver la apariencia de un lugar a pie" +
                " de calle a través de Google Street View")


        val colorList: MutableList<String> = ArrayList()
        colorList.add("#F0F8FF")
        colorList.add("#F0FFFF")



      // Set adapter to viewPager.
       viewPager.adapter = ViewPagerAdapter(this, list, colorList)
    }
}