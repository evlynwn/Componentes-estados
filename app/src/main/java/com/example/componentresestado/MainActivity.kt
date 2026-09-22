package com.example.componentresestado

import android.R.attr.text
import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.componentresestado.ui.theme.ComponentresEstadoTheme
import com.example.componentresestado.ui.theme.Kaushan

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponentresEstadoTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    BacicComponentesScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun BacicComponentesScreen(modifier: Modifier = Modifier) {
    var textoInput = remember {
        mutableStateOf("Android")
    }
    val quantidade = remember {
        mutableStateOf("")
    }
    Column (modifier = modifier
        .fillMaxWidth()
        .background(Color(0xDCDE6B6B))
        .padding(20.dp)){

        Text(
            text = "Aulas android",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF897CA8),
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.End,
            letterSpacing = 4.sp
        )
        Text(
            text = "com Jetpack Compose",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(255,200,244),
            fontFamily = Kaushan,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF8B72B7)),
            value = textoInput.value,
            onValueChange = {
                novoValor -> Log.i("teste", novoValor)

                textoInput.value = novoValor
            },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words),
            label = {
                Text(text = "Nome e sobrenome")
            }
        )
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = quantidade.value,
            onValueChange = { novoValor ->
                quantidade.value = novoValor
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = {
                Text(text = "Qual a quantidade?")
            }
        )
    }
}
@Composable
fun BasicComponenteScreen(modifier: Modifier = Modifier){
    val textFieldValue = remember {
        mutableStateOf("")
    }
}