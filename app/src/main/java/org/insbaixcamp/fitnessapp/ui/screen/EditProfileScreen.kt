package org.insbaixcamp.fitnessapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.insbaixcamp.fitnessapp.ui.Components.DropdownTextField
import org.insbaixcamp.fitnessapp.ui.Components.OutlinedDatePickerField

@Composable
fun EditProfileScreen() {
    var nombre by remember { mutableStateOf("Laia Soler") }
    var correo by remember { mutableStateOf("laia.soler@exemple.com") }
    var dataNaixementMillis by rememberSaveable { mutableStateOf<Long?>(null) }
    var genere by remember { mutableStateOf("Dona") }

    var objectiu by rememberSaveable { mutableStateOf("") }
    var nivell by rememberSaveable { mutableStateOf("") }

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
            Text("Editar Perfil", style = MaterialTheme.typography.headlineSmall)
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Editar",
                tint = MaterialTheme.colorScheme.primary
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.LightGray, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Cambiar foto",
                    tint = Color.DarkGray
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(onClick = { }) {
                    Text("Canviar foto")
                }
                OutlinedButton(onClick = { }) {
                    Text("Eliminar foto")
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Dades personals",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nom complet") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = correo,
            onValueChange = { correo = it },
            label = { Text("Correu electrònic") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedDatePickerField(
            label = "Data de naixement",
            selectedDateMillis = dataNaixementMillis,
            onDateSelected = { dataNaixementMillis = it },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        DropdownTextField(
            label = "Gènere",
            opcions = listOf(
                "Dona",
                "Home",
                "Altres"
            ),
            valorSeleccionat = genere,
            onValorSeleccionat = { genere = it },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Dades físiques",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        DropdownTextField(
            label = "Objectiu",
            opcions = listOf(
                "Perdre pes",
                "Guanyar massa muscular",
                "Manteniment"
            ),
            valorSeleccionat = objectiu,
            onValorSeleccionat = { objectiu = it },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        DropdownTextField(
            label = "Nivell d'activitat",
            opcions = listOf(
                "Baix",
                "Moderat",
                "Alt"
            ),
            valorSeleccionat = nivell,
            onValorSeleccionat = { nivell = it },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EditProfileScreenPreview() {
    EditProfileScreen()
}
