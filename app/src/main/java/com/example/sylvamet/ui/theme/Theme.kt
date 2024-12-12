package com.example.sylvamet.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF934B00),
    primaryContainer = Color(0xFFEA8F45),
    outlineVariant = Color(0xFFDAC2B3),
    surfaceContainerHigh = Color(0xFFF5E5DC),
    onSurface = Color(0xFF221A15),
    onSurfaceVariant = Color(0xFF544338),
    surfaceContainerLow = Color(0xFFFFF1E9),
    onError = Color(0xFFFFFFFF),
    onPrimary = Color(0xFFFFFFFF),
    outline = Color(0xFF877366),
    surface = Color(0xFFFFF8F5),
    secondaryContainer = Color(0xFFFFD1B2),
    surfaceContainer = Color(0xFFFBEBE1),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    inverseOnSurface = Color(0xFFFEEEE4),
    onPrimaryContainer = Color(0xFF000000),
    surfaceContainerHighest = Color(0xFF3C332D),
    inverseSurface = Color(0xFF382F29),
    onSecondaryContainer = Color(0xFF5E3B1F),
    inversePrimary = Color(0xFFFFB782),
)

@Composable
fun SylvametTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}