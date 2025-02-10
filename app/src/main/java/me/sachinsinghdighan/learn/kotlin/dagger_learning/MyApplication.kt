package me.sachinsinghdighan.learn.kotlin.dagger_learning

import android.app.Application
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.local.DatabaseService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.remote.NetworkService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.component.ApplicationComponent
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.component.DaggerApplicationComponent
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var  databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(
            ApplicationModule(this)).build()
        applicationComponent.inject(this)
    }

}