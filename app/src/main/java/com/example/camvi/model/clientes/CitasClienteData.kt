package com.example.camvi.model.clientes

import com.example.camvi.model.globales.Usuario

data class CitasClienteData(
    val idSesion: Int,
    val titulo: String,
    val nombre: String,
    val fecha: String
) {
    companion object
}
