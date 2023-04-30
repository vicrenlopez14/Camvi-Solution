package com.example.camvi.model.globales

data class Usuario(
    val idUsuario: Int,
    val correo: String?,
    val nombre: String,
    val contacto: String?,
    val imagen: ByteArray?,
    val dui: String?,
    val pass: String,
    val tipoUsuario: Int?

)


