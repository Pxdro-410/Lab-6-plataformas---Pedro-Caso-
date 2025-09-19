// ----------------------------------------------------------------------------
// Pedro Caso
// 241286
// Lab 6 plataformas
// ----------------------------------------------------------------------------

package com.example.lab6platadormas_pc

import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(
    photo: PexelsPhoto,
    onBack: () -> Unit
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detalles") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Atrás")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = photo.src.original,
                contentDescription = photo.alt,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
            Spacer(Modifier.height(12.dp))
            Text("Autor: ${photo.photographer}")
            Text("Dimensiones: ${photo.width}x${photo.height}")
            Spacer(Modifier.height(12.dp))
            Button(onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, photo.url)
                }
                context.startActivity(Intent.createChooser(shareIntent, "Compartir con:"))
            }) {
                Text("Compartir")
            }
            Spacer(Modifier.height(16.dp))
        }
    }
}
