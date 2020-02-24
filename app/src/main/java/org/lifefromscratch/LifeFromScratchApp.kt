package org.lifefromscratch

import android.app.Application

class LifeFromScratchApp : Application() {

    override fun onCreate() {
        app = this
        super.onCreate()
    }

    companion object {

        var appStartedNormally = false

        lateinit var app: Application

        val APP: Application
            get() = app
    }
}