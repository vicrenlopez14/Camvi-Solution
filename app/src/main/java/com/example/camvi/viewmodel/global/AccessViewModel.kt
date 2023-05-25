package com.example.camvi.viewmodel.global

import android.content.Context
import android.content.Intent
import android.util.Patterns
import android.widget.Toast
import com.example.camvi.AdministradoresActivity
import com.example.camvi.CamarografosActivity
import com.example.camvi.ClientesActivity
import com.example.camvi.model.globales.CamviFunctions
import com.example.camvi.model.globales.CamviProcedures
import com.example.camvi.model.globales.UserBasicInformation

class AccessViewModel {
    companion object {
        fun Login(email: String, password: String, context: Context): UserBasicInformation {
            if (email.isNotEmpty() && password.isNotEmpty()) {

                val tipoUsuario = CamviFunctions.fnIniciarSesion(email, password)

                // Switch
                when (tipoUsuario) {
                    1 -> {
                        val intent = Intent(context, AdministradoresActivity::class.java)
                        intent.putExtra("email", email)
                        intent.putExtra("password", password)
                        intent.putExtra("tipoUsuario", tipoUsuario)
                        context.startActivity(intent)

                        return CamviFunctions.getUserByEmail(email) ?: UserBasicInformation(
                            email = email,
                            password = password,
                            name = "Admin",
                            picture = null
                        )
                    }

                    2 -> {
                        val intent = Intent(context, CamarografosActivity::class.java)
                        intent.putExtra("email", email)
                        intent.putExtra("password", password)
                        intent.putExtra("tipoUsuario", tipoUsuario)
                        context.startActivity(intent)

                        return CamviFunctions.getUserByEmail(email) ?: UserBasicInformation(
                            email = email,
                            password = password,
                            name = "Camarografo",
                            picture = null
                        )
                    }

                    3 -> {
                        val intent = Intent(context, ClientesActivity::class.java)
                        intent.putExtra("email", email)
                        intent.putExtra("password", password)
                        intent.putExtra("tipoUsuario", tipoUsuario)
                        context.startActivity(intent)

                        return CamviFunctions.getUserByEmail(email) ?: UserBasicInformation(
                            email = email,
                            password = password,
                            name = "Usuario",
                            picture = null
                        )
                    }

                    else -> {
                        return CamviFunctions.getUserByEmail(email) ?: UserBasicInformation(
                            email = email,
                            password = password,
                            name = "Usuario",
                            picture = null
                        )
                    }
                }
            }

            return CamviFunctions.getUserByEmail(email) ?: UserBasicInformation(
                email = email,
                password = password,
                name = "Usuario",
                picture = null
            )
        }

        //validacion de correo electronico y contraseña
        fun ValidarCorreo(correo: String): Boolean =
            Patterns.EMAIL_ADDRESS.matcher(correo).matches();

        fun ValidarContrasenia(contrasena: String): Boolean = contrasena.length >= 6;

        fun Registrar(
            nombre: String,
            contacto: String,
            dui: String,
            correo: String,
            contrasena: String,
            context: Context
        ) {
            if (nombre.isEmpty() || contacto.isEmpty() || dui.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(
                    context,
                    "Por favor, rellene todos los campos",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else if (ValidarCorreo(correo) == false || ValidarContrasenia(contrasena) == false) {
                Toast.makeText(
                    context,
                    "Revise la dirección de correo o escriba una contraseña más de al menos 6 digitos",
                    Toast.LENGTH_LONG
                ).show();
            } else {

                val result = CamviProcedures.spRegistrarCliente(
                    nombre,
                    contacto,
                    dui,
                    correo,
                    contrasena,
                )

                if (result == 1) {
                    val intent: Intent = Intent(context, AdministradoresActivity::class.java)
                    context.startActivity(intent)
                } else {
                    Toast.makeText(
                        context,
                        "Error al registrar usuario",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}