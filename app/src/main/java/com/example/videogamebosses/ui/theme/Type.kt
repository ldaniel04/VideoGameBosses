package com.example.videogamebosses.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.videogamebosses.R

val Macondo = FontFamily(
    Font(R.font.macondo_regular)
)
val Rubik = FontFamily(
    Font(R.font.macondo_regular)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Macondo,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Rubik,
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp
    ),
    labelLarge = TextStyle(
        fontFamily = Rubik,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Macondo,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    )
)