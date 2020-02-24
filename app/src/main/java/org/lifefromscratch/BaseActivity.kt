package org.lifefromscratch

import androidx.appcompat.app.AppCompatActivity
import org.lifefromscratch.LifeFromScratchApp.Companion.APP
import org.lifefromscratch.LifeFromScratchApp.Companion.appStartedNormally

abstract class BaseActivity : AppCompatActivity() {

    companion object {
        init {
            if (!appStartedNormally) {
                APP.startActivity(
                    APP.getPackageManager().getLaunchIntentForPackage(
                        APP.getPackageName()
                    )
                );
                System.exit(0)
            }
        }
    }
}