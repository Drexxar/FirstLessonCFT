package com.example.firstlessoncft.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.addCallback
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.firstlessoncft.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(this){activity?.finish()}

        button_forward.setOnClickListener { moveForwardIntent() }

        button_backward.setOnClickListener { moveBackwardIntent() }
    }

    private fun moveForwardIntent() {
        fragmentManager?.beginTransaction()
            ?.replace(R.id.fragmentContainer,SecondFragment())
            ?.addToBackStack(null)
            ?.commit()
    }

    private fun moveBackwardIntent(){
        fragmentManager?.beginTransaction()
            ?.replace(R.id.fragmentContainer,ThirdFragment())
            ?.addToBackStack(null)
            ?.commit()
    }
}