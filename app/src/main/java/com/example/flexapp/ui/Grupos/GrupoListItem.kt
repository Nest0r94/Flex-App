package com.example.flexapp.ui.Grupos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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
            .padding(2.dp)
            .background(Color.Black)
            .padding(2.dp)
            .background(Color.White)
            .fillMaxWidth()
    ){
        Text(text = group.name, color = Color.Black)
        Text(text = "Cantidad: ${group.quantity}", color = Color.Black)
    }
}

@Preview
@Composable
fun GrupoListItemPreview(){
    GrupoListItem(GrupoItemData("Grupo 1", 10))
}
