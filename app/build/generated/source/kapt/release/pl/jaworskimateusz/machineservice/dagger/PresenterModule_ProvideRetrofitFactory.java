package pl.jaworskimateusz.machineservice.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PresenterModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final PresenterModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public PresenterModule_ProvideRetrofitFactory(
      PresenterModule module, Provider<OkHttpClient> okHttpClientProvider) {
    assert module != null;
    this.module = module;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(
      PresenterModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new PresenterModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }
}
