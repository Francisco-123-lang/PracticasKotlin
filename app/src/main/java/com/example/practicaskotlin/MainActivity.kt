package com.example.practicaskotlin.ui.theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstExampleTheme {
                Scaffold() { innerPadding ->
                    Texts(innerPadding)
                }
            }
        }
    }
}

@Composable
fun Texts(padding: PaddingValues) {
    Column(
        //Con ROW:
        //horizontalArrangement = Arrangement.Center,
        //verticalAlignment = Alignment.CenterVertically,

        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(padding)
            .fillMaxSize()
    ) {
        Row(
            //horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    text = "1",
                    fontSize = 26.sp
                    //textAlign = TextAlign.Left,
                    //modifier = Modifier.fillMaxWidth()
                )
            }

            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = "2",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }

            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = "3",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Row(
            //horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = "4",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }

            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = "5",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }

            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = "6",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Row(
            //horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = "7",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }

            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = "8",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }

            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = "9",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Row(
            //horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .height(240.dp) // Altura de 48 dp
                    .width(140.dp) // Ancho de 200 dp
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = ".",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }

            Button(
                onClick = { /* Acción */ },
                modifier = Modifier
                    .fillMaxHeight()// Ancho de 200 dp
                    .weight(2f)
            ) {
                Text(
                    //textAlign = TextAlign.Center,
                    text = "=",
                    fontSize = 26.sp
                    //modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        fontSize = 24.sp,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstExampleTheme {
        Scaffold() { innerPadding ->
            Texts(innerPadding)
        }
    }
}