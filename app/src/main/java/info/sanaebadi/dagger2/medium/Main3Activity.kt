package info.sanaebadi.dagger2.medium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.sanaebadi.dagger2.R
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        textView.text = info.text
    }


    class Info() {
        val text = "Hello dagger2"
    }
}
