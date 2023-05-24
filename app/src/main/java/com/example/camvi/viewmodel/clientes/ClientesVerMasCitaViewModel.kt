package com.example.camvi.viewmodel.clientes

import androidx.lifecycle.ViewModel
import com.example.camvi.model.clientes.CitasClienteData
import com.example.camvi.model.clientes.CitasClienteDetalleData
import com.example.camvi.model.globales.CamviFunctions
import com.example.camvi.ui.state.administradores.clientes.ClientesVerMasCitaState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

private val CitasClienteData.Companion.idSesion: Int
    get() = this.idSesion

class ClientesVerMasCitaViewModel : ViewModel(){

    private val _uiState = MutableStateFlow(ClientesVerMasCitaState())
    val uiState: StateFlow<ClientesVerMasCitaState> = _uiState.asStateFlow()

    private val titulo: String = ""
    private val detalle : String = ""
    private val lugar: String = ""
    private val fecha: String = ""
    private val horaIni: String = ""
    private val horaFinali: String = ""
    private val nombre:String =""
    private val contacto: String = ""
    private val dui: String = ""
    private val fotografo: String = ""

    init {
        VerMasCitasCliente()
    }


    //revisar esta parte xd
    private fun VerMasCitasCliente(){
        val detalles = CamviFunctions.fnCitasClienteDetalle(idSesion= CitasClienteData.idSesion)

        _uiState.value= _uiState.value.copy(
            titulo = detalles.get(1).toString(),
            detalle = detalles.get(2).toString(),
            lugar = detalles.get(3).toString(),
            fecha = detalles.get(4).toString(),
            horaIni= detalles.get(5).toString(),
            horaFinali = detalles.get(6).toString(),
            nombre = detalles.get(7).toString(),
            contacto = detalles.get(8).toString(),
            dui = detalles.get(9).toString(),
            fotografo = detalles.get(10).toString()
        )
    }



}