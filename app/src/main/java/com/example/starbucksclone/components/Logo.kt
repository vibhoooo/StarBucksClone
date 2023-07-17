package com.example.starbucksclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.starbucksclone.R

@Composable
fun Logo(
    modifier: Modifier = Modifier,
    size: Dp = 155.dp
    ) {
    Image(
        painter = painterResource(
            id = R.drawable
                .logo
        ),
        contentDescription = "",
        modifier = modifier
            .size(
                size = size
            )
    )
}