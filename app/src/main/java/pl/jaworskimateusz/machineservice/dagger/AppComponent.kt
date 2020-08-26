package pl.jaworskimateusz.machineservice.dagger

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.activity.*
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
    fun inject(target: TaskDetailActivity)
    fun inject(target: MachinesActivity)
    fun inject(target: MachineDetailActivity)
    fun inject(target: IssuesActivity)
    fun inject(target: IssueDetailActivity)

}
