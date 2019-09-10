package id.mustofa.app.sharedvm

import android.app.Application
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner

/**
 * @author Habib Mustofa
 * Indonesia on 10/09/19
 */
class MyApp : Application(), ViewModelStoreOwner {

    private val myViewModelStore: ViewModelStore by lazy { ViewModelStore() }

    override fun getViewModelStore() = myViewModelStore
}