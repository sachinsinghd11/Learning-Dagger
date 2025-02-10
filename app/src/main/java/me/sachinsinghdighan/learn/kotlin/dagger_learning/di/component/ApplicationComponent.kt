package me.sachinsinghdighan.learn.kotlin.dagger_learning.di.component

import android.content.Context
import dagger.Component
import me.sachinsinghdighan.learn.kotlin.dagger_learning.MyApplication
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.local.DatabaseService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.local.FileStorageService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.remote.HttpClient
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.remote.NetworkService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ApplicationContext
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: MyApplication)

    fun getHttpClient(): HttpClient

    @ApplicationContext
    fun getApplicationContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getFileStorageService(): FileStorageService


}