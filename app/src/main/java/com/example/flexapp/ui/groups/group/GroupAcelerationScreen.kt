package com.example.flexapp.ui.groups.group

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun GroupAcelerationScreen(paddingValues: PaddingValues){
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .background(Color.Green)
    )
    {
        Text(text = "Acelerations", modifier = Modifier.padding(paddingValues), fontSize = 24.sp)
    }
}