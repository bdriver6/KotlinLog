package jp.techacademy.hiromi.kakoo.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("たけし",15,"野球")
        human.say()
        human.think()

        val human2 = Human("ただお",95,"盆栽")
        human2.say()
        human2.think()

    }
}