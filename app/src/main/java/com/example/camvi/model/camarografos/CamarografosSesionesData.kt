package com.example.camvi.model.camarografos

data class CamarografosSesionesData(
    val idSesion: Int? = null,
    val titulo: String?= null,
    val detalle: String? = null,
    val fotoGaleria: ByteArray? = null,
    val direccionEvento: String? = null,
    val fechaEvento: String? = null,
    val horaInicio: String? = null,
    val horaFinalizacion: String? = null,
    val lugar: String? = null,
    val confirmada: Boolean? = null,
    val cancelada: Boolean? = null,
    val nombre: String? = null,
    val contacto: String? = null,
    val dui: String? = null,
    val fotografo: String? = null
)

data class ListCitasData(
    val idSesion: Int? = null,
    val titulo: String?= null,
    val fotografo: String? = null,
    val fechaEvento: String? = null,
    val fotoGaleria: ByteArray? = null
)