package info.sanaebadi.dagger2.TutsplusDagger.model

class Motor {
    var rpm = 0
        private set

    fun accelerate(value: Int) {
        rpm += value
    }

    fun brake() {
        rpm = 0
    }

}