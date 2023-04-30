package com.example.camvi.ui.screens.global

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.runtime.Composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.camvi.AdministradoresActivity
import com.example.camvi.R
import com.example.camvi.controller.global.LoginActivity
import com.example.camvi.model.globales.CamviProcedures
import com.example.camvi.ui.widgets.global.CamviScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavController) {
    val nombre = remember {
        mutableStateOf("")
    }

    val contacto = remember {
        mutableStateOf("")
    }

    val dui = remember {
        mutableStateOf("")
    }

    val correo = remember {
        mutableStateOf("")
    }

    val contrasena = remember {
        mutableStateOf("")
    }

    val context = LocalContext.current

    LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp, vertical = 30.dp)
            ) {
                Text(
                    text = "Crea tu perfil",
                    fontFamily = FontFamily(Font(R.font.inter_boldd)),
                    fontSize = 24.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(bottom = 20.dp)
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arrowl),
                        contentDescription = "",
                        modifier = Modifier.size(width = 22.dp, height = 25.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.persona),
                        contentDescription = "",
                        modifier = Modifier
                            .size(width = 96.dp, height = 98.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape)
                    )

                    Text(
                        text = "Agregar",
                        fontFamily = FontFamily(Font(R.font.inter_semibold)),
                        fontSize = 16.sp,
                        color = Color(0xFFD29405),
                        modifier = Modifier
                            .padding(vertical = 30.dp)
                            .clickable(onClick = { /* TODO */ })
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = nombre.value,
                    onValueChange = {
                        nombre.value = it
                    },
                    label = { Text("Nombre") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = contacto.value,
                    onValueChange = {
                        contacto.value = it
                    },
                    label = { Text("Contacto") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = dui.value,
                    onValueChange = {
                        dui.value = it
                    },
                    label = { Text("DUI") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = correo.value,
                    onValueChange = {
                        correo.value = it
                    },
                    label = { Text("Correo") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = contrasena.value,
                    onValueChange = {
                        contrasena.value = it
                    },
                    label = { Text("Contraseña") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(40.dp))

                Button(
                    onClick = {
                        Registrar(
                            nombre.value,
                            contacto.value,
                            dui.value,
                            correo.value,
                            contrasena.value,
                            context
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                ) {
                    Text(text = "Crear usuario")
                }
            }
        }
    }

}

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
    } else {

        val result = CamviProcedures.spRegistrarCliente(
            nombre,
            correo,
            contrasena,
            contacto,
            dui
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