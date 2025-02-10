package me.sachinsinghdighan.learn.kotlin.dagger_learning.data.remote

import android.content.Context
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ApplicationContext
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.NetworkApiKey
import javax.inject.Inject

class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @NetworkApiKey val apiKey: String,

) {
    fun getDummyData(): String =  "NETWORK_DUMMY_DATA"
}