package info.sanaebadi.dagger2.moducode

import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitModule {


    @Provides
    fun provideRetrofit(httpClient: OkHttpClient):Retrofit=
        Retrofit.Builder()
            .client(httpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl("http://api.tvmaze.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()



}