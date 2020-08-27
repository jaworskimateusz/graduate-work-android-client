package pl.jaworskimateusz.machineservice.activity;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity;
import pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI;
import pl.jaworskimateusz.machineservice.session.SessionManager;
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IssueDetailActivity_MembersInjector
    implements MembersInjector<IssueDetailActivity> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<AuthenticationServiceAPI> authenticationServiceApiProvider;

  private final Provider<MachineViewModelFactory> machineViewModelFactoryProvider;

  public IssueDetailActivity_MembersInjector(
      Provider<SessionManager> sessionManagerProvider,
      Provider<AuthenticationServiceAPI> authenticationServiceApiProvider,
      Provider<MachineViewModelFactory> machineViewModelFactoryProvider) {
    assert sessionManagerProvider != null;
    this.sessionManagerProvider = sessionManagerProvider;
    assert authenticationServiceApiProvider != null;
    this.authenticationServiceApiProvider = authenticationServiceApiProvider;
    assert machineViewModelFactoryProvider != null;
    this.machineViewModelFactoryProvider = machineViewModelFactoryProvider;
  }

  public static MembersInjector<IssueDetailActivity> create(
      Provider<SessionManager> sessionManagerProvider,
      Provider<AuthenticationServiceAPI> authenticationServiceApiProvider,
      Provider<MachineViewModelFactory> machineViewModelFactoryProvider) {
    return new IssueDetailActivity_MembersInjector(
        sessionManagerProvider, authenticationServiceApiProvider, machineViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(IssueDetailActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    pl.jaworskimateusz.machineservice.activity.base.BaseActivity_MembersInjector
        .injectSessionManager(instance, sessionManagerProvider);
    ((BaseActivity) instance).authenticationServiceApi = authenticationServiceApiProvider.get();
    instance.machineViewModelFactory = machineViewModelFactoryProvider.get();
  }
}
