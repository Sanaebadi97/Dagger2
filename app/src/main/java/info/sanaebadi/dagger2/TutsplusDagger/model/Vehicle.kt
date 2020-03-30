package info.sanaebadi.dagger2.TutsplusDagger.model

import info.sanaebadi.dagger2.TutsplusDagger.model.Motor

data class Vehicle(var motor: Motor){


    fun increaseSpeed(value: Int) {
        motor.accelerate(value)
    }

    fun stop() {
        motor.brake()
    }

    fun getSpeed(): Int {
        return motor.rpm
    }

}