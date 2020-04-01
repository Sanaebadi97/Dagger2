package info.sanaebadi.dagger2.raywenderlich.dagger;

import com.raywenderlich.android.droidwiki.network.Wiki;
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter;

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
public final class PresenterModule_ProvideEntryPresenterFactory implements Factory<EntryPresenter> {
  private final PresenterModule module;

  private final Provider<Wiki> wikiProvider;

  public PresenterModule_ProvideEntryPresenterFactory(PresenterModule module,
      Provider<Wiki> wikiProvider) {
    this.module = module;
    this.wikiProvider = wikiProvider;
  }

  @Override
  public EntryPresenter get() {
    return provideEntryPresenter(module, wikiProvider.get());
  }

  public static PresenterModule_ProvideEntryPresenterFactory create(PresenterModule module,
      Provider<Wiki> wikiProvider) {
    return new PresenterModule_ProvideEntryPresenterFactory(module, wikiProvider);
  }

  public static EntryPresenter provideEntryPresenter(PresenterModule instance, Wiki wiki) {
    return Preconditions.checkNotNull(instance.provideEntryPresenter(wiki), "Cannot return null from a non-@Nullable @Provides method");
  }
}
