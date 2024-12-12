@file:Suppress("SpellCheckingInspection")


package com.example.sylvamet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sylvamet.ui.theme.SylvametTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SylvametTheme {
                CubageScreen(
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CubageScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                ),
                title = {
                    Text(
                        "Cubages",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Localized description",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Localized description",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                },
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Handle new cubage action */ },
                containerColor = MaterialTheme.colorScheme.secondaryContainer
            ) {
                Icon(
                    imageVector = Icons.Default.Add, contentDescription = "New Cubage",
                    tint = MaterialTheme.colorScheme.onSecondaryContainer
                )
            }
        },
        bottomBar = {
            BottomNavigationBar()
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            items(12) { // Dynamically generate CubageItems for demonstration
                CubageItem(coupeNumber = 192)
            }
        }
    }
}

@Composable
fun CubageItem(coupeNumber: Int, date: String = "28 Juin, 2024") {
    ListItem(
        headlineContent = { Text("Coupe Avanche") },
        supportingContent = { Text(date) },
        leadingContent = {
            Image(
                painter = painterResource(id = R.drawable.placeholder),
                contentDescription = "Localized description",
                modifier = Modifier.size(60.dp)
            )
        },
        trailingContent = { Text(coupeNumber.toString()) }
    )
    HorizontalDivider()
}

@Composable
fun BottomNavigationBar() {
    NavigationBar(
        modifier = Modifier
            .fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { /* Handle Organiser action */ },
            icon = { Icon(
                painter = painterResource(id = R.drawable.box),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
            ) },
            label = { Text(text = "Cubage") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /* Handle Cubage action */ },
            icon = { Icon(
                painter = painterResource(id = R.drawable.file),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
            ) },
            label = { Text(text = "Données") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /* Handle Martelage action */ },
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

@Preview
@Composable
fun PreviewCubagesScreen() {
    CubageScreen()
}