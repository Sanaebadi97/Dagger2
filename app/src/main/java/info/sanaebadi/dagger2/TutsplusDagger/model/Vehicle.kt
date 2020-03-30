package info.sanaebadi.dagger2.TutsplusDagger.model

import javax.inject.Inject



class Vehicle constructor(@Inject private val motor: Motor) {
    fun increaseSpeed(value: Int) {
        motor.accelerate(value)
    }

    fun stop() {
        motor.brake()
    }

    val speed: Int
        get() = motor.rpm

}