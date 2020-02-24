package org.lifefromscratch

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.login_activity.*
import java.util.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        loginShownAt = Date().toString()

        super.onCreate(savedInstanceState)

        setContentView(R.layout.login_activity)

        nextButton.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }

    companion object {

        lateinit var loginShownAt: String
    }
}