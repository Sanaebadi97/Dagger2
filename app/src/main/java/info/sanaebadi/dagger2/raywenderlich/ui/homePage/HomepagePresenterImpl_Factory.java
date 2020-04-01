package info.sanaebadi.dagger2.raywenderlich.ui.homePage;


import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.internal.Factory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomepagePresenterImpl_Factory implements Factory<HomepagePresenterImpl> {
  private final Provider<Homepage> homepageProvider;

  public HomepagePresenterImpl_Factory(Provider<Homepage> homepageProvider) {
    this.homepageProvider = homepageProvider;
  }

  @Override
  public HomepagePresenterImpl get() {
    return new HomepagePresenterImpl(homepageProvider.get());
  }

  public static HomepagePresenterImpl_Factory create(Provider<Homepage> homepageProvider) {
    return new HomepagePresenterImpl_Factory(homepageProvider);
  }

  public static HomepagePresenterImpl newInstance(Homepage homepage) {
    return new HomepagePresenterImpl(homepage);
  }
}
