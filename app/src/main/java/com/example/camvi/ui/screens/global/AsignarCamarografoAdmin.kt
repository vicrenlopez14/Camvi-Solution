package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R

@Composable
fun AsignarCamarografoAdmin() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(30.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Text(
                text = "Asigna un camarógrafo",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 20.dp)
            )

            Text(
                text = "Camarógrafos disponibles.",
                fontSize = 13.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 20.dp)
            )

            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .padding(top = 15.dp, bottom = 12.dp)
                    .fillMaxWidth()
                    .background(color = Color(0xCFD1D3))
            )

            Column(modifier = Modifier.padding(top = 6.dp)) {
                LazyColumn(modifier = Modifier.fillMaxWidth()) {
                    items(10) { index ->
                        // Replace with your custom item layout
                        // item_asigna_camarografos_admin
                        Text(text = "Item $index")
                    }
                }
            }
        }
    }

}