package com.example.camvi.ui.screens.administradores

import android.content.res.ColorStateList
import android.widget.RatingBar
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.camvi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun DetalleSesionCalificada(){
    Surface() {
        Column (
            modifier = Modifier.fillMaxSize()

        ){
            Text(text = "Sesión fotográfica para Baby shower",
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 20.dp, top = 20.dp)


            )
            Spacer(Modifier.height(20.dp))
            Text(text = "Califcación",
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 150.dp),
                            textAlign = TextAlign.Center
                )
            Spacer(Modifier.height(10.dp))
            AndroidView(factory = {
                                RatingBar(it).apply {
                                    numStars = 5
                                    stepSize = 0.2f
                                    rating = 4f
                                    scaleX = 1F
                                    scaleY = 1F
                                    Modifier.fillMaxWidth()
                                    translationX= 160f
                                    backgroundTintList = ColorStateList.valueOf(0xFFF3DE8A.toInt())

                                    RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->

                                    }
                                }
            })
            LazyColumn {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 20.dp, vertical = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Spacer(modifier = Modifier.height(10.dp))
                    //EventoCalificacion()
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Evento",
                            fontFamily = FontFamily(Font(R.font.inter_semibold)),
                            fontSize = 16.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.padding(end = 280.dp)
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Row {
                            Text(
                                text = "Puntualidad del fotógrafo",
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontSize = 13.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(top = 16.dp)
                                    .weight(1f)
                            )
                            AndroidView(factory = {
                                RatingBar(it).apply {
                                    numStars = 5
                                    stepSize = 1f
                                    rating = 5f
                                    scaleX = 0.5F
                                    scaleY = 0.5F
                                    Modifier.weight(1f)
                                    backgroundTintList = ColorStateList.valueOf(0xFFF3DE8A.toInt())

                                    RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                                        //val num: Int = ratingBar.rating.toInt()

                                    }
                                }

                            })
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Row {
                            Text(
                                text = "Actitud del fotógrafo",
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontSize = 13.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(top = 16.dp)
                                    .weight(1f)
                            )
                            AndroidView(factory = {
                                RatingBar(it).apply {
                                    numStars = 5
                                    stepSize = 0.2f
                                    rating = 4f
                                    scaleX = 0.5F
                                    scaleY = 0.5F
                                    Modifier.weight(1f)
                                    //translationX= 32f
                                    backgroundTintList = ColorStateList.valueOf(0xFFF3DE8A.toInt())

                                    RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                                        //actitudFotografo.value = rating.toString()
                                    }

                                }
                            })
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Row {
                            Text(
                                text = "Desempeño del fotógrafo",
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontSize = 13.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(top = 16.dp)
                                    .weight(1f)
                            )
                            AndroidView(factory = {
                                RatingBar(it).apply {
                                    numStars = 5
                                    stepSize = 0.2f
                                    rating = 4f
                                    scaleX = 0.5F
                                    scaleY = 0.5F
                                    Modifier.weight(1f)
                                    //translationX= 32f
                                    backgroundTintList = ColorStateList.valueOf(0xFFF3DE8A.toInt())

                                    RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                                       // desempenoFotografo.value = rating.toString()
                                    }


                                }
                            })
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Row {
                            Text(
                                text = "Profesionalismo del fotógrafo",
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontSize = 13.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(top = 16.dp)
                                    .weight(1f)
                            )
                            AndroidView(factory = {
                                RatingBar(it).apply {
                                    numStars = 5
                                    stepSize = 0.2f
                                    rating = 4f
                                    scaleX = 0.5F
                                    scaleY = 0.5F
                                    Modifier.weight(1f)
                                    backgroundTintList = ColorStateList.valueOf(0xFFF3DE8A.toInt())

                                    RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                                        //profesionalismoFotografo.value = rating.toString()
                                    }

                                }
                            })
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Row {
                            Text(
                                text = "Presentación del fotógrafo",
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontSize = 13.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(top = 16.dp)
                                    .weight(1f)
                            )
                            AndroidView(factory = {
                                RatingBar(it).apply {
                                    numStars = 5
                                    stepSize = 0.2f
                                    rating = 4f
                                    scaleX = 0.5F
                                    scaleY = 0.5F
                                    Modifier.weight(1f)
                                    backgroundTintList = ColorStateList.valueOf(0xFFF3DE8A.toInt())

                                    RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                                        //presentacionPersonalFotografo.value = rating.toString()
                                    }

                                }
                            })
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    //OtrosCalficacion()
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Otros",
                            fontFamily = FontFamily(Font(R.font.inter_semibold)),
                            fontSize = 16.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.padding(end = 280.dp),
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Row {
                            Text(
                                text = "Atención          ",
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontSize = 13.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(top = 16.dp)
                                    .weight(1f)
                            )
                            AndroidView(factory = {
                                RatingBar(it).apply {
                                    numStars = 5
                                    stepSize = 0.2f
                                    rating = 4f
                                    scaleX = 0.5F
                                    scaleY = 0.5F
                                    Modifier.weight(1f)
                                    backgroundTintList = ColorStateList.valueOf(0xFFF3DE8A.toInt())
                                    RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                                        //servicioDeAtencion.value = rating.toString()
                                    }

                                }
                            })
                        }
                        Row {
                            Text(
                                text = "Espera de respuestas",
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontSize = 13.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(top = 16.dp)
                                    .weight(1f)
                            )
                            AndroidView(factory = {
                                RatingBar(it).apply {
                                    numStars = 5
                                    stepSize = 0.2f
                                    rating = 4f
                                    scaleX = 0.5F
                                    scaleY = 0.5F
                                    Modifier.weight(1f)
                                    //translationX= 86f
                                    backgroundTintList = ColorStateList.valueOf(0xFFF3DE8A.toInt())

                                    RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                                        //esperaDeRespuestas.value = rating.toString()
                                    }

                                }
                            })
                        }
                        Row {
                            Text(
                                text = "Calidad del producto final",
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontSize = 13.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(top = 16.dp)
                                    .weight(1f)
                                //.padding(end = 90.dp)
                            )
                            AndroidView(factory = {
                                RatingBar(it).apply {
                                    numStars = 5
                                    stepSize = 0.2f
                                    rating = 4f
                                    scaleX = 0.5F
                                    scaleY = 0.5F
                                    Modifier.weight(1f)
                                    //translationX= 34f
                                    backgroundTintList = ColorStateList.valueOf(0xFFF3DE8A.toInt())

                                    RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                                        //calidadDelProductoFinal.value = rating.toString()
                                    }

                                }
                            })
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Comentarios",
                        fontFamily = FontFamily(Font(R.font.inter_semibold)),
                        fontSize = 16.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(end = 240.dp),
                    )
                    Text(
                                text = "Muy buena atencicón, me gusto mucho la manera en que trabajan",
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontSize = 14.sp,
                                color = Color.Black
                            )
                    Spacer(modifier = Modifier.height(10.dp))

                }
            }
        }










        }

    }
}