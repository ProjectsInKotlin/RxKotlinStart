package com.example.mylynx.rxkotlinstart

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //iterator example
        var list = listOf("One", 2, "Three", "Four", 4.5)
        var iterator = list.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }

        //rx kotlin paradigm
        var listrx = listOf(1, 2, "Three", "Four", 4.5)
        var observable = listrx.toObservable()

        observable.subscribeBy(
                onNext = { println(it)},
                onError = { it.printStackTrace()},
                onComplete = { println("Done!")}
        )


    }
}
