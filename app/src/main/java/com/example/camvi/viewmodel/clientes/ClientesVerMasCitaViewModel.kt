package com.example.camvi.viewmodel.clientes

import androidx.lifecycle.ViewModel
import com.example.camvi.model.clientes.CitasClienteData
import com.example.camvi.model.globales.CamviFunctions
import com.example.camvi.ui.state.administradores.clientes.ClientesVerMasCitaState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

private val CitasClienteData.Companion.idSesion: Int
    get() = this.idSesion

class ClientesVerMasCitaViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ClientesVerMasCitaState())
    val uiState: StateFlow<ClientesVerMasCitaState> = _uiState.asStateFlow()

    private val titulo: String = ""
    private val detalle: String = ""
    private val lugar: String = ""
    private val fecha: String = ""
    private val horaIni: String = ""
    private val horaFinali: String = ""
    private val nombre: String = ""
    private val contacto: String = ""
    private val dui: String = ""
    private val fotografo: String = ""

    init {
        VerMasCitasCliente()
    }


    //revisar esta parte xd
    private fun VerMasCitasCliente() {
        val detalles = CamviFunctions.fnCitasClienteDetalle(idSesion = CitasClienteData.idSesion)

        _uiState.value = _uiState.value.copy(
            titulo = detalles.toString(),
            detalle = detalles.toString(),
            lugar = detalles.toString(),
            fecha = detalles.toString(),
            horaIni = detalles.toString(),
            horaFinali = detalles.toString(),
            nombre = detalles.toString(),
            contacto = detalles.toString(),
            dui = detalles.toString(),
            fotografo = detalles.toString()
        )
    }


}