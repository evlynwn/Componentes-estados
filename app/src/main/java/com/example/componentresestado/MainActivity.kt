package com.example.componentresestado

import android.R.attr.checked
import android.R.attr.contentDescription
import android.R.attr.text
import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var textoInput by remember {
        mutableStateOf("")
    }
    var quantidade by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var kotlin by remember {
        mutableStateOf(false)
    }
    var jetCompose by remember {
        mutableStateOf(false)
    }
    var android by remember {
        mutableStateOf(false)
    }
    var sistemaSelecionado by remember {
        mutableStateOf(0)
    }
    var corFundo by remember {
        mutableStateOf(Color(0xDCDE6B6B))
    }
    var favoritado by remember {
        mutableStateOf(false)
    }
    Column (modifier = modifier
        .fillMaxWidth()
        .background(corFundo)
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
            value = textoInput,
            onValueChange = {
                novoValor -> Log.i("teste", novoValor)

                textoInput = novoValor
            },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words),
            label = {
                Text(text = "Nome e sobrenome")
            }
        )
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = quantidade,
            onValueChange = {
                novoValor -> quantidade = novoValor

            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = {
                Text( text = "Qual a quantidade?")
            },
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Blue,
                unfocusedTextColor = Color.Red,
                unfocusedPlaceholderColor = Color.Magenta
            ),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Imagem de pessoa",
                    tint = Color(66, 133, 244)
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Ícone pessoa",
                    tint = Color(66, 133, 244)
                )
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text( text = "Email")
            },
            placeholder = {
                Text( text = "Digite seu email")
            },
            shape = RoundedCornerShape(
                topStart = 32.dp,
                bottomEnd = 32.dp
            ),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.Red
            )
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = kotlin,
                onCheckedChange = {kotlin = it},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Blue,
                    uncheckedColor = Color.Red
                )
            )

            Text(text = "Kotlin")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = jetCompose,
                onCheckedChange = {jetCompose = it},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Blue,
                    uncheckedColor = Color.Red
                )
            )

            Text(text = "Jetpack Compose")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = android,
                onCheckedChange = {android = it},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Blue,
                    uncheckedColor = Color.Red
                )
            )
            Text(text = "Android")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = sistemaSelecionado == 0,
                onClick = {sistemaSelecionado = 0}
            )
            Text(text = "Mac0s")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = sistemaSelecionado == 1,
                onClick = {sistemaSelecionado = 1}
            )
            Text(text = "Windows")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = sistemaSelecionado == 2,
                onClick = {sistemaSelecionado = 2}
            )
            Text(text = "Linux")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = {
                    corFundo = Color.Red},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.Green,
                ),
                border = BorderStroke(4.dp, Color.Red),
                shape = RoundedCornerShape(topEnd = 12.dp, bottomStart = 12.dp)
            ) {
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "Star")
                Text(text = "Clique aqui")
            }
        }
        OutlinedButton(
            onClick = {
                corFundo = Color.Cyan
            },
        ) {
            Text("Outro botão")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            if (favoritado){
            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .clickable{
                        favoritado = false
                    },
                imageVector = Icons.Default.Favorite,
                contentDescription = "Favorite Icon"
                )
            }else {
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .clickable{
                            favoritado = true},
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite Border Icon"
                )
            }
        }

    }
}

@Composable
fun BasicComponenteScreen(modifier: Modifier = Modifier){
    val textFieldValue = remember {
        mutableStateOf("")
    }
}