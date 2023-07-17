package com.example.starbucksclone.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.starbucksclone.R

@Composable
fun PHeader(
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement
            .SpaceBetween
    ) {
        Icon(
            icon = R.drawable
                .back,
        ) {
            onClick()
        }
        Logo(
            size = 55.dp
        )
        Icon(
            icon = R.drawable
                .love
        )
    }
}