package info.sanaebadi.dagger2.TutsplusDagger

data class Motor(var rpm:Int) {


    fun accelerate(value: Int) {
        rpm += value
    }

    fun brake() {
        rpm = 0
    }

}