package com.example.flexapp.ui.Grupos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

@Composable
fun GrupoListItem(group: GrupoItemData){
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.Black)
            .padding(2.dp)
            .background(Color.White)
    ){
        Text(text = group.name)
        Text(text = "Cantidad: ${group.quantity}")
    }
}

@Preview()
@Composable
fun GrupoListItemPreview(){
    GrupoListItem(GrupoItemData("Grupo 1", 10))
}
