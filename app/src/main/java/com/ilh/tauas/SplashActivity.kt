package com.ilh.tauas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ilh.tauas.ui.activity.DataActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    // private var mDelayHandler: Handler? = null
    //private val SPLASH_DELAY: Long = 20000 //3 seconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        // mDelayHandler = Handler() colokin hp nya  hanum sek iyaa udah bisa ?



        // mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)

        btnStart.setOnClickListener {
            val intent = Intent(applicationContext, DataActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    internal val mRunnable: Runnable = Runnable {
        if (!isFinishing) {


        }
    }
}