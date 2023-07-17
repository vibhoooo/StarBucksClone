package com.example.starbucksclone.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starbucksclone.R

@Composable
fun Text(
) {
    Text(
        text = stringResource(
            id = R.string
                .our_way_of_loving_you_back
        ),
        style = TextStyle(
            fontSize = 25.sp,
            fontWeight = FontWeight
                .W600,
            color = Color
                .Black
        ),
        modifier = Modifier
            .padding(
                vertical = 30.dp
            )
    )
}