package com.jwstudio.myandroid

import android.content.Intent
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MyFlutterActivity : FlutterActivity() {

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(
            flutterEngine.dartExecutor.binaryMessenger,
            "com.jwstudio.mine/webView"
        ).setMethodCallHandler { call, result ->
            if (call.method == "start") {
                if (call.hasArgument("url")) {
                    var url = call.argument<String>("url")
                    startActivity(Intent(this, SecondActivity::class.java))
                    result.success("success")
                } else {
                    result.error("-1", "url is null", "error")
                }
            } else {
                result.notImplemented()
            }
        }
    }
}