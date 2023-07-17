package com.example.starbucksclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import com.example.starbucksclone.R
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.IconButton
import androidx.compose.ui.Alignment
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starbucksclone.ui.theme.*

@Composable
fun Item(
    onClick: () -> Unit,
) {
    var selectedIcon by remember {
        mutableStateOf(
            false
        )
    }
    Card(
        shape = RoundedCornerShape(
            14.dp
        ),
        modifier = Modifier
            .width(
                220.dp
            )
            .fillMaxHeight()
            .padding(
                end = 10.dp
            )
            .clickable {
                onClick()
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Box(
                modifier = Modifier
                    .background(
                        LightRed_1,
                        RoundedCornerShape(
                            bottomStart = 14.dp,
                            bottomEnd = 14.dp
                        )
                    )
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .height(
                        200.dp
                    ),
                contentAlignment = Alignment
                    .Center
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable
                            .image
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .size(
                            180.dp
                        )
                )
            }
            Column(
                modifier = Modifier
                    .padding(
                        15.dp
                    )
            ) {
                Text(
                    text = stringResource(
                        id = R.string.chocolate_cappuccino
                    ),
                    style = TextStyle(
                        color = TextColor,
                        fontSize = 20.sp,
                        fontWeight = FontWeight
                            .W500
                    )
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                horizontalArrangement = Arrangement
                    .SpaceBetween
                ) {
                    Text(
                        text = stringResource(
                            id = R.string._20_00
                        ),
                        style = TextStyle(
                            color = DarkGreen,
                            fontSize = 25.sp,
                            fontWeight = FontWeight
                                .W400
                        )
                    )
                    IconButton(
                        onClick = {
                            selectedIcon = !selectedIcon
                        },
                        modifier = Modifier
                            .size(
                                24.dp
                            )
                    ) {
                        IconSymbol(
                            icon = R.drawable
                                .love,
                            tint = if(
                                selectedIcon
                            ) Red else Color
                                .Unspecified
                        )
                    }
                }
            }
        }
    }
}