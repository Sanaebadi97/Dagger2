package info.sanaebadi.dagger2.medium.component

import dagger.Component
import info.sanaebadi.dagger2.medium.Main3Activity
import info.sanaebadi.dagger2.medium.module.InfoModule


//more than 1 module
//@Component(modules = [Bag::class, OtherBag::class, MoreBag::Class])

@Component(modules = [InfoModule::class])
interface MagicBox{

    fun poke(app:Main3Activity)

}