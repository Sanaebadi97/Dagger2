package info.sanaebadi.dagger2.medium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.sanaebadi.dagger2.R
import info.sanaebadi.dagger2.medium.component.DaggerMagicBox
import info.sanaebadi.dagger2.medium.model.Info
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        DaggerMagicBox.create().poke(this)

        textView.text = info.text
    }



}
