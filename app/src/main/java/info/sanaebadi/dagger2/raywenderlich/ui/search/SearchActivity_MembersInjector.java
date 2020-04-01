package info.sanaebadi.dagger2.raywenderlich.ui.search;

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
public final class SearchActivity_MembersInjector implements MembersInjector<SearchActivity> {
  private final Provider<EntryPresenter> presenterProvider;

  public SearchActivity_MembersInjector(Provider<EntryPresenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<SearchActivity> create(Provider<EntryPresenter> presenterProvider) {
    return new SearchActivity_MembersInjector(presenterProvider);}

  @Override
  public void injectMembers(SearchActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(SearchActivity instance, EntryPresenter presenter) {
    instance.presenter = presenter;
  }
}
