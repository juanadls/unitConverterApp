package com.example.unitcoverterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.unitcoverterapp.ui.theme.UnitCoverterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitCoverterAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    innerPadding ->
                   UnitConverter(modifier = innerPadding)

                }
            }
        }
    }
}

@Composable

fun UnitConverter(modifier: PaddingValues = PaddingValues()){
    Column {
        Text("Unit converter")
        OutlinedTextField(value = "Enter value", onValueChange = { })
        Row {


        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnitCoverterAppTheme {
        UnitConverter()
    }
}