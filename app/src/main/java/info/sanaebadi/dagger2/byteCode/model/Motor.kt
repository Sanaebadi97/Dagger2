package info.sanaebadi.dagger2.byteCode.model

import javax.inject.Inject

class Motor(var name: String) {
    @Inject
    var computer: Computer? = null

    @Inject
    var radiator: Radiator? = null
    fun startEngine(): Boolean {
        return computer != null && radiator != null
    }

}