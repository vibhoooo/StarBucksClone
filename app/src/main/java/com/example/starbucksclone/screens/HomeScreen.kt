package com.example.starbucksclone.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.starbucksclone.R
import com.example.starbucksclone.components.*
import com.example.starbucksclone.menuList
import com.example.starbucksclone.navigation.detail
import com.example.starbucksclone.ui.theme.Background
import com.example.starbucksclone.ui.theme.DarkGreen
import com.example.starbucksclone.ui.theme.Red

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {
    var search by remember {
        mutableStateOf(
            ""
        )
    }
    var selected by remember {
        mutableStateOf(
            1
        )
    }
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
            Header()
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                item {
                    Text()
                    Box(
                    ) {
                        Search(
                            text = search,
                            onValueChange = {
                                search = it
                            }
                        )
                        Icon(
                            icon = R.drawable
                                .filter,
                            background = DarkGreen,
                            modifier = Modifier
                                .align(
                                    Alignment
                                        .TopEnd
                                )
                                .size(
                                    55.dp,
                                )
                        )
                    }
                    Spacer(
                        modifier = Modifier
                            .height(20.dp)
                    )
                    LazyRow(
                        modifier = Modifier
                            .padding(
                                vertical = 20.dp
                            )
                    ) {
                        items(
                            menuList,
                            key = {
                            it
                                .id
                        }
                        ) {
                            Chip(
                                menu = it,
                                selected = it
                                    .id == selected
                            ) { data ->
                                selected = data
                            }
                        }
                    }
                    Bottom(
                    ) {
                        navHostController
                            .navigate(
                                detail
                            )
                    }
                }
            }
        }
    }
}
