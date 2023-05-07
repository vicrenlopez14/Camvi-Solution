package com.example.camvi.model.clientes

import com.example.camvi.model.administradores.Sesiones

data class CalificarSesionData (
    val puntualidadFotografo: Int,
    val actitudFotografo:Int,
    val desempenoFotografo: Int,
    val profesionalismoFotografo: Int,
    val presentacionPersonalFotografo: Int,
    val servicioDeAtencion: Int,
    val esperaDeRespuestas: Int,
    val calidadDelProductoFinal: Int,
    val comentarios: String,
    //val clienteId: Int,
    //val sesionId: Int
)
