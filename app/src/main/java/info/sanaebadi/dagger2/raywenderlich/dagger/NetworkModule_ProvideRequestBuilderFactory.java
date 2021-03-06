package info.sanaebadi.dagger2.raywenderlich.dagger;

import org.jetbrains.annotations.Nullable;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.internal.Factory;
import okhttp3.HttpUrl;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRequestBuilderFactory implements Factory<HttpUrl.Builder> {
  private final NetworkModule module;

  private final Provider<String> baseUrlProvider;

  public NetworkModule_ProvideRequestBuilderFactory(NetworkModule module,
      Provider<String> baseUrlProvider) {
    this.module = module;
    this.baseUrlProvider = baseUrlProvider;
  }

  @Override
  @Nullable
  public HttpUrl.Builder get() {
    return provideRequestBuilder(module, baseUrlProvider.get());
  }

  public static NetworkModule_ProvideRequestBuilderFactory create(NetworkModule module,
      Provider<String> baseUrlProvider) {
    return new NetworkModule_ProvideRequestBuilderFactory(module, baseUrlProvider);
  }

  @Nullable
  public static HttpUrl.Builder provideRequestBuilder(NetworkModule instance, String baseUrl) {
    return instance.provideRequestBuilder(baseUrl);
  }
}
