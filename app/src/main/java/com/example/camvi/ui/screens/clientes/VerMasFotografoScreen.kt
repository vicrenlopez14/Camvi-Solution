package com.example.camvi.ui.screens.global

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Preview(showBackground = true)
@Composable
fun VerMasFotografoScreen() {
    Column (
        modifier = Modifier
            .padding(top = 20.dp, start = 8.dp)
            .fillMaxSize(),
    ) {
        BarraNotificaciones()
        ImagenCamarografo()
        NombreCamarografo()
        InfoCamarografo()
        SobreElCamarografo()
        }
}

@Composable
fun BarraNotificaciones(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.Top,
    ) {
        IconButton(
            onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.campana), contentDescription = "",
                Modifier.size(40.dp))
        }
    }
}

@Composable
fun ImagenCamarografo(){
    Card(
       colors = CardDefaults.cardColors(
       containerColor = colorResource(id = R.color.Yellow)),
       modifier = Modifier
           .width(380.dp)
           .padding(10.dp),
       ) {

        Column(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(10.dp)) {

            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "",
                modifier = Modifier
                    .padding(10.dp)
                    .size(80.dp))

            OutlinedButton(
                onClick = { /*TODO*/ },
                border = BorderStroke(width = 1.dp, color = colorResource(id = R.color.DarkYellow)),
                colors = ButtonDefaults.outlinedButtonColors (contentColor = colorResource(id = R.color.DarkYellow)),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)) {
                Text(
                    text = "Solicitar",
                    color= colorResource(id = R.color.DarkYellow))
            }
        }
   }
}

@Composable
fun NombreCamarografo(){
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
        .padding(15.dp)){
        Text(
            text = "Carlos Daniel Figueroa Campos",
            fontFamily = FontFamily(Font(R.font.inter_boldd))
        )
        Text(
            text = "Camarógrafo de Camvi")
    }
}

@Composable
fun InfoCamarografo(){
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(15.dp)){

        Text(
            modifier = Modifier
                .padding(bottom = 10.dp),
            text = "Información del camarógrafo",
            fontFamily = FontFamily(Font(R.font.inter_boldd))
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()){
            Image(
                painter = painterResource(id = R.drawable.escuela),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp))

            Text(text = "Licenciatura en comunicaciones",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 15.dp))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()){
            Image(
                painter = painterResource(id = R.drawable.correo),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp))

            Text(text = "carlosFigueroa@gmail.com",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 15.dp))
        }
    }
}

@Composable
fun SobreElCamarografo(){
    Column(horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(15.dp)) {

        Text(
            fontFamily = FontFamily(Font(R.font.inter_boldd)),
            text = "Sobre mi")

        Text(
            text = "Con más de cinco años de experiencia. Desde muy " +
                "pequeño me apasiona el arte de la fotografía, por lo que me " +
                "gradué en la licenciatura de comunicaciones.")
    }
}