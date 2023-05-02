package com.example.camvi.model.administradores

import java.sql.Time
import java.util.Date

data class Sesiones(
    val idSesion: Int,
    val titulo :String,
    val detalles: String,
    val idFotoGaleria: Int,
    val direccionEvento: String,
    val fechaEvento: Date,
    val horaInicio: Time,
    val horaFinalizacion: Time,
    val lugar:String,
    val confirmada: Boolean,
    val cancelada: Boolean,
    val idFotografo: Int,
    val idCliente: Int
)
