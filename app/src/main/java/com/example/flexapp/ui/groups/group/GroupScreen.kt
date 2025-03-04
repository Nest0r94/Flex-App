package com.example.flexapp.ui.groups.group

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.flexapp.ui.navigation.NavigationGroupBar
import com.example.flexapp.ui.plataforms.PlatformListItem
import com.example.flexapp.ui.plataforms.platformEjData

@Composable
fun GroupScreen(navController: NavHostController, paddingValues: PaddingValues){

    var showBar by remember { mutableStateOf(false) }

    Scaffold(
        modifier = Modifier.fillMaxSize().padding(paddingValues),
        bottomBar = {
            if(showBar) {
                NavigationGroupBar(navController = navController)
            }
        }
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ){
            Text("Plataformas del grupo")
            LazyColumn {
                items(platformEjData.size){index->
                    PlatformListItem(platformEjData[index])
                }
            }
        }
    }
}


@Preview
@Composable
fun GroupScreenPreview(){
    GroupScreen(navController = NavHostController(LocalContext.current), paddingValues = PaddingValues())
}