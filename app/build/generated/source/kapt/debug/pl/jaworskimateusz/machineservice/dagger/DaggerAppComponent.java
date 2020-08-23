package pl.jaworskimateusz.machineservice.dagger;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import pl.jaworskimateusz.machineservice.MachineServiceApplication;
import pl.jaworskimateusz.machineservice.activity.LoginActivity;
import pl.jaworskimateusz.machineservice.activity.LoginActivity_MembersInjector;
import pl.jaworskimateusz.machineservice.activity.MachineDetailActivity;
import pl.jaworskimateusz.machineservice.activity.MachineDetailActivity_MembersInjector;
import pl.jaworskimateusz.machineservice.activity.MachinesActivity;
import pl.jaworskimateusz.machineservice.activity.MachinesActivity_MembersInjector;
import pl.jaworskimateusz.machineservice.activity.MainActivity;
import pl.jaworskimateusz.machineservice.activity.MainActivity_MembersInjector;
import pl.jaworskimateusz.machineservice.activity.ReportProblemActivity;
import pl.jaworskimateusz.machineservice.activity.ReportProblemActivity_MembersInjector;
import pl.jaworskimateusz.machineservice.activity.TaskDetailActivity;
import pl.jaworskimateusz.machineservice.activity.TaskDetailActivity_MembersInjector;
import pl.jaworskimateusz.machineservice.activity.TasksActivity;
import pl.jaworskimateusz.machineservice.activity.TasksActivity_MembersInjector;
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity;
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity_MembersInjector;
import pl.jaworskimateusz.machineservice.data.repository.MachineRepository;
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository;
import pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI;
import pl.jaworskimateusz.machineservice.services.MachineServiceAPI;
import pl.jaworskimateusz.machineservice.services.UserServiceAPI;
import pl.jaworskimateusz.machineservice.session.SessionManager;
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory;
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Context> provideContextProvider;

  private Provider<SessionManager> provideSessionManagerProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<AuthenticationServiceAPI> provideAuthenticationServiceApiProvider;

  private MembersInjector<BaseActivity> baseActivityMembersInjector;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private Provider<UserServiceAPI> provideUserServiceAPIProvider;

  private MembersInjector<ReportProblemActivity> reportProblemActivityMembersInjector;

  private Provider<TaskRepository> provideTaskRepositoryProvider;

  private Provider<TaskViewModelFactory> provideTaskListViewModelFactoryProvider;

  private MembersInjector<TasksActivity> tasksActivityMembersInjector;

  private MembersInjector<TaskDetailActivity> taskDetailActivityMembersInjector;

  private Provider<MachineServiceAPI> provideMachineServiceAPIProvider;

  private Provider<MachineRepository> provideMachineRepositoryProvider;

  private Provider<MachineViewModelFactory> provideMachineListViewModelFactoryProvider;

  private MembersInjector<MachinesActivity> machinesActivityMembersInjector;

  private MembersInjector<MachineDetailActivity> machineDetailActivityMembersInjector;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider =
        DoubleCheck.provider(AppModule_ProvideContextFactory.create(builder.appModule));

    this.provideSessionManagerProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideSessionManagerFactory.create(
                builder.presenterModule, provideContextProvider));

    this.provideOkHttpClientProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideOkHttpClientFactory.create(builder.presenterModule));

    this.provideRetrofitProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideRetrofitFactory.create(
                builder.presenterModule, provideOkHttpClientProvider));

    this.provideAuthenticationServiceApiProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideAuthenticationServiceApiFactory.create(
                builder.presenterModule, provideRetrofitProvider));

    this.baseActivityMembersInjector =
        BaseActivity_MembersInjector.create(
            provideSessionManagerProvider, provideAuthenticationServiceApiProvider);

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(
            provideSessionManagerProvider, provideAuthenticationServiceApiProvider);

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(provideAuthenticationServiceApiProvider);

    this.provideUserServiceAPIProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideUserServiceAPIFactory.create(
                builder.presenterModule, provideRetrofitProvider, provideSessionManagerProvider));

    this.reportProblemActivityMembersInjector =
        ReportProblemActivity_MembersInjector.create(
            provideSessionManagerProvider,
            provideAuthenticationServiceApiProvider,
            provideUserServiceAPIProvider);

    this.provideTaskRepositoryProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideTaskRepositoryFactory.create(
                builder.presenterModule,
                provideContextProvider,
                provideSessionManagerProvider,
                provideUserServiceAPIProvider));

    this.provideTaskListViewModelFactoryProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideTaskListViewModelFactoryFactory.create(
                builder.presenterModule, provideTaskRepositoryProvider));

    this.tasksActivityMembersInjector =
        TasksActivity_MembersInjector.create(
            provideSessionManagerProvider,
            provideAuthenticationServiceApiProvider,
            provideTaskListViewModelFactoryProvider);

    this.taskDetailActivityMembersInjector =
        TaskDetailActivity_MembersInjector.create(
            provideSessionManagerProvider,
            provideAuthenticationServiceApiProvider,
            provideTaskListViewModelFactoryProvider);

    this.provideMachineServiceAPIProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideMachineServiceAPIFactory.create(
                builder.presenterModule, provideRetrofitProvider, provideSessionManagerProvider));

    this.provideMachineRepositoryProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideMachineRepositoryFactory.create(
                builder.presenterModule,
                provideContextProvider,
                provideSessionManagerProvider,
                provideMachineServiceAPIProvider));

    this.provideMachineListViewModelFactoryProvider =
        DoubleCheck.provider(
            PresenterModule_ProvideMachineListViewModelFactoryFactory.create(
                builder.presenterModule, provideMachineRepositoryProvider));

    this.machinesActivityMembersInjector =
        MachinesActivity_MembersInjector.create(
            provideSessionManagerProvider,
            provideAuthenticationServiceApiProvider,
            provideMachineListViewModelFactoryProvider);

    this.machineDetailActivityMembersInjector =
        MachineDetailActivity_MembersInjector.create(
            provideSessionManagerProvider,
            provideAuthenticationServiceApiProvider,
            provideMachineListViewModelFactoryProvider);
  }

  @Override
  public void inject(BaseActivity target) {
    baseActivityMembersInjector.injectMembers(target);
  }

  @Override
  public void inject(MainActivity target) {
    mainActivityMembersInjector.injectMembers(target);
  }

  @Override
  public void inject(MachineServiceApplication target) {
    MembersInjectors.<MachineServiceApplication>noOp().injectMembers(target);
  }

  @Override
  public void inject(LoginActivity target) {
    loginActivityMembersInjector.injectMembers(target);
  }

  @Override
  public void inject(ReportProblemActivity target) {
    reportProblemActivityMembersInjector.injectMembers(target);
  }

  @Override
  public void inject(TasksActivity target) {
    tasksActivityMembersInjector.injectMembers(target);
  }

  @Override
  public void inject(TaskDetailActivity target) {
    taskDetailActivityMembersInjector.injectMembers(target);
  }

  @Override
  public void inject(MachinesActivity target) {
    machinesActivityMembersInjector.injectMembers(target);
  }

  @Override
  public void inject(MachineDetailActivity target) {
    machineDetailActivityMembersInjector.injectMembers(target);
  }

  public static final class Builder {
    private AppModule appModule;

    private PresenterModule presenterModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (presenterModule == null) {
        this.presenterModule = new PresenterModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder presenterModule(PresenterModule presenterModule) {
      this.presenterModule = Preconditions.checkNotNull(presenterModule);
      return this;
    }
  }
}
