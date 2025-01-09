@file:Suppress("SpellCheckingInspection")

package com.example.sylvamet.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.sylvamet.components.BottomNavigationBar
import com.example.sylvamet.components.DatePickerFieldToModal
import com.example.sylvamet.components.DropdownTextField


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateCubageScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                ),
                title = {
                    Text(
                        "Cubage",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "ArrowBack",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                },
            )
        },
        floatingActionButton = {
            ExtendedExample({ navController.navigate("cubage") })
        },
        bottomBar = {
            BottomNavigationBar(navController, true, false, false)
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            CubageCreationForm()
        }
    }
}

@Composable
fun CubageCreationForm() {
    DatePickerFieldToModal(
        modifier = Modifier.fillMaxWidth(),
        label = "Date de cubage*"
    )

    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { text = it },
        label = { Text("Coupe*") }
    )

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { text = it },
        label = { Text("Numéro*") }
    )

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { text = it },
        label = { Text("Description") }
    )

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        DropdownTextField("type*", listOf("Tige", "Pile"), modifier = Modifier.weight(1f))
        DropdownTextField("Ecorce*", listOf("Ecorcée", "Sur écorce"), modifier = Modifier.weight(1f))
    }

}


@Composable
fun ExtendedExample(onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = {},
        containerColor = MaterialTheme.colorScheme.primary,
        icon = { Icon(Icons.Filled.Add, "Créer") },
        text = { Text(text = "Créer") },
        shape = CircleShape,
        modifier = Modifier.height(40.dp),
    )
}