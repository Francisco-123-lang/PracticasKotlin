package com.example.practicaskotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicaskotlin.ui.theme.FirstExampleTheme


//EJERCICIO DE LA TAREA 2 DE ROW Y COLUMNS
class Ejercicio2Tarea : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstExampleTheme {
                Scaffold() { innerPadding ->
                    Texto(innerPadding,)
                }
            }
        }
    }
}

@Composable
fun Texto(padding: PaddingValues) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "TextView En Android",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .padding(16.dp)
        )
        Column(
            modifier = Modifier
                .padding(12.dp)
        ) {
            Text(
                text = "1. TextView",
                fontSize = 16.sp,

                )

            Text(
                text = "Nombre y apellidos",
                fontSize = 12.sp,
                color = Color.Gray,

                )
        }

        Column(
            modifier = Modifier
                .padding(12.dp)
        ) {
            Text(
                text = "2. Cambiar color",
                fontSize = 16.sp,

                )

            Text(
                text = "Texto color Material Indigo 500",
                fontSize = 12.sp,
                color = Color.Blue,

                )
        }

        Column(
            modifier = Modifier
                .padding(12.dp)
        ) {
            Text(
                text = "3. Cambiar tamaño",
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(3.dp)
            )

            Text(
                text = "Tamaño de 14sp",
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(2.dp)

            )

            Text(
                text = "Tamaño de 16sp",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(3.dp)

            )

            Text(
                text = "Tamaño de 20sp",
                fontSize = 20.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(3.dp)

            )

            Text(
                text = "Tamaño de 24sp",
                fontSize = 24.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(3.dp)

            )
        }

        Column(
            modifier = Modifier
                .padding(15.dp)
        ) {
            Text(
                text = "4. Cambiar estilo de fuente",
                fontSize = 16.sp,

                )

            Text(
                text = "Estilo normal",
                fontSize = 12.sp,
                color = Color.Gray,
            )

            Text(
                text = "Estilo en negrilla",
                fontSize = 12.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Estilo itálico",
                fontSize = 12.sp,
                color = Color.Gray,
                fontStyle = FontStyle.Italic
            )

            Text(
                text = "Estilos itálico y negrilla",
                fontSize = 12.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )
        }

        Column(
            modifier = Modifier
                .padding(15.dp)
        ) {
            Text(
                text = "5. Cambiar tipo de fuente",
                fontSize = 16.sp,
            )

            Text(
                text = "Tipo de fuente sans",
                fontSize = 12.sp,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )

            Text(
                text = "Tipo de fuente serif",
                fontSize = 12.sp,
                color = Color.Gray,
                fontFamily = FontFamily.Serif

            )

            Text(
                text = "Tipo de fuente monospace",
                fontSize = 12.sp,
                color = Color.Gray,
                fontFamily = FontFamily.Monospace
            )


        }

        Column(
            modifier = Modifier
                .padding(15.dp)
        ) {
            Text(
                text = "6. Convertir urls en links clickeables",
                fontSize = 16.sp,
            )

            Text(
                text = "https://www.w3schools.com/",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier
                    .clickable {
                        val intent = Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://www.w3schools.com")
                        )
                        context.startActivity(intent)
                    },
                textDecoration = TextDecoration.Underline
            )


        }

        Column(
            modifier = Modifier
                .padding(15.dp)
        ) {
            Text(
                text = "7. Convertir a mayúsculas",
                fontSize = 16.sp,
            )

            Text(
                text = "WWW.W3SCHOOLS.COM",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}


