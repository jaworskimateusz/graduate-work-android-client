package pl.jaworskimateusz.machineservice.dagger;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.jaworskimateusz.machineservice.data.repository.MachineRepository;
import pl.jaworskimateusz.machineservice.services.MachineServiceAPI;
import pl.jaworskimateusz.machineservice.session.SessionManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideMachineRepositoryFactory
    implements Factory<MachineRepository> {
  private final PresenterModule module;

  private final Provider<Context> contextProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<MachineServiceAPI> machineServiceAPIProvider;

  public PresenterModule_ProvideMachineRepositoryFactory(
      PresenterModule module,
      Provider<Context> contextProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<MachineServiceAPI> machineServiceAPIProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert sessionManagerProvider != null;
    this.sessionManagerProvider = sessionManagerProvider;
    assert machineServiceAPIProvider != null;
    this.machineServiceAPIProvider = machineServiceAPIProvider;
  }

  @Override
  public MachineRepository get() {
    return Preconditions.checkNotNull(
        module.provideMachineRepository(
            contextProvider.get(), sessionManagerProvider.get(), machineServiceAPIProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MachineRepository> create(
      PresenterModule module,
      Provider<Context> contextProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<MachineServiceAPI> machineServiceAPIProvider) {
    return new PresenterModule_ProvideMachineRepositoryFactory(
        module, contextProvider, sessionManagerProvider, machineServiceAPIProvider);
  }
}
