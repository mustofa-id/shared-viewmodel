package id.mustofa.app.sharedvm.util

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.mustofa.app.sharedvm.MyApp
import id.mustofa.app.sharedvm.ViewModelFactory
import kotlin.reflect.KClass

/**
 * @author Habib Mustofa
 * Indonesia on 10/09/19
 */
fun <T : ViewModel> AppCompatActivity.obtainViewModel(viewModel: KClass<T>) =
    ViewModelProvider(application as MyApp, ViewModelFactory())[viewModel.java]

fun AppCompatActivity.clearViewModel() = (application as MyApp).viewModelStore.clear()
