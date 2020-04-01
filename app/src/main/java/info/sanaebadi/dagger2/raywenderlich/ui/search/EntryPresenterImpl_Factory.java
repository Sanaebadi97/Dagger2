package info.sanaebadi.dagger2.raywenderlich.ui.search;

import info.sanaebadi.dagger2.raywenderlich.network.Wiki;

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
public final class EntryPresenterImpl_Factory implements Factory<EntryPresenterImpl> {
  private final Provider<Wiki> wikiProvider;

  public EntryPresenterImpl_Factory(Provider<Wiki> wikiProvider) {
    this.wikiProvider = wikiProvider;
  }

  @Override
  public EntryPresenterImpl get() {
    return new EntryPresenterImpl(wikiProvider.get());
  }

  public static EntryPresenterImpl_Factory create(Provider<Wiki> wikiProvider) {
    return new EntryPresenterImpl_Factory(wikiProvider);
  }

  public static EntryPresenterImpl newInstance(Wiki wiki) {
    return new EntryPresenterImpl(wiki);
  }
}
