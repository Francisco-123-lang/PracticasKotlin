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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableInferredTargetConstraints
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicaskotlin.ui.theme.FirstExampleTheme

class Ejemplo4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstExampleTheme {
                Scaffold() { innerPadding ->
                    Textillo(innerPadding,)
                }
            }
        }
    }
}

@Composable
fun Textillo(padding : PaddingValues) {
    Column(
        modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Green),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column (
        ) {
            Row(
            ) {
                Text(
                    text = "Hola mundo 1",
                    modifier = Modifier
                        .background(Color.White)
                        .padding(padding)
                )

                Text(
                    text = "Hola mundo 3",
                    modifier = Modifier
                        .background(Color.Blue)
                        .padding(padding)

                )
            }

            Row(
            ) {
                Text(
                    text = "Hola mundo 2",
                    modifier = Modifier
                        .background(Color.Red)
                        .padding(padding)
                )

                Text(
                    text = "Hola mundo 4",
                    modifier = Modifier
                        .background(Color.Yellow)
                        .padding(padding)
                )
            }
        }
    }
}