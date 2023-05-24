package com.example.camvi.model.globales

data class Session(
    val id: Int? = null,
    val titulo: String? = null,
    val detalles: String? = null,
    val fotoGaleria: ByteArray? = null,
    val direccionEvento: String? = null,
    val fechaEvento: String? = null,
    val horaInicio: String? = null,
    val horaFinalizacion: String? = null,
    val lugar: String? = null,
    val confirmada: Boolean? = null,
    val cancelada: Boolean? = null,
    val idFotografo: Int? = null,
    val nombreFotografo: String? = null,
    val idCliente: Int? = null,
    val nombreCliente: String? = null,
    val fechaCreacion: String? = null,
    val realizacion: String? = null,
)

data class SessionsListInfo(
    val id: Int? = null,
    val camarografo: String? = null,
    val cliente: String? = null,
    val titulo: String? = null,
    val fechaEvento: String? = null,
    val fotoGaleria: ByteArray? = null,
)