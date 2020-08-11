

package pl.jaworskimateusz.machineservice.dagger

import androidx.room.TypeConverters
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.activity.LoginActivity
import pl.jaworskimateusz.machineservice.activity.MainActivity
import pl.jaworskimateusz.machineservice.activity.ReportProblemActivity
import pl.jaworskimateusz.machineservice.activity.TasksActivity
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import javax.inject.Singleton


@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, PresenterModule::class])
interface AppComponent{
    fun inject(target: BaseActivity)
    fun inject(target: MainActivity)
    fun inject(target: MachineServiceApplication)
    fun inject(target: LoginActivity)
    fun inject(target: ReportProblemActivity)
    fun inject(target: TasksActivity)

}
