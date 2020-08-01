package pl.jaworskimateusz.machineservice.activity;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<AuthenticationServiceAPI> authenticationServiceApiProvider;

  public LoginActivity_MembersInjector(
      Provider<AuthenticationServiceAPI> authenticationServiceApiProvider) {
    assert authenticationServiceApiProvider != null;
    this.authenticationServiceApiProvider = authenticationServiceApiProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<AuthenticationServiceAPI> authenticationServiceApiProvider) {
    return new LoginActivity_MembersInjector(authenticationServiceApiProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.authenticationServiceApi = authenticationServiceApiProvider.get();
  }
}
