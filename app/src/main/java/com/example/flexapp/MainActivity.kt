package com.example.flexapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.flexapp.ui.Grupos.GruposScreen
import com.example.flexapp.ui.theme.FlexAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlexAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GruposScreen(innerPadding)
                }
            }
        }
    }
}