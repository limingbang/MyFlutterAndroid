package com.jwstudio.myandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startFlutterBtn.setOnClickListener {
            // 方式一
//            startActivity(FlutterActivity.createDefaultIntent(this))

            // 方式二：导航到指定的页面
//            startActivity(FlutterActivity.withNewEngine().initialRoute("/mine").build(this))

            // 方式三：通过缓存
//            startActivity(FlutterActivity.withCachedEngine("mine").build(this))

            startActivity(EngineIntentBuilder(MyFlutterActivity::class.java).initialRoute("/mine").build(this))
        }
    }
}