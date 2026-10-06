package com.example.practicaskotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.practicaskotlin.ui.theme.FirstExampleTheme

class Ejemplo1 : ComponentActivity() {
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
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(
            text = "Hello Paco!",
            //textAlign = TextAlign.Center,
            fontSize = 24.sp,
            //modifier = Modifier.fillMaxWidth()
        )


        Text(
            //textAlign = TextAlign.Center,
            text = "Hello Word",
            fontSize = 26.sp,
            //modifier = Modifier.fillMaxWidth()
        )
    }
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