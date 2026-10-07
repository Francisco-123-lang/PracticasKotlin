package com.example.practicaskotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
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
        //modifier: Permite aplicar modificaciones como
        //tamaño, padding, o bordes a la columna.
        modifier = Modifier.padding(padding).fillMaxSize(),
        //Define cómo se distribuyen los elementos a lo
        //largo del eje vertical. Necesita modifier
        verticalArrangement = Arrangement.SpaceEvenly,
        //Define cómo se distribuyen los elementos a lo
        //largo del eje horizontal. Necesita modifier
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Oli bro")
        Text(text = "Oli crack")
        Text(text = "Oli máster")
    }

    Row(

        modifier = Modifier
            .padding(padding)
            .fillMaxSize(),
        //Este último es igual a:
        //.fillMaxWidth()
        //.fillMaxHeight()
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "adieu bro")
        Text(
            text= "bye bro",
            color = Color.Red)
        Text(
            text = "chao máster",
            fontWeight = FontWeight.Bold)
    }

}