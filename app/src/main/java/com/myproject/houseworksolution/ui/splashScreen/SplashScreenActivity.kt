package com.myproject.houseworksolution.ui.splashScreen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.myproject.houseworksolution.R
import com.myproject.houseworksolution.databinding.ActivitySplashScreenBinding
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen)
        binding.lifecycleOwner = this


    }
    override fun onBackPressed() {

        val navigationController = nav_host_fragment.findNavController()
        when (navigationController.currentDestination?.id) {
            R.id.splashScreenFragment -> {
                finish()
            }
            R.id.secondSplashScreenFragment -> {
                finish()
            }
            else -> {
                super.onBackPressed()
            }
        }

    }
}
