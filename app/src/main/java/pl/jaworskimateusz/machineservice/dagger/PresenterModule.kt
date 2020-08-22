package pl.jaworskimateusz.machineservice.dagger

import android.content.Context
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import pl.jaworskimateusz.machineservice.data.AppDatabase
import pl.jaworskimateusz.machineservice.data.repository.MachineRepository
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository
import pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI
import pl.jaworskimateusz.machineservice.services.MachineServiceAPI
import pl.jaworskimateusz.machineservice.services.UserServiceAPI
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class PresenterModule {

    companion object {
        const val BASE_URL = "http://10.0.2.2:8080"
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        val gson = GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .setLenient()
                .create()

        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val client = okHttpClient.newBuilder()
            .connectTimeout(60 , TimeUnit.SECONDS)
            .readTimeout(60 , TimeUnit.SECONDS)
            .writeTimeout(60 , TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor(interceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthenticationServiceApi(retrofit: Retrofit): AuthenticationServiceAPI {
        return AuthenticationServiceAPI(retrofit)
    }

    @Provides
    @Singleton
    fun provideUserServiceAPI(retrofit: Retrofit, sessionManager: SessionManager): UserServiceAPI {
        return UserServiceAPI(retrofit, sessionManager)
    }

    @Provides
    @Singleton
    fun provideMachineServiceAPI(retrofit: Retrofit, sessionManager: SessionManager): MachineServiceAPI {
        return MachineServiceAPI(retrofit, sessionManager)
    }

    @Provides
    @Singleton
    fun provideSessionManager(context: Context): SessionManager {
        return SessionManager(context)
    }

    @Provides
    @Singleton
    fun provideTaskRepository(
            context: Context,
            sessionManager: SessionManager,
            userServiceAPI: UserServiceAPI
    ): TaskRepository = TaskRepository(
            sessionManager,
            userServiceAPI,
            AppDatabase.getInstance(context.applicationContext).taskDao(),
            context
    )

    @Provides
    @Singleton
    fun provideMachineRepository(
            context: Context,
            sessionManager: SessionManager,
            machineServiceAPI: MachineServiceAPI
    ): MachineRepository = MachineRepository(
            sessionManager,
            machineServiceAPI,
            AppDatabase.getInstance(context.applicationContext).machineDao(),
            context
    )

    @Provides
    @Singleton
    fun provideTaskListViewModelFactory(taskRepository: TaskRepository): TaskViewModelFactory =
            TaskViewModelFactory(taskRepository)

    @Provides
    @Singleton
    fun provideMachineListViewModelFactory(machineRepository: MachineRepository): MachineViewModelFactory =
            MachineViewModelFactory(machineRepository)

}