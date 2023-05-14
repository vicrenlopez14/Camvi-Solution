package com.example.camvi.model.administradores

import com.example.camvi.model.globales.Usuario
import java.sql.Time
import java.util.Date

data class Sesiones(
   // val idSesion: Int,

    val titulo :String,
    val detalles: String,
    val lugar:String,
    val fechaEvento: Date,
    val horaInicio: Time,
    val horaFinalizacion: Time,
    val nombre: String,
    val contacto: String,
    val dui: String
    //val idCliente: Int
)