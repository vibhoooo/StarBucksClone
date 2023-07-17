package com.example.starbucksclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starbucksclone.R
import com.example.starbucksclone.ui.theme.DarkGreen
import com.example.starbucksclone.ui.theme.LightRed_1
import com.example.starbucksclone.ui.theme.TextColor

@Composable
fun ShowP(
) {
    var counter by remember {
        mutableStateOf(0)
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                LightRed_1,
                RoundedCornerShape(
                    14.dp
                )
            ),
        contentAlignment = Alignment
            .Center
    ) {
        Column(
            modifier = Modifier
                .padding(
                    vertical = 20.dp
                )
                .fillMaxWidth(),
        horizontalAlignment = Alignment
            .CenterHorizontally
        ){
            Image(
                painter = painterResource(
                    id = R.drawable
                        .image,
                ),
                contentDescription = "",
                modifier = Modifier
                    .size(
                        200.dp
                    )
            )
            Spacer(
                modifier = Modifier
                    .height(
                        20.dp
                    )
            )
            Box(
                modifier = Modifier
                    .background(
                        Color
                            .White,
                        RoundedCornerShape(
                            20.dp
                        )
                    )
            ) {
                Row(
                ) {
                    Icon(
                        icon = R.drawable
                            .plus,
                        background = DarkGreen
                    ) {
                        ++counter
                    }
                    Spacer(
                        modifier = Modifier
                            .width(
                                10.dp
                            )
                    )
                    Text(
                        text = "$counter",
                        style = TextStyle(
                            fontSize = 25.sp,
                            fontWeight = FontWeight.W500,
                            color = TextColor
                        ),
                        modifier = Modifier
                            .align(
                                CenterVertically
                            )
                    )
                    Spacer(
                        modifier = Modifier
                            .width(
                                10.dp
                            )
                    )
                    Icon(
                        icon = R.drawable
                            .minus,
                        background = DarkGreen
                    ) {
                        if(counter > 0) {
                            --counter
                        }
                    }
                }
            }
        }
    }
}