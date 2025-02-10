package me.sachinsinghdighan.learn.kotlin.dagger_learning.di.component

import dagger.Component
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ActivityScope
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.module.ActivityModule
import me.sachinsinghdighan.learn.kotlin.dagger_learning.ui.main.MainActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}