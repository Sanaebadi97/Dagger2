package info.sanaebadi.dagger2.byteCode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.sanaebadi.dagger2.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}
