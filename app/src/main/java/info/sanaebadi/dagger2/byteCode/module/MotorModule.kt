package info.sanaebadi.dagger2.byteCode.module

import dagger.Module
import dagger.Provides
import info.sanaebadi.dagger2.byteCode.model.Computer
import info.sanaebadi.dagger2.byteCode.model.Motor
import info.sanaebadi.dagger2.byteCode.model.Radiator
import javax.inject.Singleton


@Module
class MotorModule(
    val motorName: String,
    val computerName: String,
    val radiatorName: String,
    val voltage: Int
) {

    @Provides
    @Singleton
    fun providerMotor(): Motor {
        return Motor(motorName)
    }

    @Provides
    @Singleton
    fun provideComputer(): Computer {
        return Computer(voltage, computerName)
    }


    @Provides
    @Singleton
    fun providerRadiator():Radiator{
        return Radiator(radiatorName)
    }

}