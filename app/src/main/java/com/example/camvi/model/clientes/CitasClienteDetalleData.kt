package com.example.camvi.model.clientes

data class CitasClienteDetalleData(
   val idSesion: Int? = null,
    val titulo: String? = null,
    val detalle : String? = null,
    val lugar: String? = null,
    val fecha: String? = null,
    val horaIni: String? = null,
    val horaFinali: String? = null,
    val nombre:String? = null,
    val contacto: String? = null,
    val dui: String? = null,
    val fotografo: String? = null
)

data class CitasData(
     val idSesion: Int? = null,
    val titulo: String? = null,
    val nombre: String? = null,
    val fecha: String? = null,
)
