package com.example.camvi.ui.screens.clientes

import android.content.res.ColorStateList
import android.widget.RatingBar
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.camvi.R
import com.example.camvi.ui.theme.Yellow


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun CalificarSesion(){
    Surface{
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrowl),
                contentDescription = null,
                modifier = Modifier
                    .size(width = 100.dp, height = 40.dp)
                    .padding(top = 18.dp)
                    .padding(end = 60.dp)
                )
        }
        LazyColumn{
            item {
                Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp, vertical = 10.dp),
                 horizontalAlignment = Alignment.CenterHorizontally

        ) {

             Spacer(modifier = Modifier.height(48.dp))
             Text(
                text = "Sesión fotografica para cumpleaños", //aca va el titulo o sea variable
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                fontSize= 18.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(bottom = 5.dp)
                    .padding(end = 56.dp)
            )
            EventoCalificacion()
            Spacer(modifier = Modifier.height(20.dp))
            OtrosCalficacion()
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                    text = "Añade tus comentarios",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontSize= 16.sp,
                    color = Color.Black,
                    textAlign= TextAlign.Start,
                    modifier = Modifier.padding(end = 190.dp),
            )
            OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = {
                Text(
                    text = "Comentarios",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            },
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth(0.95f)
                .height(60.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
               horizontalArrangement = Arrangement.Start,
               verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
            onClick = { /*TODO*/ },
           shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(width = 1.dp, color = Color(0xFFF3DE8A)),
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .height(40.dp)
        ) {
            Text(
                text = "Guardar",
                color = Color.Black,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.inter_semibold))
            )
        }
         Spacer(modifier = Modifier.width(50.dp))
            Button(
            onClick = { /*TODO*/ },
           shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(width = 1.dp, color = Color(0xFFF3DE8A)),
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .height(40.dp)
        ) {
            Text(
                text = "Cancelar",
                color = Color.Black,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.inter_semibold))
            )
        }
        Spacer(modifier = Modifier.width(20.dp))
        }


        }
            }
        }
    }
}


@Composable
fun EventoCalificacion(){
    Surface() {
         Column (
        modifier = Modifier.fillMaxSize()
            ){
             Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Evento",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontSize= 16.sp,
                    color = Color.Black,
                    textAlign= TextAlign.Start,
                    modifier = Modifier.padding(end = 280.dp)
            )
        Spacer(modifier = Modifier.height(6.dp))
        Row{
            Text(
                     text = "Puntualidad del fotógrafo",
                     fontFamily= FontFamily(Font(R.font.inter)),
                     fontSize = 13.sp,
                     color = Color.Black,
                    modifier = Modifier.padding(top = 16.dp).weight(1f)
                 )
            AndroidView(factory = {
                RatingBar(it).apply {
                    numStars= 5
                    stepSize = 0.2f
                    rating = 4f
                    scaleX = 0.5F
                    scaleY = 0.5F
                    Modifier.weight(1f)
                    //translationX= 32f
                    backgroundTintList= ColorStateList.valueOf(0xFFF3DE8A.toInt())

                }
            })
        }
             Spacer(modifier = Modifier.height(6.dp))
        Row{
            Text(
                     text = "Actitud del fotógrafo",
                     fontFamily= FontFamily(Font(R.font.inter)),
                     fontSize = 13.sp,
                     color = Color.Black,
                    modifier = Modifier.padding(top = 16.dp).weight(1f)
                 )
            AndroidView(factory = {
                RatingBar(it).apply {
                    numStars= 5
                    stepSize = 0.2f
                    rating = 4f
                    scaleX = 0.5F
                    scaleY = 0.5F
                    Modifier.weight(1f)
                    //translationX= 32f
                    backgroundTintList= ColorStateList.valueOf(0xFFF3DE8A.toInt())

                }
            })
        }
        Spacer(modifier = Modifier.height(6.dp))
        Row{
            Text(
                     text = "Desempeño del fotógrafo",
                     fontFamily= FontFamily(Font(R.font.inter)),
                     fontSize = 13.sp,
                     color = Color.Black,
                    modifier = Modifier.padding(top = 16.dp).weight(1f)
                 )
            AndroidView(factory = {
                RatingBar(it).apply {
                    numStars= 5
                    stepSize = 0.2f
                    rating = 4f
                    scaleX = 0.5F
                    scaleY = 0.5F
                    Modifier.weight(1f)
                    //translationX= 32f
                    backgroundTintList= ColorStateList.valueOf(0xFFF3DE8A.toInt())

                }
            })
        }
        Spacer(modifier = Modifier.height(6.dp))
        Row{
            Text(
                     text = "Profesionalismo del fotógrafo",
                     fontFamily= FontFamily(Font(R.font.inter)),
                     fontSize = 13.sp,
                     color = Color.Black,
                    modifier = Modifier.padding(top = 16.dp).weight(1f)
                 )
            AndroidView(factory = {
                RatingBar(it).apply {
                    numStars= 5
                    stepSize = 0.2f
                    rating = 4f
                    scaleX = 0.5F
                    scaleY = 0.5F
                    Modifier.weight(1f)
                    backgroundTintList= ColorStateList.valueOf(0xFFF3DE8A.toInt())

                }
            })
        }
        Spacer(modifier = Modifier.height(6.dp))
        Row{
            Text(
                     text = "Presentación del fotógrafo",
                     fontFamily= FontFamily(Font(R.font.inter)),
                     fontSize = 13.sp,
                     color = Color.Black,
                    modifier = Modifier.padding(top = 16.dp).weight(1f)
                 )
            AndroidView(factory = {
                RatingBar(it).apply {
                    numStars= 5
                    stepSize = 0.2f
                    rating = 4f
                    scaleX = 0.5F
                    scaleY = 0.5F
                    Modifier.weight(1f)
                    //translationX= 20f
                    backgroundTintList= ColorStateList.valueOf(0xFFF3DE8A.toInt())

                }
            })
        }
    }
    }
}

@Composable
fun OtrosCalficacion(){
    Surface() {
        Column (
             modifier = Modifier.fillMaxWidth()
                ){
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Otros",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontSize= 16.sp,
                    color = Color.Black,
                    textAlign= TextAlign.Start,
                    modifier = Modifier.padding(end = 280.dp),
            )
            Spacer(modifier = Modifier.height(6.dp))
        Row{
            Text(
                     text = "Atención          ",
                     fontFamily= FontFamily(Font(R.font.inter)),
                     fontSize = 13.sp,
                     color = Color.Black,
                    modifier = Modifier.padding(top = 16.dp).weight(1f)
                 )
            AndroidView(factory = {
                RatingBar(it).apply {
                    numStars= 5
                    stepSize = 0.2f
                    rating = 4f
                    scaleX = 0.5F
                    scaleY = 0.5F
                    Modifier.weight(1f)
                    backgroundTintList= ColorStateList.valueOf(0xFFF3DE8A.toInt())

                }
            })
        }
         Row{
            Text(
                     text = "Espera de respuestas",
                     fontFamily= FontFamily(Font(R.font.inter)),
                     fontSize = 13.sp,
                     color = Color.Black,
                    modifier = Modifier.padding(top = 16.dp).weight(1f)
                 )
            AndroidView(factory = {
                RatingBar(it).apply {
                    numStars= 5
                    stepSize = 0.2f
                    rating = 4f
                    scaleX = 0.5F
                    scaleY = 0.5F
                    Modifier.weight(1f)
                    //translationX= 86f
                    backgroundTintList= ColorStateList.valueOf(0xFFF3DE8A.toInt())

                }
            })
        }
         Row{
            Text(
                     text = "Calidad del producto final",
                     fontFamily= FontFamily(Font(R.font.inter)),
                     fontSize = 13.sp,
                     color = Color.Black,
                    modifier = Modifier.padding(top = 16.dp).weight(1f)
                        //.padding(end = 90.dp)
                 )
            AndroidView(factory = {
                RatingBar(it).apply {
                    numStars= 5
                    stepSize = 0.2f
                    rating = 4f
                    scaleX = 0.5F
                    scaleY = 0.5F
                    Modifier.weight(1f)
                    //translationX= 34f
                    backgroundTintList= ColorStateList.valueOf(0xFFF3DE8A.toInt())

                }
            })
        }



        }
    }

}
