package info.sanaebadi.dagger2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import info.sanaebadi.dagger2.TutsplusDagger.component.DaggerVehicleComponent
import info.sanaebadi.dagger2.TutsplusDagger.component.VehicleComponent
import info.sanaebadi.dagger2.TutsplusDagger.model.Vehicle
import info.sanaebadi.dagger2.TutsplusDagger.module.VehicleModule


class MainActivity : AppCompatActivity() {

    lateinit var vehicle: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: VehicleComponent =
            DaggerVehicleComponent.builder().vehicleModule(VehicleModule()).build()

        vehicle = component.provideVehicle()!!

        Toast.makeText(this, vehicle.speed.toString(), Toast.LENGTH_SHORT).show()
    }
}
