package com.example.formsshop.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.fragment.app.commit
import com.example.formsshop.R
import com.example.formsshop.R.id.basicInfoFragment
import com.example.formsshop.form.ui.BasicInfoFragment


class FormActivity : AppCompatActivity() {

    private var btnToBasicInfo: Button? = null
    private var fragmentContainer: FrameLayout? = null
    private var fragment1: BasicInfoFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        btnToBasicInfo = findViewById(R.id.btnToBasicInfo)

        btnToBasicInfo?.setOnClickListener {
            exibirFragmento1()
        }
    }

    private fun exibirFragmento1() {
        if (fragment1 == null) {
            fragment1 = BasicInfoFragment()

            // Cria o contêiner do fragmento programaticamente
            fragmentContainer = FrameLayout(this)
            fragmentContainer?.id = R.id.sonLayout

            val layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            )
            fragmentContainer?.layoutParams = layoutParams
            layoutParams.bottomMargin = 24

            // Adiciona o contêiner no layout da activity
            val rootView = findViewById<LinearLayout>(R.id.rootLayout)
            rootView.addView(fragmentContainer)

            supportFragmentManager.commit {
                replace(fragmentContainer!!.id, fragment1!!)
            }
        }
    }
}