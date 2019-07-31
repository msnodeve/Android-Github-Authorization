package com.seok.github_authorization

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class RedirectedActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var uri : Uri = intent.data
        if(uri != null && uri.toString().startsWith(getString(R.string.github_app_url))){
            var intent : Intent = Intent(this, MainActivity::class.java)
            intent.putExtra("code", uri.getQueryParameter("code"))
            intent.putExtra("state", uri.getQueryParameter("state"))
            startActivity(intent)
            finish()
        }
    }
}
