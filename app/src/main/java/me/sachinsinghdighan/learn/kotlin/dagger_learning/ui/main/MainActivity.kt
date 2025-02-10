package me.sachinsinghdighan.learn.kotlin.dagger_learning.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import me.sachinsinghdighan.learn.kotlin.dagger_learning.MyApplication
import me.sachinsinghdighan.learn.kotlin.dagger_learning.R
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.component.DaggerActivityComponent
import me.sachinsinghdighan.learn.kotlin.dagger_learning.di.module.ActivityModule
import me.sachinsinghdighan.learn.kotlin.dagger_learning.ui.home.HomeFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, viewModel.getSomeData(), Toast.LENGTH_LONG).show()

        addHomeFragment()
    }

    private fun getDependencies() = DaggerActivityComponent.builder()
        .applicationComponent((application as MyApplication).applicationComponent)
        .activityModule(ActivityModule(this)).build().inject(this)

    private fun addHomeFragment() {
        if (supportFragmentManager.findFragmentByTag(HomeFragment.TAG) == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_fragment, HomeFragment.newInstance(), HomeFragment.TAG)
                .commit()
        }
    }
}