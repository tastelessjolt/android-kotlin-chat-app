package me.harshithgoka.chatsocks

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greeting.*

class GreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        sel_login.setOnClickListener {
            var intent: Intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }

        sel_register.setOnClickListener {
            var intent: Intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
        }
    }


}
