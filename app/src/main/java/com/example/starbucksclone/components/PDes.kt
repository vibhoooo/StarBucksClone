package com.example.starbucksclone.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starbucksclone.R
import com.example.starbucksclone.ui.theme.DarkGreen
import com.example.starbucksclone.ui.theme.Gray400_1

@Composable
fun PDes(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                vertical = 15.dp
            )
    ) {
        Text(
            text = stringResource(
                id = R.string
                    .coffee
            ),
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.W500,
                color = DarkGreen
            )
        )
        Row(
            modifier = modifier
                .fillMaxWidth()
        ) {
            Text(
                text = stringResource(
                    id = R.string
                        .chocolate_cappuccino
                ),
                style = TextStyle(
                    fontSize = 22.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.W500,
                ),
                modifier = Modifier
                    .weight(
                        0.8f
                    )
            )
            Row(
                modifier = Modifier
                    .weight(
                        0.2f
                    )
            ) {
                IconSymbol(
                    icon = R.drawable
                        .star,
                    size = 20.dp,
                    modifier = Modifier
                        .align(
                            CenterVertically
                        )
                )
                Spacer(
                    modifier = Modifier
                        .width(
                            5.dp
                        )
                )
                Text(
                    text = stringResource(
                        id = R.string
                            ._4_5
                    ),
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Gray400_1,
                        fontWeight = FontWeight.W400,
                    ),
                )
            }
        }
        Spacer(
            modifier = modifier
                .height(
                    15.dp
                )
        )
        Text(
            text = stringResource(
                id = R.string
                    .lorem_ipsum_dolor_sit_amet_consectetur_adipiscing_elit_etiam_at_mi_vitae_augue_feugiat_scelerisque_in_a_eros
            ),
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.W400,
                color = Gray400_1
            )
        )
    }
}