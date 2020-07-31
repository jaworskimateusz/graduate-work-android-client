package pl.jaworskimateusz.machineservice

import android.app.Application
import pl.jaworskimateusz.machineservice.dagger.AppComponent
import pl.jaworskimateusz.machineservice.dagger.AppModule
import pl.jaworskimateusz.machineservice.dagger.DaggerAppComponent

class MachineServiceApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = initDagger(this)
        component.inject(this)

    }

    private fun initDagger(app: MachineServiceApplication): AppComponent =
        DaggerAppComponent.builder()
            .appModule(AppModule(app))
            .build()

}