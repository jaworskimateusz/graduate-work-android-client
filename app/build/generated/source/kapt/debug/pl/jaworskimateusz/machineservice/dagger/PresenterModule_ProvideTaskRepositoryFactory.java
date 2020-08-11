package pl.jaworskimateusz.machineservice.dagger;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository;
import pl.jaworskimateusz.machineservice.services.UserServiceAPI;
import pl.jaworskimateusz.machineservice.session.SessionManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideTaskRepositoryFactory implements Factory<TaskRepository> {
  private final PresenterModule module;

  private final Provider<Context> contextProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<UserServiceAPI> userServiceAPIProvider;

  public PresenterModule_ProvideTaskRepositoryFactory(
      PresenterModule module,
      Provider<Context> contextProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<UserServiceAPI> userServiceAPIProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert sessionManagerProvider != null;
    this.sessionManagerProvider = sessionManagerProvider;
    assert userServiceAPIProvider != null;
    this.userServiceAPIProvider = userServiceAPIProvider;
  }

  @Override
  public TaskRepository get() {
    return Preconditions.checkNotNull(
        module.provideTaskRepository(
            contextProvider.get(), sessionManagerProvider.get(), userServiceAPIProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TaskRepository> create(
      PresenterModule module,
      Provider<Context> contextProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<UserServiceAPI> userServiceAPIProvider) {
    return new PresenterModule_ProvideTaskRepositoryFactory(
        module, contextProvider, sessionManagerProvider, userServiceAPIProvider);
  }
}
