package com.myproject.houseworksolution.ui.splashScreen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.myproject.houseworksolution.R
import com.myproject.houseworksolution.databinding.SplashScreenFragmentBinding

class SplashScreenFragment : Fragment() {

    private lateinit var binding: SplashScreenFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = SplashScreenFragmentBinding.inflate(inflater)
        binding.lifecycleOwner = viewLifecycleOwner
        // Inflate the layout for this fragment

        initMotion()
        return binding.root
    }

    private fun initMotion() {
        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutH.transitionToEnd()
            binding.constraintLayoutH.transitionToStart()
        }, 100)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutO2.transitionToEnd()
            binding.constraintLayoutO2.transitionToStart()
        }, 600)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutU.transitionToEnd()
            binding.constraintLayoutU.transitionToStart()
        }, 1100)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutS.transitionToEnd()
            binding.constraintLayoutS.transitionToStart()
        }, 1600)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutE.transitionToEnd()
            binding.constraintLayoutE.transitionToStart()
        }, 2100)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutW.transitionToEnd()
            binding.constraintLayoutW.transitionToStart()
        }, 2600)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutO.transitionToEnd()
            binding.constraintLayoutO.transitionToStart()
        }, 3100)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutR.transitionToEnd()
            binding.constraintLayoutR.transitionToStart()
        }, 3600)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutK.transitionToEnd()
            binding.constraintLayoutK.transitionToStart()
        }, 4100)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutS2.transitionToEnd()
            binding.constraintLayoutS2.transitionToStart()
        }, 4600)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutO3.transitionToEnd()
            binding.constraintLayoutO3.transitionToStart()
        }, 5100)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutL.transitionToEnd()
            binding.constraintLayoutL.transitionToStart()
        }, 5600)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutU2.transitionToEnd()
            binding.constraintLayoutU2.transitionToStart()
        }, 6100)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutT.transitionToEnd()
            binding.constraintLayoutT.transitionToStart()
        }, 6600)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutI.transitionToEnd()
            binding.constraintLayoutI.transitionToStart()
        }, 7100)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutO4.transitionToEnd()
            binding.constraintLayoutO4.transitionToStart()
        }, 7600)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutN.transitionToEnd()
            binding.constraintLayoutN.transitionToStart()
        }, 8100)
        Handler(Looper.getMainLooper()).postDelayed({
            binding.constraintLayoutLogo.transitionToEnd()
            binding.constraintLayoutLogo.transitionToStart()
        }, 8600)

        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splashScreenFragment_to_secondSplashScreenFragment)
        }, 11000)
    }

}