package info.sanaebadi.dagger2.TutsplusDagger.component

import dagger.Component
import info.sanaebadi.dagger2.TutsplusDagger.model.Vehicle

import info.sanaebadi.dagger2.TutsplusDagger.module.VehicleModule

import javax.inject.Singleton


@Singleton
@Component(modules = [VehicleModule::class])
interface VehicleComponent {
    fun provideVehicle(): Vehicle?
}