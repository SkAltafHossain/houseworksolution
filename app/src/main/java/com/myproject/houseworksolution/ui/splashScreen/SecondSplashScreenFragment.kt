package com.myproject.houseworksolution.ui.splashScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.myproject.houseworksolution.R
import com.myproject.houseworksolution.databinding.SecondSplashScreenFragmentBinding
import com.myproject.houseworksolution.ui.authUser.AuthUserActivity
import com.myproject.houseworksolution.ui.authWorker.AuthWorkerActivity
import com.myproject.houseworksolution.utils.ext.gotToActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondSplashScreenFragment : Fragment() {

    private lateinit var binding: SecondSplashScreenFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = SecondSplashScreenFragmentBinding.inflate(inflater)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListener()
    }

    private fun initListener() {

        binding.tvUser.setOnClickListener {
            requireContext().gotToActivity(AuthUserActivity::class.java)
        }

        binding.tvWorker.setOnClickListener {
            requireContext().gotToActivity(AuthWorkerActivity::class.java)
        }
    }

}