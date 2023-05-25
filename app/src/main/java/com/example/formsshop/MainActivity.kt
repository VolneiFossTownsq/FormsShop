package com.example.formsshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.formsshop.form.FormActivity

class MainActivity : AppCompatActivity() {

    private var goToFormActivity: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFormActivity = findViewById(R.id.btngoToFormActivity)
        goToFormActivity?.setOnClickListener {
            goToShopping()
        }
    }

    fun goToShopping(){
        val intent = Intent(this, FormActivity::class.java)
        startActivity(intent)
    }

}