package info.sanaebadi.dagger2.moducode

import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

class RetrofitModule {


    @Provides
    fun provideRetrofit(httpClient: OkHttpClient):Retrofit=
        Retrofit.Builder()
            .client(httpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
}