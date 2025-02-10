package me.sachinsinghdighan.learn.kotlin.dagger_learning.ui.main

import androidx.lifecycle.ViewModel
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.local.DatabaseService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.remote.NetworkService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(
    private val networkService: NetworkService,
    private val databaseService: DatabaseService
): ViewModel() {

    fun getSomeData(): String{
        return "dsHashCode:" + databaseService.hashCode() + "\n nsHashCode" + networkService.hashCode()
    }
}