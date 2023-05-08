package com.example.camvi.ui.widgets.administradores


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camvi.R
import com.example.camvi.model.administradores.Sesiones

@Preview
@Composable
fun ItemListaSesiones()
{
    Surface() {
        Row(verticalAlignment = Alignment.CenterVertically){
            Image(
                painter =  painterResource(id = R.drawable.estudiofotografico),
            contentDescription = null,)
           

        }

    }
}





