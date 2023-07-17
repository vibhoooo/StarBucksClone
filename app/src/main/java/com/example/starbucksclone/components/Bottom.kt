package com.example.starbucksclone.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import com.example.starbucksclone.R
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starbucksclone.ui.theme.DarkGreen
import com.example.starbucksclone.ui.theme.TextColor

@Composable
fun Bottom(
    onClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(
                top = 20.dp
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalArrangement = Arrangement
                .SpaceBetween
        ) {
            Text(
                text = stringResource(
                    id = R.string.popular
                ),
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight
                        .W500,
                    color = TextColor
                )
            )
            Text(
                text = stringResource(
                    id = R.string.see_all
                ),
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight
                        .W500,
                    color = DarkGreen
                )
            )
        }
        Spacer(
            modifier = Modifier
                .height(
                    20.dp
                )
        )
        LazyRow(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            items(
                5
            ) {
                Item(
                ) {
                    onClick()
                }
            }
        }
    }
}