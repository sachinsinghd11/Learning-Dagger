package me.sachinsinghdighan.learn.kotlin.dagger_learning.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import me.sachinsinghdighan.learn.kotlin.dagger_learning.MyApplication
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.local.FileStorageService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.remote.HttpClient
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ApplicationContext
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ApplicationScope
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.DatabaseName
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.DatabaseVersion
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.NetworkApiKey
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context = application

    @ApplicationScope
    @Provides
    fun provideHttpClient() = HttpClient()

    @Provides
    @DatabaseName
    fun provideDatabaseName() = "dummy_db"

    @Provides
    @DatabaseVersion
    fun provideDatabaseVersion() = 1

    @Provides
    @NetworkApiKey
    fun provideNetworkApiKey() = "SOME_API_KEY"

    @ApplicationScope
    @Provides
    fun provideFileStorageService() = FileStorageService()


}