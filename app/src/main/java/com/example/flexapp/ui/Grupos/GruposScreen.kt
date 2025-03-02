package com.example.flexapp.ui.Grupos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GruposScreen(paddingValues: PaddingValues){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ComposableTitle(
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )
        ComposableListGroups(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        )
        ComposableNewGroup(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}

@Preview
@Composable
fun GruposScreenPreview(){
    GruposScreen(paddingValues = PaddingValues())
}


@Composable
fun ComposableTitle(modifier: Modifier){
    Text(
        text = "Lista de grupos",
        textAlign = TextAlign.Center,
        fontSize = 32.sp,
        modifier = modifier
    )
}

@Composable
fun ComposableListGroups(modifier: Modifier){
    LazyColumn(
        modifier = modifier
    ) {
        items(grupoEjData.size){index->
            GrupoListItem(grupoEjData[index])
        }
    }
}

@Composable
fun ComposableNewGroup(modifier: Modifier){
    Button(
        modifier = modifier,
        onClick = {}
    ) { Text("Nuevo Grupo")}
}