package com.example.firstlessoncft.Fragments

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.firstlessoncft.R
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_forward3.setOnClickListener { moveForwardIntent() }

        button_backward3.setOnClickListener { moveBackwardIntent() }

        button_phone.setOnClickListener { getContacts() }
    }


    private fun moveForwardIntent() {
        fragmentManager?.beginTransaction()
            ?.replace(R.id.fragmentContainer, FirstFragment())
            ?.addToBackStack(null)
            ?.commit()
    }

    private fun moveBackwardIntent() {
        fragmentManager?.beginTransaction()
            ?.replace(R.id.fragmentContainer, SecondFragment())
            ?.addToBackStack(null)
            ?.commit()
    }

    private fun getContacts(){
        val hasPermission = context?.let { ContextCompat.checkSelfPermission(it, Manifest.permission.READ_CONTACTS) }
        if (hasPermission != PackageManager.PERMISSION_GRANTED) {
            Log.w("", "READ_CONTACTS permission is not granted. You should grant it for this app")
            return
        }

    }
}