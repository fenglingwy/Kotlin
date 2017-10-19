package com.wy.kotlintest

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        fun TextView.setl(content: String) {
//            text = content
//        }

//        var tv:TextView = findViewById(R.id.tv) as TextView

//        tv.setl("111111111111111111")

        val view = v<TextView>(this) {
            layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            text = "12313156446546"
        }

        var v = TextView(this)
        v.layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT,WRAP_CONTENT)
        v.text = "12313156446546"

    }

    inline fun <reified TV: View> v(context:Context,init:TV.()->Unit):TV{
        var constr = TV::class.java.getConstructor(Context::class.java)
        val view = constr.newInstance(context)
        view.init()
        return view
    }
 }
