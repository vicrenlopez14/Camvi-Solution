package com.example.camvi.viewmodel.clientes

import androidx.lifecycle.ViewModel
import com.example.camvi.model.clientes.VerMasCamarografoData
import com.example.camvi.model.globales.CamviFunctions
import com.example.camvi.ui.state.administradores.clientes.VerMasCamarografoState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

private val VerMasCamarografoData.Companion.idCamarografo: Int
    get() = this.idCamarografo

class VerMasCamarografoViewModel: ViewModel(){

    private val _uiState = MutableStateFlow(VerMasCamarografoState())
    val uiState: StateFlow<VerMasCamarografoState> = _uiState.asStateFlow()

    private val nombre:String = ""
    private val correo:String = ""
    private val acercaDe: String = ""
    private val descripcionCorta: String = ""
    private val tituloFormacion:String = ""
    private val imagen: String = ""

    init {
        VerMasCamarografo()
    }

    private fun VerMasCamarografo(){
        val detalles =
            CamviFunctions.fnVerMasCamarografo(idCamarografo = VerMasCamarografoData.idCamarografo)

        _uiState.value = _uiState.value.copy(
            nombre = detalles.get(1).toString(),
            correo = detalles.get(2).toString(),
            acercaDe = detalles.get(3).toString(),
            descripcionCorta = detalles.get(4).toString(),
            tituloFormacion = detalles.get(5).toString(),
            imagen = detalles.get(6).toString()
        )
    }
}