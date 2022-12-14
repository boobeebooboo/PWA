package ru.andrey.pwa

import android.content.Intent
import android.os.Bundle
import android.support.customtabs.trusted.LauncherActivity
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open_twa_button.setOnClickListener {
            startActivity(Intent(this, LauncherActivity::class.java))
        }
    }
}
