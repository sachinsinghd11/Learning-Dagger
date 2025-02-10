package me.sachinsinghdighan.learn.kotlin.dagger_learning.di.component

import dagger.Component
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.FragmentScope
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.module.FragmentModule
import me.sachinsinghdighan.learn.kotlin.dagger_learning.ui.home.HomeFragment

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {
    fun inject(fragment: HomeFragment)
}