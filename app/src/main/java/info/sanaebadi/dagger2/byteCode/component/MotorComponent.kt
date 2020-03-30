package info.sanaebadi.dagger2.byteCode.component

import dagger.Component
import info.sanaebadi.dagger2.byteCode.MainActivity
import info.sanaebadi.dagger2.byteCode.model.Motor
import info.sanaebadi.dagger2.byteCode.module.MotorModule
import javax.inject.Singleton


@Singleton
@Component(modules = [MotorModule::class])
interface MotorComponent {

    fun inject(activity: MainActivity)
    fun inject(motor: Motor)
}