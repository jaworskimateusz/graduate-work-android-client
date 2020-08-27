package pl.jaworskimateusz.machineservice.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.services.UserServiceAPI;
import pl.jaworskimateusz.machineservice.session.SessionManager;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideUserServiceAPIFactory implements Factory<UserServiceAPI> {
  private final PresenterModule module;

  private final Provider<Retrofit> retrofitProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public PresenterModule_ProvideUserServiceAPIFactory(
      PresenterModule module,
      Provider<Retrofit> retrofitProvider,
      Provider<SessionManager> sessionManagerProvider) {
    assert module != null;
    this.module = module;
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
    assert sessionManagerProvider != null;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public UserServiceAPI get() {
    return Preconditions.checkNotNull(
        module.provideUserServiceAPI(retrofitProvider.get(), sessionManagerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UserServiceAPI> create(
      PresenterModule module,
      Provider<Retrofit> retrofitProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new PresenterModule_ProvideUserServiceAPIFactory(
        module, retrofitProvider, sessionManagerProvider);
  }
}
