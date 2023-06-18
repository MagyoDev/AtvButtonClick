package com.example.vagabond

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vagabond.ui.theme.VagabondTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    VagabondTheme {
        var contador by remember {
            mutableStateOf(0)
        }
        Column() {
            Button(onClick = {
                contador = contador + 1
                Log.i("#### NOSSO_LOG", "Valor do contador = $contador")
            }) {
                Text(text = "Incrementador Contador")
            }
            Text(text = "Valor do contador = $contador")
            Text(text = "Nome: Alan de Lima Silva")
            Text(text = "RM: 22311")
        }
        Log.i("#### NOSSO_LOG", "Valor do contador = $contador")
    }
}


@Preview(showBackground = true)
@Composable
fun VagabondPreview() {
    MainScreen()
}
