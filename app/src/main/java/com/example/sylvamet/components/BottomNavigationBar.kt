@file:Suppress("SpellCheckingInspection")

package com.example.sylvamet.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sylvamet.R

@Composable
fun BottomNavigationBar(navController: NavController, cubageSelected: Boolean, dataSelected: Boolean, martelageSelected: Boolean) {
    NavigationBar(
        modifier = Modifier
            .fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        NavigationBarItem(
            selected = cubageSelected,
            onClick = {navController.navigate("cubage")},
            icon = { Icon(
                painter = painterResource(id = R.drawable.box),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
            ) },
            label = { Text(text = "Cubage") }
        )
        NavigationBarItem(
            selected = dataSelected,
            onClick = {},
            icon = { Icon(
                painter = painterResource(id = R.drawable.file),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
            ) },
            label = { Text(text = "Données") }
        )
        NavigationBarItem(
            selected = martelageSelected,
            onClick = {navController.navigate("martelage")},
            icon = { Icon(
                painter = painterResource(id = R.drawable.hammer),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
            ) },
            label = { Text(text = "Martelage") }
        )
    }
}