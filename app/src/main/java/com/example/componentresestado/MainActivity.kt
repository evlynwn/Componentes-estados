package com.example.componentresestado

import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
    Column (modifier = modifier
        .fillMaxWidth()
        .background(Color(0xFFDE6B6B))
        .padding(20.dp)){

        Text(
            text = "Aulas android",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFFFFFF),
            fontFamily = FontFamily.Cursive
        )
        Text(
            text = "com Jetpack Compose",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(66,133,244),
            fontFamily = Kaushan
        )

    }
}