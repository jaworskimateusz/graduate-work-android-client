package pl.jaworskimateusz.machineservice.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository;
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideTaskListViewModelFactoryFactory
    implements Factory<TaskViewModelFactory> {
  private final PresenterModule module;

  private final Provider<TaskRepository> taskRepositoryProvider;

  public PresenterModule_ProvideTaskListViewModelFactoryFactory(
      PresenterModule module, Provider<TaskRepository> taskRepositoryProvider) {
    assert module != null;
    this.module = module;
    assert taskRepositoryProvider != null;
    this.taskRepositoryProvider = taskRepositoryProvider;
  }

  @Override
  public TaskViewModelFactory get() {
    return Preconditions.checkNotNull(
        module.provideTaskListViewModelFactory(taskRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TaskViewModelFactory> create(
      PresenterModule module, Provider<TaskRepository> taskRepositoryProvider) {
    return new PresenterModule_ProvideTaskListViewModelFactoryFactory(
        module, taskRepositoryProvider);
  }
}
