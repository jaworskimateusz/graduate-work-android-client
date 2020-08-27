package pl.jaworskimateusz.machineservice.activity;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity;
import pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI;
import pl.jaworskimateusz.machineservice.services.UserServiceAPI;
import pl.jaworskimateusz.machineservice.session.SessionManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReportProblemActivity_MembersInjector
    implements MembersInjector<ReportProblemActivity> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<AuthenticationServiceAPI> authenticationServiceApiProvider;

  private final Provider<UserServiceAPI> userServiceAPIProvider;

  public ReportProblemActivity_MembersInjector(
      Provider<SessionManager> sessionManagerProvider,
      Provider<AuthenticationServiceAPI> authenticationServiceApiProvider,
      Provider<UserServiceAPI> userServiceAPIProvider) {
    assert sessionManagerProvider != null;
    this.sessionManagerProvider = sessionManagerProvider;
    assert authenticationServiceApiProvider != null;
    this.authenticationServiceApiProvider = authenticationServiceApiProvider;
    assert userServiceAPIProvider != null;
    this.userServiceAPIProvider = userServiceAPIProvider;
  }

  public static MembersInjector<ReportProblemActivity> create(
      Provider<SessionManager> sessionManagerProvider,
      Provider<AuthenticationServiceAPI> authenticationServiceApiProvider,
      Provider<UserServiceAPI> userServiceAPIProvider) {
    return new ReportProblemActivity_MembersInjector(
        sessionManagerProvider, authenticationServiceApiProvider, userServiceAPIProvider);
  }

  @Override
  public void injectMembers(ReportProblemActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    pl.jaworskimateusz.machineservice.activity.base.BaseActivity_MembersInjector
        .injectSessionManager(instance, sessionManagerProvider);
    ((BaseActivity) instance).authenticationServiceApi = authenticationServiceApiProvider.get();
    instance.userServiceAPI = userServiceAPIProvider.get();
  }
}
