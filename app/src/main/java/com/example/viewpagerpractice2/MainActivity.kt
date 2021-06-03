package com.example.viewpagerpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagerpractice2.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter


    }
}