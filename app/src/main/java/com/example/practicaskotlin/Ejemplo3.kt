package com.example.practicaskotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.practicaskotlin.ui.theme.FirstExampleTheme


//Se escribe por defecto todo esto:
class Ejemplo3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //Sirve para iniciar un Activity
        setContent {
            //Sirve para agregar colores por defecto a lo de dentro
            FirstExampleTheme() {
                //Sirve para dar un padding por defecto y agregarlo a texto
                //e iniciarlo también.
                Scaffold() { aña ->
                    columnas(aña)
                }
            }
        }
    }
}

@Composable
fun columnas(padding: PaddingValues) {
    Column(
        modifier = Modifier.padding(padding).fillMaxSize(),
        //Define cómo se distribuyen los elementos a lo
        //largo del eje vertical. Necesita modifier
        verticalArrangement = Arrangement.SpaceAround,
        //Define cómo se distribuyen los elementos a lo
        //largo del eje horizontal. Necesita modifier
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Oli bro")
        Text(text = "Oli crack")
        Text(text = "Oli máster")
    }

}