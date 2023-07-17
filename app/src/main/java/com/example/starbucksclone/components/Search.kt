package com.example.starbucksclone.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starbucksclone.R
import com.example.starbucksclone.ui.theme.DarkGray_1
import com.example.starbucksclone.ui.theme.DarkGreen

@Composable
fun Search(
    text: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = text,
        onValueChange = onValueChange,
        modifier = modifier
            .fillMaxWidth(),
        placeholder = {
            Text(
                text = stringResource(
                    id = R.string
                        .search
                ),
                style = TextStyle(
                    color = DarkGray_1,
                    fontSize = 16.sp,
                    fontWeight = FontWeight
                        .W400
                )
            )
        },
        leadingIcon = {
            Icon(
                icon = R.drawable
                    .search
            )
        },
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction
                .Done
        ),
        singleLine = true,
        shape = RoundedCornerShape(
            26.5.dp
        ),
        colors = TextFieldDefaults
            .colors(
            focusedIndicatorColor = Color
                .Transparent,
            unfocusedIndicatorColor = Color
                .Transparent,
            cursorColor = DarkGreen
        )
    )
}