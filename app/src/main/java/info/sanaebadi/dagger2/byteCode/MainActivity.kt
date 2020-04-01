package info.sanaebadi.dagger2.byteCode

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import info.sanaebadi.dagger2.R
import info.sanaebadi.dagger2.byteCode.component.MotorComponent
import info.sanaebadi.dagger2.byteCode.model.Motor
import info.sanaebadi.dagger2.byteCode.module.MotorModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    var motor: Motor = Motor("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        generateDaggerCode()
        createCar(motor!!)
    }


    fun createCar(motor: Motor) {
        if (this.motor != null) {
            Toast.makeText(this, "Car is created", Toast.LENGTH_SHORT).show()
        }

        startCar(this.motor!!)
    }

    fun startCar(motor: Motor) {
        if (motor.startEngine()) {
            Toast.makeText(this, "it is started", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "motor name is : " + motor.name, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "motor is nor provided", Toast.LENGTH_SHORT).show()
        }

    }


    fun generateDaggerCode() {
        val component: MotorComponent =
            DaggerMotorComponent.builder()
                .motorModule(MotorModule("Motor Name", "Computer Name", "Radiator Name", 12))
                .build()

        component.inject(this)
        component.inject(motor!!)
    }
}
