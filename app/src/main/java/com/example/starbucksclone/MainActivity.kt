package com.example.starbucksclone

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.starbucksclone.navigation.Navigation
import com.example.starbucksclone.ui.theme.StarBucksCloneAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StarBucksCloneAppTheme {
                Navigation()
            }
        }
    }
}