package info.sanaebadi.dagger2.medium.module

import dagger.Module
import dagger.Provides
import info.sanaebadi.dagger2.medium.model.Info


@Module
class InfoModule {

    @Provides
    fun sayLoveDagger2(): Info {
        return Info("Love Dagger 2")
    }


    @Provides
    fun sayHelloDagger2(): Info {
        return Info("Hello Dagger 2")
    }
}