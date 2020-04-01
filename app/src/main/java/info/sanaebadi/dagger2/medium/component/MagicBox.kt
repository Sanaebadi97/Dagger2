package info.sanaebadi.dagger2.medium.component

import dagger.Component
import info.sanaebadi.dagger2.medium.Main3Activity


@Component
interface MagicBox{

    fun poke(app:Main3Activity)

}