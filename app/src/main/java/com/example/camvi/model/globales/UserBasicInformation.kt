package com.example.camvi.model.globales

data class UserBasicInformation(
    val id: Int? = null,
    val email: String? = null,
    val password: String? = null,
    val name: String? = null,
    val picture: ByteArray? = null,
)