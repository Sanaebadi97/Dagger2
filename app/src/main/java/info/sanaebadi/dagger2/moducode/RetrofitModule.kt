package info.sanaebadi.dagger2.moducode

import dagger.Provides
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
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


    @Provides
    fun provideHttpClient(interceptor: Interceptor,cache: Cache):OkHttpClient=
        OkHttpClient
            .Builder()
            .addInterceptor(interceptor)
            .cache(cache)
            .build()


    fun provideInterceptor():Interceptor= HttpLoggingInterceptor(HttpLoggingInterceptor.Logger{
        Time

    }

}