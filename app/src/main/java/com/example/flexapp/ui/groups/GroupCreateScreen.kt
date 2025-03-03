package com.example.flexapp.ui.groups

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GroupCreateScreen(){
    var groupName by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ComposableGroupName(
            onValueChange = { groupName = it }
        )

        ComposableListDispDetected(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxHeight(0.3f)
        )

        ComposableListDispConfigurated(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxHeight(0.3f)
                .weight(1f)
        )

        // Botón para crear el grupo
        Button(
            onClick = {},

            /*modifier = Modifier
                .weight(1f)*/
        ){
            Text("Crear Grupo")
        }
    }
}

@Preview
@Composable
fun GroupCreateScreenPreview(){
    GroupCreateScreen()
}




@Composable
fun ComposableGroupName(
    onValueChange: (String) -> Unit
){
    Row{
        TextField(
            onValueChange = { onValueChange(it) },
            value = "",
            label = { Text("Nombre del grupo") }
        )
    }
}


@Composable
fun ComposableListDispDetected(modifier: Modifier){
    Column(
        modifier = modifier
    ){
        Text("Lista de dispositivos detectados")
        LazyColumn{
            items(grupoEjData.size){index->
                GrupoListItem(grupoEjData[index])
            }
        }
    }
}


@Composable
fun ComposableListDispConfigurated(modifier: Modifier){
    Column(
        modifier = modifier
    ){
        Text("Lista de dispositivos configurados")
        LazyColumn{
            items(grupoEjData.size) { index ->
                GrupoListItem(grupoEjData[index])
            }
        }
    }
}