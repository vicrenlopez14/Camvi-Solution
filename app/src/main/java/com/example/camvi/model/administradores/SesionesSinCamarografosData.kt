package com.example.camvi.model.administradores

data class SesionesSinCamarografosData(

    val idSesion: Int? = 0,
    val titulo: String,
    val direccionEvento: String,
    val fechaEvento: String,
    val horaInicio: String,
    val horaFinalizacion: String,
    val lugar: String,
    val confirmada: String,
   //val idFotografo: Int,
    //val idCliente: Int
)
