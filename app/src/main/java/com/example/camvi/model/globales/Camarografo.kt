package com.example.camvi.model.globales

data class TbCamarografos(
    val idCamarografo: Int,
    val idUsuario: Int,
    val descripcionCorta: String,
    val acercaDe: String,
    val tituloDeFormacion: String,
    val imageSinFondo: ByteArray
)
