package org.lifefromscratch

import android.os.Bundle

class DashboardActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        title = "Dashboard ${LoginActivity.loginShownAt}"
    }
}