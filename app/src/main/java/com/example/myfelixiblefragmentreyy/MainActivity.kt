package com.example.myfelixiblefragmentreyy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentsatu = FragmentSatu ()
        val fragment:Fragment? =
            supportFragmentManager.findFragmentByTag(fragmentsatu::class.java.simpleName)
        if (fragment !is  FragmentSatu) {
            supportFragmentManager.beginTransaction()
                .add(R.id.frame_container,fragmentsatu,fragmentsatu::class.java.simpleName)
                .commit()
        }
    }
}