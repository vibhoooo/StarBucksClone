package com.example.starbucksclone.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starbucksclone.Menu
import com.example.starbucksclone.ui.theme.DarkGreen
import com.example.starbucksclone.ui.theme.Gray_1
import com.example.starbucksclone.ui.theme.TextColor

@Composable
fun Chip(
    menu: Menu,
    selected: Boolean,
    modifier: Modifier = Modifier,
    onValueChange: (Int) -> Unit
) {
    TextButton(
        onClick = {
            onValueChange(
                menu
                    .id
            )
        },
        shape = RoundedCornerShape(
            22.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = if(
                selected
            ) DarkGreen else Gray_1,
            contentColor = if(
                selected
            ) Color
                .White else TextColor
        ),
        contentPadding = PaddingValues(
            15.dp
        ),
        modifier = modifier
            .padding(
                end = 10.dp
            )
    ) {
        Text(
            text = menu
                .title,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight
                    .W400
            )
        )
    }
}