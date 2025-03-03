package com.example.flexapp.ui.plataforms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun PlatformListItem(platform: PlatformItemData){
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.Black)
            .padding(2.dp)
            .background(Color.White)
    ){
        Text(text = platform.name)
        Text(text = platform.address)
    }
}

@Preview
@Composable
fun PlatformListItemPreview(){
    PlatformListItem(PlatformItemData("Grupo 1", "192.168.0.0"))
}
