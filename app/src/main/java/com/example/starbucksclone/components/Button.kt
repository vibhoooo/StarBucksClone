package com.example.starbucksclone.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.starbucksclone.R
import com.example.starbucksclone.ui.theme.DarkGreen

@Composable
fun Button(
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {
        },
        modifier = modifier
            .fillMaxWidth(),
        colors = ButtonDefaults
            .buttonColors(
                contentColor = Color
                    .White,
                containerColor = DarkGreen
            ),
        shape = RoundedCornerShape(
            37.dp
        ),
        contentPadding = PaddingValues(
            vertical = 15.dp
        ),
        elevation = ButtonDefaults
            .buttonElevation(
                0.dp
            )
    ) {
        Text(
            text = stringResource(
                id = R.string
                    .add_to_bag
            ),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight
                    .W500
            )
        )
    }
}