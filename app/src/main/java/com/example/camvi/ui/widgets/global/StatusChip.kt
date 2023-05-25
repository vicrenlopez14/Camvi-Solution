package com.example.camvi.ui.widgets.global

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camvi.model.globales.SessionStatus

@Preview
@Composable
fun StatusChipPreview() {
    StatusChip()
}

@Composable
fun StatusChip(status: SessionStatus = SessionStatus.Pendiente) {
    Surface(
        color = colorResource(id = status.ColorResource),
        contentColor = MaterialTheme.colorScheme.onError,
        shape = RoundedCornerShape(32.dp)
    ) {
        Text(
            status.Name,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                vertical = 8.dp,
                horizontal = 24.dp
            ),
        )
    }
}