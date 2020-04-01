package info.sanaebadi.dagger2.raywenderlich.dagger;

import info.sanaebadi.dagger2.raywenderlich.network.Homepage;
import info.sanaebadi.dagger2.raywenderlich.ui.homePage.HomepagePresenter;

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
public final class PresenterModule_ProvideHomepagePresenterFactory implements Factory<HomepagePresenter> {
  private final PresenterModule module;

  private final Provider<Homepage> homepageProvider;

  public PresenterModule_ProvideHomepagePresenterFactory(PresenterModule module,
      Provider<Homepage> homepageProvider) {
    this.module = module;
    this.homepageProvider = homepageProvider;
  }

  @Override
  public HomepagePresenter get() {
    return provideHomepagePresenter(module, homepageProvider.get());
  }

  public static PresenterModule_ProvideHomepagePresenterFactory create(PresenterModule module,
      Provider<Homepage> homepageProvider) {
    return new PresenterModule_ProvideHomepagePresenterFactory(module, homepageProvider);
  }

  public static HomepagePresenter provideHomepagePresenter(PresenterModule instance,
      Homepage homepage) {
    return Preconditions.checkNotNull(instance.provideHomepagePresenter(homepage), "Cannot return null from a non-@Nullable @Provides method");
  }
}
