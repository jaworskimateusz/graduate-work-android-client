package pl.jaworskimateusz.machineservice.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final PresenterModule module;

  public PresenterModule_ProvideOkHttpClientFactory(PresenterModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(PresenterModule module) {
    return new PresenterModule_ProvideOkHttpClientFactory(module);
  }
}
