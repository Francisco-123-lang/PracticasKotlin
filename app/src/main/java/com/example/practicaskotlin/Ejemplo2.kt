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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.example.practicaskotlin.ui.theme.FirstExampleTheme

//Se escribe por defecto todo esto:
class Ejemplo2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //Sirve para iniciar un Activity
        setContent {
            //Sirve para agregar colores por defecto a lo de dentro
            FirstExampleTheme() {
                //Sirve para dar un padding por defecto y agregarlo a texto
                //e iniciarlo también.
                Scaffold() {aña ->
                    Textito(aña)
                }
            }
        }
    }
}
//Hasta aquí. Lo demás son las UI(@) y eso hazlo como quieras.

//Podemos crear un estilo y luego agregarlo al Texto.
val miEstiloAzul = TextStyle(
    fontSize = 40.sp,//Tamaño letra
    color = Color.Blue, //Color letra
    fontWeight = FontWeight.Bold, //Negrita
)
@Composable
fun Textito(padding: PaddingValues) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,

        // modifier: Permite aplicar modificaciones como
        // tamaño, padding, o bordes a la columna.
        modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(
            //Esto no hace falta si ya en el ui.theme agregamos
            //las características de letras(en este caso noup).
            text = "Qué Pasha",
            fontSize = 24.sp,//Tamaño letra
            color = Color.Red, //Color letra
            fontWeight = FontWeight.Bold, //Negrita


            //Esto dos no hacen falta si ya centramos la columna
            textAlign = TextAlign.Center, //Centrar texto arriba
            modifier = Modifier.fillMaxWidth() //Ayuda para centrarlo
            )

        Text(
            //Esto no hace falta si ya en el ui.theme agregamos
            //las características de letras(en este caso noup).
            text = "Prueba2",
            style = miEstiloAzul
            )

        Text(
            text = "Este texto es muy largo o sea que no creo que quepa en una línea",
            //Líneas que quieres que pueda tener el texto
            maxLines = 3,
            //Si el texto no cabe en la pantalla pues agregar "..." al final
            overflow = TextOverflow.Ellipsis
        )
    }
}
