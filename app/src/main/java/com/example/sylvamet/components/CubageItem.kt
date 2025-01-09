@file:Suppress("SpellCheckingInspection")

package com.example.sylvamet.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.sylvamet.R

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