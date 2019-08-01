package com.example.viewpagerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vp = findViewById<ViewPager>(R.id.viewPager)
        //val tab = findViewById(R.id.tabs)


        vp.adapter = ViewPagerAdapter(supportFragmentManager)


        tabs.setupWithViewPager(vp)
        tabs.getTabAt(0)!!.setIcon(android.R.drawable.btn_star)
        tabs.getTabAt(1)!!.setIcon(android.R.drawable.btn_star)
        tabs.getTabAt(2)!!.setIcon(android.R.drawable.btn_star)

    }
}
