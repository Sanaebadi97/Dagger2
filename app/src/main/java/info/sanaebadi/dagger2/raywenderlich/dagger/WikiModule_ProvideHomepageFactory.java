package info.sanaebadi.dagger2.raywenderlich.dagger;

import info.sanaebadi.dagger2.raywenderlich.network.Homepage;
import info.sanaebadi.dagger2.raywenderlich.network.WikiApi;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WikiModule_ProvideHomepageFactory implements Factory<Homepage> {
  private final WikiModule module;

  private final Provider<WikiApi> apiProvider;

  public WikiModule_ProvideHomepageFactory(WikiModule module, Provider<WikiApi> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public Homepage get() {
    return provideHomepage(module, apiProvider.get());
  }

  public static WikiModule_ProvideHomepageFactory create(WikiModule module,
      Provider<WikiApi> apiProvider) {
    return new WikiModule_ProvideHomepageFactory(module, apiProvider);
  }

  public static Homepage provideHomepage(WikiModule instance, WikiApi api) {
    return Preconditions.checkNotNull(instance.provideHomepage(api), "Cannot return null from a non-@Nullable @Provides method");
  }
}
