package info.sanaebadi.dagger2.byteCode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.internal.MapFactory.builder
import dagger.internal.MapProviderFactory.builder
import info.sanaebadi.dagger2.R
import info.sanaebadi.dagger2.TutsplusDagger.component.VehicleComponent
import info.sanaebadi.dagger2.TutsplusDagger.module.VehicleModule
import info.sanaebadi.dagger2.byteCode.component.MotorComponent
import info.sanaebadi.dagger2.byteCode.model.Motor
import info.sanaebadi.dagger2.byteCode.module.MotorModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var motor: Motor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


    }


    fun createCar(){
        if (motor!=null){
            Toast.makeText(this,"Car is created",Toast.LENGTH_SHORT).show()
        }

        startCar(motor)
    }

    fun startCar(motor: Motor){
        if (motor)

    }


    fun generateDaggerCode(){
        val component: MotorComponent =
            DaggerMotorComponent.builder().motorModule(MotorModule("Motor Name","Computer Name","Radiator Name" ,12)).build()

        component.inject(this)
        component.inject(motor)
    }
}
