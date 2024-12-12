@file:Suppress("SpellCheckingInspection")

package com.example.sylvamet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.sylvamet.navigation.AppNavigation
import com.example.sylvamet.ui.theme.SylvametTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SylvametTheme {
                AppNavigation()
            }
        }
    }
}