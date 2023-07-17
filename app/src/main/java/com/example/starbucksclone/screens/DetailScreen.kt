package com.example.starbucksclone.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.starbucksclone.components.Button
import com.example.starbucksclone.components.PDes
import com.example.starbucksclone.components.PHeader
import com.example.starbucksclone.components.ShowP
import com.example.starbucksclone.navigation.home
import com.example.starbucksclone.ui.theme.Background

@Composable
fun DetailScreen(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Background
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    20.dp
                )
        ) {
            PHeader() {
                navHostController
                    .navigate(
                        home
                    )
            }
            Spacer(
                modifier = Modifier
                    .height(
                        20.dp
                    )
            )
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                item {
                    ShowP()
                    PDes()
                    Spacer(
                        modifier = Modifier
                            .height(
                                20.dp
                            )
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Button(
                            modifier = Modifier
                                .padding(
                                    20.dp
                                )
                                .wrapContentWidth(
                                    Alignment
                                        .CenterHorizontally
                                )
                                .align(
                                    Alignment
                                        .BottomCenter
                                )
                        )
                    }
                }
            }
        }
    }
}