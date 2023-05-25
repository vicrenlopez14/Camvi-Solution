package com.example.camvi.viewmodel.global

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.first

class LoggedUserviewModel : ViewModel() {
    private val USER_EMAIL = stringPreferencesKey("user_email")
    private val USER_PASSWORD = stringPreferencesKey("user_password")
    private lateinit var dataStore: DataStore<Preferences>

    fun Initialize(dataStore: DataStore<Preferences>) {
        this.dataStore = dataStore
    }

    // Is there a user logged
    suspend fun isUserLogged(): Boolean {
        val preferences = dataStore.data.first()
        val email = preferences[USER_EMAIL] ?: ""
        val password = preferences[USER_PASSWORD] ?: ""
        return email.isNotEmpty() && password.isNotEmpty()
    }

    // Is there user information saved?
    suspend fun isUserInformationSaved(): Boolean {
        val preferences = dataStore.data.first()
        val email = preferences[USER_EMAIL] ?: ""
        val password = preferences[USER_PASSWORD] ?: ""
        return email.isNotEmpty() && password.isNotEmpty()
    }

    suspend fun saveUserInformation(
        email: String,
        password: String
    ) {
        dataStore.edit { preferences ->
            preferences[USER_EMAIL] = email
            preferences[USER_PASSWORD] = password
        }
    }

    suspend fun getUserInformation(): UserInformation {
        val preferences = dataStore.data.first()
        val email = preferences[USER_EMAIL] ?: ""
        val password = preferences[USER_PASSWORD] ?: ""
        return UserInformation(
            id = 0,
            name = "",
            email = email,
            password = password,
            image = byteArrayOf(),
            tipoUsuario = TipoUsuario.Cliente
        )
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
