package com.jwstudio.myandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

//        var url = intent?.getStringExtra("url")
//        url?.let {
//            webView.apply {
//                settings.javaScriptEnabled = true
//                webViewClient = WebViewClient()
//                loadUrl(url)
//            }
//        }
    }
}