package com.example.formsshop.form.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.formsshop.R

class BasicInfoFragment : Fragment() {

    private var btnGoToCheckout: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_basic_info, container, false)

        btnGoToCheckout = rootView.findViewById(R.id.btnGoToCheckout)

        btnGoToCheckout?.setOnClickListener {

        }

        return rootView
    }

}



