package com.example.camvi.viewmodel.global

import androidx.lifecycle.ViewModel
import com.example.camvi.model.globales.UserBasicInformation

class LoggedUserviewModel : ViewModel() {
    private lateinit var userBasicInformation: UserBasicInformation


    // A user just logged
    fun saveLoggedUser(
        userBasicInformation: UserBasicInformation
    ) {
        this.userBasicInformation = userBasicInformation
    }

    // Get the user logged
    fun getLoggedUser(): UserBasicInformation {
        return userBasicInformation
    }

    // Is there a user logged
    fun isUserLogged(): Boolean {

        return this::userBasicInformation.isInitialized
    }

}

data class UserInformation(
    val id: Int,
    val name: String,
    val email: String,
    val password: String,
    val image: ByteArray,
    val tipoUsuario: TipoUsuario
)

sealed class TipoUsuario {
    object Admin : TipoUsuario()
    object Cliente : TipoUsuario()
    object Camarografo : TipoUsuario()
}
