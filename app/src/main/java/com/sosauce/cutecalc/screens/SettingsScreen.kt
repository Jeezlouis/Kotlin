package com.sosauce.cutecalc.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sosauce.cutecalc.AppBar
import com.sosauce.cutecalc.components.AboutCard
import com.sosauce.cutecalc.components.History
import com.sosauce.cutecalc.components.Misc
import com.sosauce.cutecalc.components.ThemeManagement

@Composable
fun SettingsScreen(navController: NavController) {

    Scaffold(
        topBar = {
            AppBar(
                title = "Settings",
                showBackArrow = true,
                navController = navController,
            )
        },
    ) { values ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(values),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AboutCard()
            ThemeManagement()
            History()
            Misc()
        }
    }

}