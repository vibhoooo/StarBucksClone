package com.example.starbucksclone.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.starbucksclone.R

@Composable
fun Header(
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement
            .SpaceBetween
    ) {
        Icon(
            icon = R.drawable
                .menu
        )
        Logo(
            size = 58.dp
        )
        Icon(
            icon = R.drawable
                .bag
        )
    }
}