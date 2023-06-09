package com.example.camvi.ui.screens.global

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import androidx.navigation.compose.rememberNavController
import com.example.camvi.R
import com.example.camvi.viewmodel.global.AccessViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun previewLogin() {
    val navController = rememberNavController()
    LoginScreen(navController = navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    val emailState = remember {
        mutableStateOf("")
    }

    val passwordState = remember {
        mutableStateOf("")
    }

    val context = LocalContext.current

    Surface() {
        LazyColumn {
            item {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Inicio de sesión",
                        fontFamily = FontFamily(Font(R.font.inter_boldd)),
                        color = Color.Black,
                        fontSize = 24.sp,
                        modifier = Modifier.paddingFromBaseline(top = 80.dp)
                    )

                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.arrowl),
                            contentDescription = null,
                            modifier = Modifier
                                .size(width = 18.dp, height = 20.dp)
                                .padding(start = 16.dp)
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(top = 32.dp)
                            .fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = emailState.value,
                            onValueChange = {
                                emailState.value = it
                            },
                            label = { Text("Correo") },
                            modifier = Modifier.fillMaxWidth(0.85f)
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        OutlinedTextField(
                            value = passwordState.value,
                            onValueChange = {
                                passwordState.value = it
                            },
                            label = { Text("Contraseña") },
                            visualTransformation = PasswordVisualTransformation(),
                            modifier = Modifier.fillMaxWidth(0.85f)
                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        Button(
                            onClick = {
                                AccessViewModel.Login(
                                    emailState.value,
                                    passwordState.value,
                                    context
                                )
                            },
                            shape = RoundedCornerShape(15.dp),
                            border = BorderStroke(width = 1.dp, color = Color(0xFFF3DE8A)),
                            colors = ButtonDefaults.outlinedButtonColors(
                                containerColor = Color.White
                            ),
                            modifier = Modifier
                                .fillMaxWidth(0.7f)
                                .height(61.dp)
                        ) {
                            Text(
                                text = "Iniciar sesión",
                                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                                color = Color.Black,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
        }

    }
}

