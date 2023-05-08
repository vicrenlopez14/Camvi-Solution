package com.example.camvi.ui.screens.clientes

import android.content.ClipData.Item
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R
import com.example.camvi.ui.widgets.clientes.ItemCamarografos

@Preview(showBackground = true)
@Composable
fun CamarografoScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
                           .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {

        Text(
            text = "Asigna un camarógrafo",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp)
                .fillMaxWidth())

        Text(
            text = "Camarógrafos disponibles.",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 30.dp)
                .fillMaxWidth())

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)) {

            LazyColumn(
                modifier = Modifier.padding(start = 5.dp),
                contentPadding = PaddingValues(bottom = 16.dp))
            {
                item { ItemCamarografos()}
            }

        }
    }
}

