package com.example.camvi.utils

import android.content.Context
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.example.camvi.databinding.FragmentLoginBinding

@Composable
fun FragmentScreen(
    modifier: Modifier = Modifier,
    apply: (context: Context, parent: FrameLayout) -> Unit = { _, _ -> }
) {
    AndroidView(
        modifier = modifier
            .fillMaxSize(),
        factory = { context ->
            FrameLayout(context).apply {
                apply(context, this)
            }

        },
    )
}
