package me.sachinsinghdighan.learn.kotlin.dagger_learning.data.local

import android.content.Context
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.ApplicationContext
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.DatabaseName
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.DatabaseVersion
import javax.inject.Inject

class DatabaseService @Inject constructor(
    @ApplicationContext private val context: Context,
    @DatabaseName private val databaseName: String,
    @DatabaseVersion private val databaseVersion: Int
) {
    fun getDummyData(): String{
        return "DATABASE_DUMMY_DATA"
    }
}