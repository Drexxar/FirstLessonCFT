package com.example.firstlessoncft.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.firstlessoncft.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_forward2.setOnClickListener { moveForwardIntent() }

        button_backward2.setOnClickListener { moveBackwardIntent() }
    }

    private fun moveForwardIntent() {
        fragmentManager?.beginTransaction()
            ?.replace(R.id.fragmentContainer, ThirdFragment())
            ?.addToBackStack(null)
            ?.commit()
    }

    private fun moveBackwardIntent() {
        fragmentManager?.beginTransaction()
            ?.replace(R.id.fragmentContainer, FirstFragment())
            ?.addToBackStack(null)
            ?.commit()
    }
}