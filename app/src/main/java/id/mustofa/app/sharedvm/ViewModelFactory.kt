package id.mustofa.app.sharedvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.mustofa.app.sharedvm.ui.SharedViewModel

/**
 * @author Habib Mustofa
 * Indonesia on 10/09/19
 */
class ViewModelFactory private constructor() : ViewModelProvider.NewInstanceFactory() {

    internal companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        operator fun invoke() = instance ?: synchronized(this) {
            instance ?: ViewModelFactory()
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>) = with(modelClass) {
        when {
            isAssignableFrom(SharedViewModel::class.java) -> SharedViewModel()
            else -> throw IllegalArgumentException("Unknown ViewModel: ${modelClass.name}")
        }
    } as T
}