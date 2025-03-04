package com.example.flexapp.ui.groups.group

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.flexapp.ui.navigation.NavigationGroupBar

@Composable
fun GroupScreen(navController: NavHostController, paddingValues: PaddingValues){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { NavigationGroupBar(navController = navController) }
    ){}
}