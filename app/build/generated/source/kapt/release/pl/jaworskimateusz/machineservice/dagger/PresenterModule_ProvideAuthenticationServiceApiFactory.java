package pl.jaworskimateusz.machineservice.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideAuthenticationServiceApiFactory
    implements Factory<AuthenticationServiceAPI> {
  private final PresenterModule module;

  private final Provider<Retrofit> retrofitProvider;

  public PresenterModule_ProvideAuthenticationServiceApiFactory(
      PresenterModule module, Provider<Retrofit> retrofitProvider) {
    assert module != null;
    this.module = module;
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AuthenticationServiceAPI get() {
    return Preconditions.checkNotNull(
        module.provideAuthenticationServiceApi(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AuthenticationServiceAPI> create(
      PresenterModule module, Provider<Retrofit> retrofitProvider) {
    return new PresenterModule_ProvideAuthenticationServiceApiFactory(module, retrofitProvider);
  }
}
