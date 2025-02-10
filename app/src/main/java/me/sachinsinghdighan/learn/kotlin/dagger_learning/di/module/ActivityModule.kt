package me.sachinsinghdighan.learn.kotlin.dagger_learning.di.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ActivityContext
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ActivityScope

@Module
class ActivityModule(private val activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context = activity




}