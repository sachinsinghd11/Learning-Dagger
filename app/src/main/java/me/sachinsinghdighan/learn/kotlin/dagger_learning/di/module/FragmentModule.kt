package me.sachinsinghdighan.learn.kotlin.dagger_learning.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import dagger.Module
import dagger.Provides
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ActivityContext

@Module
class FragmentModule(private val fragment: Fragment) {

    @ActivityContext
    @Provides
    fun provideContext(): Context = fragment.requireContext()
}