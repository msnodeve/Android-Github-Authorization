package com.seok.github_authorization

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class RedirectedActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redirected)
    }
}
