package com.example.flexapp.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.flexapp.R

@Composable
fun NavigationGroupBar(navController: NavHostController) {
    androidx.compose.material3.NavigationBar(windowInsets = NavigationBarDefaults.windowInsets) {
        NavigationBarItem(
            selected = true,
            onClick = { navController.navigate(NavGroupConfiguration) },
            icon = { Icon(painterResource(R.drawable.ic_settings_24), null) },
            label = { Text("Configuración") }
        )
        NavigationBarItem(
            selected = true,
            onClick = { navController.navigate(NavGroupAcelerations) },
            icon = { Icon(painterResource(R.drawable.ic_settings_24), null) },
            label = { Text("Aceleraciones") }
        )
        NavigationBarItem(
            selected = true,
            onClick = { navController.navigate(NavGroupTest) },
            icon = { Icon(painterResource(R.drawable.ic_settings_24), null) },
            label = { Text("Ensayos") }
        )
    }
}