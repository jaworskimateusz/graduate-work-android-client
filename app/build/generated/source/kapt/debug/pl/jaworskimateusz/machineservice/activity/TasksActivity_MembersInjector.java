package pl.jaworskimateusz.machineservice.activity;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity;
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository;
import pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI;
import pl.jaworskimateusz.machineservice.session.SessionManager;
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TasksActivity_MembersInjector implements MembersInjector<TasksActivity> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<AuthenticationServiceAPI> authenticationServiceApiProvider;

  private final Provider<TaskViewModelFactory> taskViewModelFactoryProvider;

  private final Provider<TaskRepository> taskRepositoryProvider;

  public TasksActivity_MembersInjector(
      Provider<SessionManager> sessionManagerProvider,
      Provider<AuthenticationServiceAPI> authenticationServiceApiProvider,
      Provider<TaskViewModelFactory> taskViewModelFactoryProvider,
      Provider<TaskRepository> taskRepositoryProvider) {
    assert sessionManagerProvider != null;
    this.sessionManagerProvider = sessionManagerProvider;
    assert authenticationServiceApiProvider != null;
    this.authenticationServiceApiProvider = authenticationServiceApiProvider;
    assert taskViewModelFactoryProvider != null;
    this.taskViewModelFactoryProvider = taskViewModelFactoryProvider;
    assert taskRepositoryProvider != null;
    this.taskRepositoryProvider = taskRepositoryProvider;
  }

  public static MembersInjector<TasksActivity> create(
      Provider<SessionManager> sessionManagerProvider,
      Provider<AuthenticationServiceAPI> authenticationServiceApiProvider,
      Provider<TaskViewModelFactory> taskViewModelFactoryProvider,
      Provider<TaskRepository> taskRepositoryProvider) {
    return new TasksActivity_MembersInjector(
        sessionManagerProvider,
        authenticationServiceApiProvider,
        taskViewModelFactoryProvider,
        taskRepositoryProvider);
  }

  @Override
  public void injectMembers(TasksActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    pl.jaworskimateusz.machineservice.activity.base.BaseActivity_MembersInjector
        .injectSessionManager(instance, sessionManagerProvider);
    ((BaseActivity) instance).authenticationServiceApi = authenticationServiceApiProvider.get();
    instance.taskViewModelFactory = taskViewModelFactoryProvider.get();
    instance.taskRepository = taskRepositoryProvider.get();
  }
}
