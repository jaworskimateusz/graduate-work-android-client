package pl.jaworskimateusz.machineservice.dagger;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.session.SessionManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideSessionManagerFactory implements Factory<SessionManager> {
  private final PresenterModule module;

  private final Provider<Context> contextProvider;

  public PresenterModule_ProvideSessionManagerFactory(
      PresenterModule module, Provider<Context> contextProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public SessionManager get() {
    return Preconditions.checkNotNull(
        module.provideSessionManager(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SessionManager> create(
      PresenterModule module, Provider<Context> contextProvider) {
    return new PresenterModule_ProvideSessionManagerFactory(module, contextProvider);
  }
}
