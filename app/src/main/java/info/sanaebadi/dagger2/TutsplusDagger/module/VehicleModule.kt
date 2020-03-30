package info.sanaebadi.dagger2.TutsplusDagger.module

import dagger.Module
import dagger.Provides
import info.sanaebadi.dagger2.TutsplusDagger.model.Motor
import info.sanaebadi.dagger2.TutsplusDagger.model.Vehicle
import javax.inject.Singleton


@Module
class VehicleModule {

    @Provides
    @Singleton
    fun provideMotor(): Motor? {
        return Motor()
    }

    @Provides
    @Singleton
    fun provideVehicle(): Vehicle? {
        return Vehicle(Motor())
    }

}