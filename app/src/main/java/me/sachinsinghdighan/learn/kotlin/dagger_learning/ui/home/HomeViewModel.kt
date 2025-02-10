package me.sachinsinghdighan.learn.kotlin.dagger_learning.ui.home

import androidx.lifecycle.ViewModel
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.local.DatabaseService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.local.FileStorageService
import me.sachinsinghdighan.learn.kotlin.dagger_learning.data.remote.NetworkService
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService,
    private val fileStorageService1: FileStorageService,
    private val fileStorageService2: FileStorageService,
): ViewModel() {

    fun getSomeData(): String {
        return " databaseService : " + databaseService.getDummyData() + "\n" +
                " databaseServiceHashCode : " + databaseService.hashCode() + "\n" +
                " networkService : " + networkService.getDummyData() + "\n" +
                " networkServiceHashCode : " + networkService.hashCode() + "\n" +
                " fileStorageService1HashCode : " + fileStorageService1.hashCode() + "\n" +
                " fileStorageService2HashCode : " + fileStorageService2.hashCode()
    }
}