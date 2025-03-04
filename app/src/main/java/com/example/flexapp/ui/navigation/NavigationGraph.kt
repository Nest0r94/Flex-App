package com.example.flexapp.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.flexapp.ui.groups.GroupCreateScreen
import com.example.flexapp.ui.groups.GruposScreen
import com.example.flexapp.ui.groups.group.GroupAcelerationScreen
import com.example.flexapp.ui.groups.group.GroupScreen
import com.example.flexapp.ui.groups.group.GroupSettingsScreen
import com.example.flexapp.ui.groups.group.GroupTestScreen

@Composable
fun NavigationGraph(
    navController: NavHostController,
    paddingValues: PaddingValues
){
    NavHost(navController, startDestination = GroupsScreen){
        composable<GroupsScreen>{
            GruposScreen(navController, paddingValues)
        }
        composable<GroupCreateScreen>{ GroupCreateScreen(navController, paddingValues) }
        composable<GroupScreen>{GroupScreen(navController, paddingValues)}
        composable<NavGroupConfiguration>{ GroupSettingsScreen(paddingValues) }
        composable<NavGroupAcelerations>{ GroupAcelerationScreen(paddingValues) }
        composable<NavGroupTest>{GroupTestScreen(paddingValues)}
    }
}