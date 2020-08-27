package pl.jaworskimateusz.machineservice.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.data.repository.MachineRepository;
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideMachineListViewModelFactoryFactory
    implements Factory<MachineViewModelFactory> {
  private final PresenterModule module;

  private final Provider<MachineRepository> machineRepositoryProvider;

  public PresenterModule_ProvideMachineListViewModelFactoryFactory(
      PresenterModule module, Provider<MachineRepository> machineRepositoryProvider) {
    assert module != null;
    this.module = module;
    assert machineRepositoryProvider != null;
    this.machineRepositoryProvider = machineRepositoryProvider;
  }

  @Override
  public MachineViewModelFactory get() {
    return Preconditions.checkNotNull(
        module.provideMachineListViewModelFactory(machineRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MachineViewModelFactory> create(
      PresenterModule module, Provider<MachineRepository> machineRepositoryProvider) {
    return new PresenterModule_ProvideMachineListViewModelFactoryFactory(
        module, machineRepositoryProvider);
  }
}
