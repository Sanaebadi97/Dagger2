package info.sanaebadi.dagger2.raywenderlich.ui.homePage;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.MembersInjector;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomepageActivity_MembersInjector implements MembersInjector<HomepageActivity> {
  private final Provider<HomepagePresenter> presenterProvider;

  public HomepageActivity_MembersInjector(Provider<HomepagePresenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<HomepageActivity> create(
      Provider<HomepagePresenter> presenterProvider) {
    return new HomepageActivity_MembersInjector(presenterProvider);}

  @Override
  public void injectMembers(HomepageActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(HomepageActivity instance, HomepagePresenter presenter) {
    instance.presenter = presenter;
  }
}
