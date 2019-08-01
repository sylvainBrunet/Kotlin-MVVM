package base

import android.arch.lifecycle.ViewModel
import injection.component.ViewModelInjector
import injection.component.DaggerViewModelInjector
import injection.module.NetworkModule
import ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }


}