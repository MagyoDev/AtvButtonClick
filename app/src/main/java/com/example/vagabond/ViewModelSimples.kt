package com.example.vagabond

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ViewModelSimples: ViewModel() {

  private val _contadorDaViewModel = MutableStateFlow(0)
    val contadorDaViewPublico: StateFlow<Int> get() = _contadorDaViewModel

    fun incrementaContador(){
        _contadorDaViewModel.value = _contadorDaViewModel.value + 1
    }
}
