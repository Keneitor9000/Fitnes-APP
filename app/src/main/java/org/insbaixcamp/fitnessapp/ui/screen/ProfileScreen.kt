package org.insbaixcamp.fitnessapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.insbaixcamp.fitnessapp.ui.theme.FitnessAppTheme

@Composable
fun ProfileScreen(
    nombre: String = "Laia Soler",
    email: String = "laia.soler@exemple.com",
    dataNacimiento: String = "25",
    genere: String = "Dona",
    alcada: String = "165 cm",
    pes: String = "60 kg",
    editar: Boolean = false
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Perfil", style = MaterialTheme.typography.headlineSmall)
            if (editar) {
                TextButton(onClick = { }) {
                    Text("Guardar")
                }
            } else {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Editar"
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.LightGray, CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(nombre, style = MaterialTheme.typography.titleLarge)
        Text(email)

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(dataNacimiento)
                Text("Edad")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(genere)
                Text("Género")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(alcada)
                Text("Alçada")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(pes)
                Text("Peso")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    FitnessAppTheme {
        ProfileScreen(
            nombre = "Laia Soler",
            email = "laia.soler@exemple.com",
            dataNacimiento = "25",
            genere = "Dona",
            alcada = "165 cm",
            pes = "60 kg",
            editar = false
        )
    }
}